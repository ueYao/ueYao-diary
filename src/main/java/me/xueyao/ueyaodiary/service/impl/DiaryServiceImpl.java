package me.xueyao.ueyaodiary.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import me.xueyao.ueyaodiary.base.R;
import me.xueyao.ueyaodiary.domain.dto.DiaryAddDto;
import me.xueyao.ueyaodiary.domain.dto.DiaryUpdateDto;
import me.xueyao.ueyaodiary.domain.entity.Diary;
import me.xueyao.ueyaodiary.domain.vo.DiaryVo;
import me.xueyao.ueyaodiary.repository.DiaryRepository;
import me.xueyao.ueyaodiary.service.DiaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Simon.Xue
 * @date 2023/11/30 01:11
 **/
@Slf4j
@Service
public class DiaryServiceImpl implements DiaryService {

    @Resource
    private DiaryRepository diaryRepository;

    @Override
    public R add(DiaryAddDto diaryAddDto) {
        Assert.notNull(diaryAddDto, "Diary对象不能为空");
        log.info("开始添加日记");
        Diary diary = BeanUtil.copyProperties(diaryAddDto, Diary.class);
        Diary save = diaryRepository.save(diary);
        log.info("成功添加日记, diary = {}", save);
        return R.ofSuccess("添加成功");
    }

    @Override
    public R update(DiaryUpdateDto diaryUpdateDto) {
        Assert.notNull(diaryUpdateDto, "Diary对象不能为空");
        log.info("开始更新日记");
        Integer diaryId = diaryUpdateDto.getId();
        Assert.notNull(diaryId, "Diary Id不能为空");
        Diary diary = diaryRepository.getById(diaryId);
        if (ObjectUtil.isNull(diary)) {
            log.warn("日记不存在，id = {}", diaryId);
            return R.ofParamError("数据不合法");
        }
        diary = BeanUtil.copyProperties(diaryUpdateDto, Diary.class);
        diaryRepository.save(diary);
        log.info("成功更新日记");
        return R.ofSuccess("更新成功");
    }

    @Override
    public R remove(Integer diaryId) {
        Assert.notNull(diaryId, "参数不合法");
        log.info("开始删除日记， id = {}", diaryId);
        diaryRepository.deleteById(diaryId);
        log.info("成功删除日记");
        return R.ofSuccess("删除成功");
    }

    @Override
    public R getDetail(Integer diaryId) {
        Assert.notNull(diaryId, "参数不合法");
        log.info("开始查询日记详情，id = {}", diaryId);
        Diary diary = diaryRepository.getById(diaryId);
        if (ObjectUtil.isNull(diary)) {
            log.info("查询日记详情为空");
            return R.ofSuccess("查询成功");
        }
        DiaryVo diaryVo = BeanUtil.copyProperties(diary, DiaryVo.class);
        log.info("查询日记详情，diaryVo = {}", diaryVo);
        return R.ofSuccess("查询成功", diaryVo);
    }
}
