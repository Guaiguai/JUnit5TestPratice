package com.junit.demo.asserts;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class TestAssert {

    @Test
    void testAssertEqual(){
        assertEquals(2, 1+1);
        assertEquals(3,2+1);
    }

    @Test
    void testAssertTrue(){
        assertTrue(true);
    }
    @Test
    void testAssertNotNull(){
        assertNotNull(" ");
    }
    @Test
    void testAssertNotNull2(){
        assertNotNull(null);
    }
    @Test
    void testAssertAll(){
        //hearding 分组描述信息， 选填
        assertAll("All",
                () -> assertEquals(2, 1 + 1),
                () -> assertEquals(4, 2 + 2));
    }
    @Test
    void testAssertTimeout(){
        //参数一 设置超时时间
        //若参数2 > 参数1， 则超时，抛出异常
        assertTimeout(Duration.ofSeconds(3), ()->{
            sleep(2000);
        });
    }

}
