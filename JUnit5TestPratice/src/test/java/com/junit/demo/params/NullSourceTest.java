package com.junit.demo.params;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullSourceTest {


    @ParameterizedTest
    @NullSource
    void nullSourceDemo(String name){

        System.out.println(name);
    }
    @ParameterizedTest
    @ValueSource(strings = {""})
    void valueSourceDemo(String name){

        assertTrue(name == null || name.isEmpty() || name.isBlank());
    }
    @ParameterizedTest
    @EmptySource
    void emptySourceDemo(String name){

        assertTrue(name == null || name.isEmpty() || name.isBlank());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void nullAndEmptySourceDemo(String name){

        assertTrue(name == null || name.isEmpty() || name.isBlank());
    }



}
