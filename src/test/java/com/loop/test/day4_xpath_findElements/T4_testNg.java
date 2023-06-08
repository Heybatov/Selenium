package com.loop.test.day4_xpath_findElements;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_testNg {


    @Test
    public void test1() {
        System.out.println("TestNG is running");
        String actual = "Nadir";
        String expected = "Feyruz";

        Assert.assertEquals(actual, expected);
    }
}