package com.junit.demo.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    void methodSourceDemo(String name){

        assertNotNull(name);
    }
   static Stream<String> stringProvider(){
        return Stream.of("apple","pear");
   }

    @ParameterizedTest
    @MethodSource
    void methodSourceDemo1(String name){

        assertNotNull(name);
    }
    static Stream<String> methodSourceDemo1(){
        return Stream.of("apple","pear");
    }

    @ParameterizedTest
    @MethodSource
    void multiMethodSourceDemo1(String name,Integer age){

        System.out.println(name + "的年龄是：" + age);
    }
    static Stream<Arguments> multiMethodSourceDemo1(){
        return Stream.of(
                Arguments.arguments("hali",6),
                Arguments.arguments("meimei",5)
        );
    }
}
