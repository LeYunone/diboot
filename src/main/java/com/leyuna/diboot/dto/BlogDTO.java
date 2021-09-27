package com.leyuna.diboot.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.diboot.core.binding.annotation.BindEntity;
import com.diboot.core.binding.annotation.BindField;
import com.leyuna.diboot.entry.Type;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author pengli
 * @date 2021-09-27
 */
@Getter
@Setter
public class BlogDTO{

    @BindField(entity = Type.class,field = "type_name",condition = "this.type=id")
    private String typeName;

    @BindEntity(entity = Type.class,condition = "this.test=type_name AND this.count =use_count")
    private Type typeBean;

    private Integer id;

    private Integer count=0;

    private String test="测试分类添加";

    /**
     * 标题
     */
    private String title;

    /**
     * 发布时间
     */
    private LocalDateTime createTime;

    /**
     * 点击量
     */
    private Integer clickCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 内容
     */
    private String blogContent;

    /**
     * 分类
     */
    private Integer type;

    /**
     * 标签
     */
    private String tag;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 备注前言
     */
    private String remarks;

}
