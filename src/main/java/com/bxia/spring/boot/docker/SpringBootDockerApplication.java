package com.bxia.spring.boot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bxia
 * @date 2018-12-07
 */
@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

    /**
     * 首页信息
     * @return 首页信息
     */
    @GetMapping("/")
    public String home(){
        return "Hello Docker World.";
    }

    /**
     * 获取项目拥有者
     * @return 项目拥有者
     */
    @GetMapping
    public String owner(){
        return "Jack Xia";
    }
}
