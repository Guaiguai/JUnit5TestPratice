package com.junit.demo.structure;

import org.junit.jupiter.api.*;

public class TestBaseCase {
    @BeforeEach
    void setupBase(){
        System.out.println("base_each: setup before each method ++++");
    }
    @AfterEach
    void tearDownBase(){
        System.out.println("base_each: tear down after each method ++++");
    }

    @BeforeAll
    static void setupAllBase(){
        System.out.println("base_all: setup before all ++++");
    }

    @AfterAll
    static void tearDownAllBase(){
        System.out.println("base_all: tear down after all ++++");
    }


    @Test
    void test03(){
        System.out.println("testing03 ++++");
    }
    @Test
    void test04(){
        System.out.println("testing04 ++++");
    }
}
