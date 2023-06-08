package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T0_StaleElementException {
    @Test
    public void heroku() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverFactory.wait(driver,10);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();

        WebDriverFactory.wait(driver,10 );
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
       if(deleteButton.isDisplayed()){
           System.out.println("Delete button is displayed : Test Passed");
           deleteButton.click();
       }else {
           System.out.println("Delete button is not displayed");
       }

       try {
           deleteButton.isDisplayed();
           System.out.println("Delete button is displayed : ");
           System.err.println("Test Failed");
       }catch (StaleElementReferenceException e){
           System.out.println("Exception handled");
           System.out.println("Delete button is not displayed :\nTest Passed");
       }
        driver.quit();
    }
}