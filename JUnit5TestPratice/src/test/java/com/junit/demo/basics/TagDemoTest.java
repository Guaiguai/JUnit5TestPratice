package com.junit.demo.basics;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagDemoTest {
    @Test
    @Tag("test")
    void demo1(){
        System.out.println("测试环境");
    }
    @Test
    @Tag("dev")
    void demo2(){
        System.out.println("开发环境");
    }
    @Test
    @Tag("prod")
    void demo3(){
        System.out.println("生产环境");
    }
    @Test
    @Tag("preprod")
    @Tag("test")
    void demo4(){
        System.out.println("预发布环境");
    }
}
