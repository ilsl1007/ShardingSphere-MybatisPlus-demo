package com.yulj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yulj.entity.User;
import com.yulj.mapper.UserMapper;
import com.yulj.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description <h1>系统用户表业务逻辑层实现</h1>
 * @Author yulj
 * @Date 2022/01/30 22:16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}