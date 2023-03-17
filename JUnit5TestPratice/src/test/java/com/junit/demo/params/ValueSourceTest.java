package com.junit.demo.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueSourceTest {
    //@Test // 尽量TEST与ParameterizedTest不一起使用，否则会多执行Test的那一次
    @ParameterizedTest
    @ValueSource(strings = {"张三","李四","王五"})
    void valueSourceDemo(String name){
        System.out.println(name);
        assertEquals(name.length(),2);
    }

    //@Test
    @ParameterizedTest
    @ValueSource(ints = {1,2,3} )
    void valueSourceIntDemo(Integer name ){

    }
}
