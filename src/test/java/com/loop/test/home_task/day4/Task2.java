package com.loop.test.home_task.day4;

import com.loop.test.utility.*;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import org.testng.annotations.*;

public class Task2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        WebDriverFactory.wait(driver,10);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test(){
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBar.sendKeys("rings");
        WebElement submitButton = driver.findElement(By.xpath("//button[@value='Search']"));
        submitButton.click();
        WebElement dropdownEstimate = driver.findElement(By.xpath("//span[contains(text(), 'Estimated Arrival')]"));
        Assert.assertEquals(dropdownEstimate.getText(),"Estimated Arrival Any time");
        dropdownEstimate.click();

        Select deliveryDate = new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
        deliveryDate.selectByVisibleText("By May 30");
        Assert.assertTrue(deliveryDate.getFirstSelectedOption().getText().equals("B May 30"),"GO HOME");
    }
}
