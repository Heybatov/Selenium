package com.loop.test.day9_driver_faker_actions;

import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_upload {
        /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
     */


    @Test
    public void download () throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.url"));
        WebElement choseFile = Driver.driver.findElement(By.id("uploadfile_0"));

        String path = "C://Users//geyba//Desktop//Recep.jpg";

        choseFile.sendKeys(path);
        WebElement termCheckBox = Driver.driver.findElement(By.id("terms"));
        termCheckBox.click();

        WebElement submitButton = Driver.driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement successMessage =Driver.driver.findElement(By.id("res"));
        String expected = "1 file\nhas been successfully uploaded.";
        Thread.sleep(1000);
        assertEquals(successMessage.getText() , expected);
        Driver.closeDriver();

    }

}
