package com.yulj.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Classname User
 * @Description <h1>系统用户表实体对象</h1>
 * @Author yulj
 * @Date 2022/01/30 22:16
 */
@Data
@TableName("tab_user")
@Accessors(chain = true)
public class User {
    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     *
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     *
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 是否删除 1删除 0未删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

}