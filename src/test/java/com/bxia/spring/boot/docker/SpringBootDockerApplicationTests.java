package com.bxia.spring.boot.docker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootDockerApplicationTests {

    @Resource
    private SpringBootDockerApplication application;

    @Test
    public void contextLoads() {
        System.out.println("Hello World.");
    }

    @Test
    public void test01(){
        String owner = application.owner();
        System.out.println(owner);
    }

}
