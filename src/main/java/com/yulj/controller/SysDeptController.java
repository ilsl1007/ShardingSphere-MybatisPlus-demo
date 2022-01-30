package com.yulj.controller;


import com.yulj.entity.SysDept;
import com.yulj.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname SysDeptController
 * @Description <h1>系统部门 前端控制器</h1>
 * @Author yulj
 * @Date 2022/01/30 22:18
 */
@RestController
public class SysDeptController {
    @Autowired
    private SysDeptService sysDeptService;

    /**
     * @Description: 批量保存用户
     */
    @PostMapping("save-dept")
    public Object saveUser() {
        return sysDeptService.save(
                new SysDept().setName("test部门")
        );
    }

}
