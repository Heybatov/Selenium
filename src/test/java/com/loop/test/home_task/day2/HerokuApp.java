package com.loop.test.home_task.day2;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HerokuApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));
        String expectPasswordHeader = "Forgot Password";
        String actualPasswordHeader = forgotPasswordHeader.getText();
        if (actualPasswordHeader.equalsIgnoreCase(expectPasswordHeader)) {
            System.out.println("Actual Password Header \"" + actualPasswordHeader + "\" matches expected Header \"" + expectPasswordHeader + "\" =Test Passed");
        } else {
            System.err.println("Actual Password Header \"" + actualPasswordHeader + "\" does NOT matches expected Header \"" + expectPasswordHeader + "\" =Test Failed");
        }
        WebElement emailHeader = driver.findElement(By.cssSelector("label[for=email]"));
        String expectEmailHeader = "E-mail";
//        String actualEmailHeader = emailHeader.getAttribute("for");   We can do it with ATTRIBUTE too
        String actualEmailHeader = emailHeader.getText();
        if (actualPasswordHeader.equalsIgnoreCase(expectPasswordHeader)) {
            System.out.println("Actual Email Header \"" + actualEmailHeader + "\" matches expected Header \"" + expectEmailHeader + "\" =Test Passed");
        } else {
            System.err.println("Actual Email Header \"" + actualEmailHeader + "\" does NOT matches expected Header \"" + expectEmailHeader + "\" =Test Failed");
        }
        WebElement emailInput = driver.findElement(By.cssSelector("input[type=text]"));
        String expectEmailInput = "";
        boolean actualEmailInput = emailInput.isDisplayed();
        if (actualEmailInput) {
            System.out.println(expectEmailInput + " is Displayed");
        } else {
            System.out.println("Nadir not Displayed");
        }
        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        String expectedRetrieveHeader = "Retrieve Password";
        String actualRetrieveHeader = retrievePassword.getText();
        if (actualRetrieveHeader.equalsIgnoreCase(expectedRetrieveHeader)) {
            System.out.println("Actual Retrieve Header \"" + actualRetrieveHeader + "\" matches expected Header \"" + expectedRetrieveHeader + "\" =Test Passed");
        } else {
            System.out.println("Actual Retrieve Header \"" + actualRetrieveHeader + "\" does NOT matches expected Header \"" + expectedRetrieveHeader + "\"");
            System.err.println("Test Failed");
        }
        System.out.println("-----------------");
        WebElement poweredHeader = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String expectPoweredHeader = "Powered by Elemental Selenium";
        String actualPoweredHeader = poweredHeader.getText();
        System.out.println(actualPoweredHeader);
        if (actualPoweredHeader.equalsIgnoreCase(expectPoweredHeader)) {
            System.out.println("Actual Powered Header \"" + actualPoweredHeader + "\" matches expected Header \"" + expectPoweredHeader + "\" =Test Passed");
        } else {
            System.out.println("Actual Powered Header \"" + actualPoweredHeader + "\" does NOT matches expected Header \"" + expectPoweredHeader + "\"");
            System.err.println("Test Failed");
        }
        WebElement seleniumLink = driver.findElement(By.cssSelector("a[target='_blank']"));
        seleniumLink.click();
        String expectedSeleniumLink = "Elemental Selenium";
        String actualSeleniumLink = seleniumLink.getText();
        if (actualSeleniumLink.equalsIgnoreCase(expectedSeleniumLink)) {
            System.out.println("Actual Selenium Header \"" + actualSeleniumLink + "\" matches expected Header \"" + expectedSeleniumLink + "\" =Test Passed");
        } else {
            System.out.println("Actual Selenium Header \"" + actualSeleniumLink + "\" does NOT matches expected Header \"" + expectedSeleniumLink + "\"");
            System.err.println("Test Failed");
        }
        driver.quit();

//
//        WebElement seleniumLinkNew1 = driver.findElement(By.cssSelector("div[class='large-12 columns text-center']>h1"));
//        String expectedSelenium = "Elemental Selenium";
//        String actualSeleniumLink1 = seleniumLinkNew1.getText();
//        if (actualSeleniumLink1.equalsIgnoreCase(expectedSelenium)) {
//            System.out.println("Actual Selenium Header \"" + actualSeleniumLink1 + "\" matches expected Header \"" + expectedSelenium+ "\" =Test Passed");
//        } else {
//            System.out.println("Actual Selenium Header \"" + actualSeleniumLink1 + "\" does NOT matches expected Header \"" + expectedSelenium + "\"");
//            System.err.println("Test Failed");
//        }



    }
}
