package com.loop.test.day5_testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class T00_testNG_intro_continue {

    @BeforeClass
    public void setUp (){
        System.out.println("Before Class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After Class is running");
    }



    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running");
    }

    @Test(priority = 2)

    public void test1(){

        System.out.println("TestNG test1 is running");
        String actual ="Loop";
        String expected = "Loop";
        Assert.assertEquals(actual,expected , actual+" : is not matched "+expected);

    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("TestNG test2 is running");
    }


}
