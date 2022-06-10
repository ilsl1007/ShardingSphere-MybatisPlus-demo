package com.yulj.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.yulj.entity.User;
import com.yulj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @Classname UserController
 * @Description <h1>系统用户 前端控制器</h1>
 * @Author yulj
 * @Date 2022/01/30 22:20
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Description: 批量保存用户
     */
    @PostMapping("save-user")
    public Object saveUser() {
        return userService.save(
                new User().setName("小李").setAge(15)
        );
    }

    /**
     * @Description: 删除用户
     */
    @PostMapping("delete-user")
    public Object saveUser(Long id) {
        return userService.removeById(id);
    }

    /**
     * @Description: 获取用户列表
     */
    @GetMapping("list-user")
    public Object listUser() {
        return userService.list();
    }

    /**
     * @Description: 分页查询用户列表
     */
    @GetMapping("page-user")
    public Object pageUser() {
        return userService.page(new Page<>());
    }

    /**
     * @Description: 保存用户（指定年龄）
     */
    @PostMapping("save-user-with-age")
    public Object saveUserWithAge(@RequestParam Integer age) {
        return userService.save(
                new User().setName("小李").setAge(age)
        );
    }

    @PostMapping("saveBatch")
    public Object saveBatch() {
        List<User> users = Lists.newArrayList();
        User user1 = new User().setAge(10).setName(UUID.randomUUID().toString());
        users.add(user1);
        User user2 = new User().setAge(12).setName(UUID.randomUUID().toString());
        users.add(user2);
        return this.userService.saveBatch(users);
    }

}