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

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class T3_multi_dropdown {
    WebDriver driver;
//    String expected ;
//    String actual;
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


    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        Assert.assertTrue(dropdown.isMultiple());

        // if this dropdown allows multiple selection
        Assert.assertTrue(dropdown.isMultiple());

//        // selet by index
//        dropdown.selectByIndex(0);
//        Thread.sleep(3000);
//        dropdown.selectByValue("saab");
//        Thread.sleep(3000);
//        dropdown.selectByVisibleText("Opel");
//        Thread.sleep(3000);
//        dropdown.selectByIndex(3);


Thread.sleep(3000);
        List<WebElement> options = new ArrayList<>();
        options = dropdown.getOptions();
        Thread.sleep(2000);
        options.forEach(option -> {
            option.click();
        });


        System.out.println("====================");

        for (WebElement option : options) {
            option.click();
            System.out.println("option: " + option.getText());
        }

        dropdown.deselectAll();

//        try {
//            System.out.println("selected option = " + dropdown.getFirstSelectedOption().getText());
//        }catch (NoSuchElementException e){
//            System.out.println("Exception handled");
//        }
    }
    }

