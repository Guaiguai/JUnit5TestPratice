package com.junit.demo.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({"哈利,18","多则,17","梅梅,19"})
    void csvSourceDemo(String name, Integer age){
        System.out.println(name + "的年龄是：" + age);
    }
    @ParameterizedTest
    @CsvSource(value = {"哈利-18","多则-17","梅梅-19"},delimiterString = "-")
    void csvSourceDemo2(String name, Integer age){
        System.out.println(name + "的年龄是：" + age);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data/data.csv",delimiterString = "|")// default 读取resources下的文件
    void csvFileSourceTest(String name, Integer age){
        System.out.println(name + "的年龄是：" + age);
    }
}
