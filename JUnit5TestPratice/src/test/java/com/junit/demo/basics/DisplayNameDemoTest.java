package com.junit.demo.basics;

import org.junit.jupiter.api.Test;




//显示名称为默认格式
// @DisplayNameGeneration(DisplayNameGenerator.Standard.class)
//显示名称如果是没有参数的方法，则去掉（），如果有则保持原样
//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//用 空格替换掉下划线——
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class DisplayNameDemoTest {

    @Test
    void displayName1(){
        System.out.println("display name demo test...");
    }

    @Test
    void displayName2(){
        System.out.println("display name demo test...");
    }
    @Test
    void display_name_test(){
        System.out.println("display name demo test...");
    }
}
