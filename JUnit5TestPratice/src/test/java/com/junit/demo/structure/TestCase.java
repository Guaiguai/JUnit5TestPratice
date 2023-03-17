package com.junit.demo.structure;

import org.junit.jupiter.api.*;

public class TestCase extends TestBaseCase{
    @BeforeEach
    void setup(){
        System.out.println("setup before each method....");
    }
    @AfterEach
    void tearDown(){
        System.out.println("tear down after each method....");
    }

    @BeforeAll
    static void setupAll(){
        System.out.println("setup before all ....");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("tear down after all....");
    }


    @Test
    void test01(){
        System.out.println("testing01....");
    }
    @Test
    void test02(){
        System.out.println("testing02....");
    }
}
