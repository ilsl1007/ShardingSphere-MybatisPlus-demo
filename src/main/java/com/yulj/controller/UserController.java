package com.yulj.controller;


import com.yulj.entity.User;
import com.yulj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return userService.save(new User().setName("小李").setAge(15));
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

}