package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_actions_hoverover {

    @Test
    public void hoverOver() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));


        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        actions.moveToElement(googleSearch).perform();

        Thread.sleep(3000);
        actions.moveToElement(feelingLucky).perform();

    }

}
