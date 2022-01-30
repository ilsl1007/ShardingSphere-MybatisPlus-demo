package com.yulj.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yulj.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname UserMapper
 * @Description <h1>系统用户表数据库访问层</h1>
 * @Author yulj
 * @Date 2022/01/30 22:16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}