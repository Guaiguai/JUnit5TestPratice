package com.allure.demo;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Test;

public class AllureSeverityTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void normalTest() {
        assert 1 + 1 == 2;
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void criticalTest() {
        assert 1 + 1 == 2;
    }
}
