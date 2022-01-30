package com.yulj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yulj.entity.SysDept;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname SysDeptMapper
 * @Description <h1>系统部门表数据库访问层</h1>
 * @Author yulj
 * @Date 2022/01/30 22:16
 */
@Mapper
public interface SysDeptMapper extends BaseMapper<SysDept> {

}