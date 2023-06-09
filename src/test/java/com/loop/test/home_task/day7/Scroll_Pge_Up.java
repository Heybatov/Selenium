package com.loop.test.home_task.day7;

import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scroll_Pge_Up {

    @Test
    public void scroll_up() throws InterruptedException{


        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loop.app"));

        Actions action = new Actions(driver);
        Thread.sleep(1500);
        action.moveToElement(driver.findElement(By.xpath("//a[.='LOOPCAMP']"))).perform();

        Thread.sleep(1000);
        action.sendKeys(Keys.PAGE_UP).moveToElement(driver.findElement(By.xpath("//div[@class = 'container']/preceding-sibling::nav"))).build().perform();
    }
}