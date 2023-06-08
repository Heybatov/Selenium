package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
