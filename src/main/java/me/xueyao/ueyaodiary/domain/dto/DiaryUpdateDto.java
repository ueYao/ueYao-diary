package me.xueyao.ueyaodiary.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 日记内容
 * @author Simon.Xue
 * @date 2023-11-30 01:01:19
 **/
@ApiModel
@Data
@Accessors(chain = true)
public class DiaryUpdateDto implements Serializable {

    private Integer id;
    /**
     * 日记内容
     */
    @ApiModelProperty(value = "日记内容")
    private String content;
    /**
     * 选择时间
     */
    @ApiModelProperty(value = "选择时间")
    private LocalDateTime changeTime;

    /**
     * 是否隐藏
     * true 隐藏
     * false 不隐藏
     */
    @ApiModelProperty(value = "是否隐藏 true 隐藏 false 不隐藏")
    private Boolean hidden;
    /**
     * 是否删除
     * true 删除
     * false 不删除
     */
    @ApiModelProperty(value = "是否删除 true 删除 false 不删除")
    private Boolean deleted;

}
