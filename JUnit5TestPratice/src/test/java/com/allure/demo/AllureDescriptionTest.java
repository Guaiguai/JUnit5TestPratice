package com.allure.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class AllureDescriptionTest {
    @Test
    @Description("静态描述信息")
    public void annotationDescriptionTest() {
    }

    @Test
    public void dynamicDescriptionTest() {
        Allure.description("动态描述信息");
    }
}
