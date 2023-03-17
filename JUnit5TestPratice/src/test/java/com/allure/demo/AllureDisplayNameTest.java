package com.allure.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AllureDisplayNameTest {

    @Test
    @DisplayName("display name")
    public void caseTitleTest() {
        assert 1 + 1 == 2;
        assertThat(2, equalTo(2));
    }
}
