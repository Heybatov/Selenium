package com.loop.test.home_task.day7;

import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.openqa.selenium.Keys.PAGE_UP;

public class MovedToElement {

    @Test
    public void testPowered() throws InterruptedException {
        WebDriver driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("loop.app"));

        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(By.xpath("//a[.='LOOPCAMP']"))).perform();
  }
}
