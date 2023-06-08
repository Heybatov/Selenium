package com.loop.test.home_task.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cvs {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cvs.com");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.linkText("Shop"));
        search.click();
        WebElement shop = driver.findElement(By.linkText("Beauty"));
        shop.click();
    }
}
