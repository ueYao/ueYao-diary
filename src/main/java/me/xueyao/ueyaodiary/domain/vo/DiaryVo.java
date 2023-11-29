package me.xueyao.ueyaodiary.domain.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 日记内容
 * @author Simon.Xue
 * @date 2023-11-30 00:59:49
 **/
@ApiModel
@Data
@Accessors(chain = true)
public class DiaryVo implements Serializable {

    private Integer id;
    /**
     * 日记内容
     */
    private String content;
    /**
     * 选择时间
     */
    private LocalDateTime changeTime;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 创建时间
     */
    private LocalDateTime creatDate;
    /**
     * 更新者
     */
    private String updater;
    /**
     * 更新时间
     */
    private LocalDateTime updateDate;
    /**
     * 是否隐藏
     * true 隐藏
     * false 不隐藏
     */
    private Boolean hidden;
    /**
     * 是否删除
     * true 删除
     * false 不删除
     */
    private Boolean deleted;

}
