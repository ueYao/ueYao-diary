package me.xueyao.ueyaodiary.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 日记内容
 * @author Simon.Xue
 * @date 2023-11-30 01:01:19
 **/
@ApiModel
@Data
@Accessors(chain = true)
public class DiaryAddDto implements Serializable {
    private Integer id;
    /**
     * 日记内容
     */
    @ApiModelProperty(value = "日记内容")
    private String content;
    /**
     * 选择日期
     */
    @ApiModelProperty(value = "选择日期")
    private String changeDate;



}
