package com.allure.demo;

import io.qameta.allure.Allure;
import io.qameta.allure.Link;
import io.qameta.allure.Links;
import org.junit.jupiter.api.Test;

public class AllureLinkTest {

    @Test
    @Link(name = "静态链接", url = "https://ceshiren.com")
    public void staticLinkTest() {
        assert 1 + 1 == 2;
    }
    @Test
    @Links({@Link(name = "静态链接2", url = "https://ceshiren.com"),
            @Link(name = "静态链接3", url = "https://ceshiren.com")
    })
    void staticLinksTest(){
        assert 1 + 4 == 5;

    }
    @Test
    public void dynamicLinkTest() {
        assert 1 + 1 == 2;
        Allure.link("Dynamic link", "https://ceshiren.com");
    }
}
