package com.junit.demo.basics;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("禁用测试类")
public class DisableDemoTest {

   @Test
    @Disabled
    void disableMethod(){
        System.out.println("disable method test");
    }
}
