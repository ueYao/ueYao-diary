package me.xueyao.ueyaodiary.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.xueyao.ueyaodiary.base.R;
import me.xueyao.ueyaodiary.domain.dto.DiaryAddDto;
import me.xueyao.ueyaodiary.domain.dto.DiaryUpdateDto;
import me.xueyao.ueyaodiary.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Simon.Xue
 * @date 2023/11/30 01:02
 **/
@Api(tags = "日记")
@RequestMapping("/diary")
@RestController
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    /**
     * 添加日记
     * @param diaryAddDto 添加对象
     * @return 返回对象
     */
    @ApiOperation(value = "添加日记")
    @PostMapping("/add")
    public R add(@RequestBody DiaryAddDto diaryAddDto) {
        return diaryService.add(diaryAddDto);
    }

    /**
     * 更新日记
     * @param diaryUpdateDto 更新对象
     * @return 更新返回对象
     */
    @ApiOperation(value = "更新日记")
    @PutMapping("/update")
    public R update(@RequestBody DiaryUpdateDto diaryUpdateDto) {
        return diaryService.update(diaryUpdateDto);
    }

    /**
     * 删除日记
     * @param diaryId 日记ID
     * @return 删除返回对象
     */
    @ApiOperation(value = "删除日记")
    @DeleteMapping("/remove")
    public R remove(@RequestParam("diaryId") Integer diaryId) {
        return diaryService.remove(diaryId);
    }

    /**
     * 获取日记详情
     * @param diaryId 日记ID
     * @return 日记详情
     */
    @ApiOperation(value = "获取日记详情")
    @GetMapping("/getDetail")
    public R getDetail(@RequestParam("diaryId") Integer diaryId) {
        return diaryService.getDetail(diaryId);
    }


}
