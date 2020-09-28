package com.example.demo;

import com.example.demo.mapper.UoAdUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    UoAdUserMapper uoAdUserMapper;

    @Test
    void contextLoads() {
        System.out.println(1);
    }

}
