package com.junit.demo.basics;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatDemoTest {

    @RepeatedTest(6)
    void repeatTest(){
        System.out.println("testing...");
    }

    @RepeatedTest(value = 6, name = "{displayName} :: repetition {currentRepetition} of {totalRepetitions}")
    void repeatTest3(){
        System.out.println("testing...");

    }
}
