package com.junit.demo.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnumSourceTest {

    public enum units{
        Harry("harry", 18),
        Halle("halle", 22),
        Meimei("meimei", 20),
        Larry("larry", 19);
        private final String name;
        private final Integer age;

        private units(String name,Integer age){
            this.name = name;
            this.age = age;
        }
    }

    @ParameterizedTest
    @EnumSource
    void enumSourceDemo(units unit){

        System.out.println(unit.name);
    }

    @ParameterizedTest
    @EnumSource(names = {"Harry","larry"})
    void enumSourceDemo2(units unit){

        System.out.println(unit.name);
    }

    @ParameterizedTest
    @EnumSource(mode= EnumSource.Mode.EXCLUDE, names = {"Harry"})
    void enumSourceDemo3(units unit){

        System.out.println(unit.name);
    }

    @ParameterizedTest
    @EnumSource(mode= EnumSource.Mode.MATCH_ALL, names = {"H.*"})
    void enumSourceDemo4(units unit){

        System.out.println(unit.name);
    }

}
