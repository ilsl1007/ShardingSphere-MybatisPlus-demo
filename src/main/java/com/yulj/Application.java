package com.yulj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname Application
 * @Description <h1>主启动程序</h1>
 * @Author yulj
 * @Date 2022/01/30 22:13
 */
@SpringBootApplication
@MapperScan("com.yulj.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}