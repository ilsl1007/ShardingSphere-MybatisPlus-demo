package com.yulj.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Classname SysDept
 * @Description <h1>系统部门表实体对象</h1>
 * @Author yulj
 * @Date 2022/01/30 22:15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 部门编号(规则：父级关系编码+自己的编码)
     */
    private String deptNo;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 父级id
     */
    private String pid;

    /**
     * 状态(1:正常；0:弃用)
     */
    private Integer status;

    /**
     * 为了维护更深层级关系
     */
    private String relationCode;

    /**
     * 部门经理user_id
     */
    private String deptManagerId;

    /**
     * 部门经理名称
     */
    private String managerName;

    /**
     * 部门经理联系电话
     */
    private String phone;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 是否删除 1删除 0未删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

}