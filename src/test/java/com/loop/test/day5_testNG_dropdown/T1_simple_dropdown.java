package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_simple_dropdown {
    WebDriver driver;
    String expected ="Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverFactory.wait(driver, 10);

//1. Open Chrome browse
        //2. Go to http://the-internet.herokuapp.com/dropdown
        //3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”

    }


    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void test() {
        driver.get("http://the-internet.herokuapp.com/dropdown");

//        WebElement dropdownElement= driver.findElement(By.xpath("//select[@id='dropdown']"));
//        Select dropdown = new Select(dropdownElement);
//
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));


        //gives us what is already selected
        actual = dropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected,"does not match");

    }
}
