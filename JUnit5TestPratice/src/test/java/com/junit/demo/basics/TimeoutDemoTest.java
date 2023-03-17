package com.junit.demo.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TimeoutDemoTest {

    @Test
    @Timeout(5)
    void timeoutTest1() throws InterruptedException {
       System.out.println("time out test demo");
       sleep(10000);
    }

    @Test
    @Timeout(value = 5,unit = TimeUnit.MILLISECONDS)
    void timeoutTest2() throws InterruptedException {
        System.out.println("time out test demo");
        sleep(10000);
    }
}
