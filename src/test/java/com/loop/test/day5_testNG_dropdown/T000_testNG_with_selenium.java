package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T000_testNG_with_selenium {
    WebDriver driver;
    String expected;
    String actual;


    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverFactory.wait(driver, 10);
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


    @Test
    public void googleTItle() {

        driver.get("https://www.google.com/");
        System.out.println("((RemoteWebDriver)driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Google";
        actual = driver.getTitle();
        Assert.assertEquals(actual, expected, " does not match");

    }

    @Test
    public void docuportTitle() {

        driver.get("https://beta.docuport.app/");
        System.out.println("((RemoteWebDriver)driver).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
        expected = "Docuport";
        actual = driver.getTitle();
        Assert.assertTrue(actual.contains( expected));

    }

}
