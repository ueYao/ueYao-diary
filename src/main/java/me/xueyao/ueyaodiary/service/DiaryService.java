package me.xueyao.ueyaodiary.service;

import me.xueyao.ueyaodiary.base.R;
import me.xueyao.ueyaodiary.domain.dto.DiaryAddDto;
import me.xueyao.ueyaodiary.domain.dto.DiaryUpdateDto;

/**
 * @author Simon.Xue
 * @date 2023/11/30 01:03
 **/
public interface DiaryService {
    /**
     * 添加日记
     * @param diaryAddDto 添加对象
     * @return 返回对象
     */
    R add(DiaryAddDto diaryAddDto);

    /**
     * 修改日记
     * @param diaryUpdateDto 修改对象
     * @return 返回对象
     */
    R update(DiaryUpdateDto diaryUpdateDto);

    /**
     * 删除日记
     * @param diaryId  日记ID
     * @return 返回对象
     */
    R remove(Integer diaryId);

    /**
     * 获得详情
     * @param diaryId 日记ID
     * @return 日记详情
     */
    R getDetail(Integer diaryId);
}
