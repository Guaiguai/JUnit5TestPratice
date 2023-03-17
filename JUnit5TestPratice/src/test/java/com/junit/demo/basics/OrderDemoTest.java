package com.junit.demo.basics;

import org.junit.jupiter.api.*;

import static java.lang.Thread.sleep;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//排序方式为order注解，结合@Order使用
//@TestMethodOrder(MethodOrderer.DisplayName.class)  //排序方式为displayName注解，结合@displayName使用
public class OrderDemoTest {

    @Test
    @Order(1)
    void orderTest1() throws InterruptedException {
       System.out.println("order test demo 1");
    }
    @Test
    @Order(2)
    void orderTest2() throws InterruptedException {
        System.out.println("order test demo 2");
    }
    @Test
    @Order(3)
    void orderTest3() throws InterruptedException {
        System.out.println("order test demo 3");
    }
    @Test
    @Order(4)
    void orderTest4() throws InterruptedException {
        System.out.println("order test demo 4");
    }


}
