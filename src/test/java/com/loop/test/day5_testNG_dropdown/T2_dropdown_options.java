package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_dropdown_options {


    WebDriver driver;
    String expected ;
    String actual;
    @BeforeMethod
    public void setUpMethod(){


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverFactory.wait(driver, 10);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
 /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. go old style select menu
    4. Select Yellow and validate
    5. Select Red and validate
    6. Select White and validate
    Use all Select options. (visible text, value, index)
     */

    @Test
    public void test(){
        driver.get("https://demoqa.com/select-menu");
        Select dropdown = new Select(driver.findElement(By.xpath("//SELECT[@ID='oldSelectMenu']")));

        dropdown.selectByIndex(3);

        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Yellow");

        dropdown.selectByValue("red");

        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Red");

        dropdown.selectByVisibleText("White");

        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"White");





    }
}
