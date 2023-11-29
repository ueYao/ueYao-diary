package me.xueyao.ueyaodiary.domain.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 日记内容
 * @author Simon.Xue
 * @date 2023/11/27 20:46
 **/
@ApiModel
@Data
@Entity
@Table(name = "diary")
@Accessors(chain = true)
public class Diary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int not null auto_increment")
    private Integer id;
    /**
     * 日记内容
     */
    @Column(name = "content", columnDefinition = "text not null comment '内容'")
    private String content;
    /**
     * 选择日期
     */
    @Column(name = "change_date", columnDefinition = "varchar default '' comment '选择日期'")
    private String changeDate;
    /**
     * 创建者
     */
    @Column(name = "creator", columnDefinition = "varchar(64) not null comment '创建者'")
    private String creator;
    /**
     * 创建时间
     */
    @Column(name = "create_time", columnDefinition = "datetime default current_timestamp comment '创建时间'")
    private LocalDateTime creatDate;
    /**
     * 更新者
     */
    @Column(name = "updater", columnDefinition = "varchar(64) not null comment '更新者'")
    private String updater;
    /**
     * 更新时间
     */
    @Column(name = "update_time", columnDefinition = "datetime default current_timestamp comment '更新时间'")
    private LocalDateTime updateDate;
    /**
     * 是否隐藏
     * true 隐藏
     * false 不隐藏
     */
    @Column(name = "hidden", columnDefinition = "boolean default false comment '是否隐藏 true 隐藏 false 不隐藏'")
    private Boolean hidden;
    /**
     * 是否删除
     * true 删除
     * false 不删除
     */
    @Column(name = "deleted", columnDefinition = "boolean default false comment '是否删除 true 删除 false 不删除'")
    private Boolean deleted;

}
