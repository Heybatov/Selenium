package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {


            // setup the driver
            WebDriverManager.chromedriver().setup();

            // create driver object
            WebDriver driver = new ChromeDriver();

            // navigate to google page
            driver.get("https://www.google.com/");

            // maximize the window
            driver.manage().window().maximize();

            // locate the element
            WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
            WebElement searchBoxWithName = driver.findElement(By.name("q"));
            WebElement aboutLink = driver.findElement(By.linkText("About"));

            // aboutLink.click();
            // create a String what you want to search
            String textToSearch = "Loop Academy";
            //searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);
            searchBoxWithID.sendKeys(textToSearch);
            Thread.sleep(1000);
            searchBoxWithID.clear();

            driver.quit();

        }
    }

