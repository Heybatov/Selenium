package com.loop.test.home_task.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        WebElement seacrhBox = driver.findElement(By.id("APjFqb"));

        String text = "etsy.com";
        seacrhBox.sendKeys(text + Keys.ENTER);

        WebElement click = driver.findElement(By.linkText("etsy.com"));
        click.click();

        WebElement searchEtsy = driver.findElement(By.id("global-enhancements-search-query"));
        String spoon = "wooden spoon";
        searchEtsy.sendKeys(spoon + Keys.ENTER);
        String expectedTitleWooden = " Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleWooden)) {
            System.out.println("Actual Title: " + actualTitle + " , matched expected title : " + expectedTitleWooden + " =Test Passed");
        } else {
            System.err.println("Actual Title: " + actualTitle + " , DOES NOT matched expeted Title := TEST FAIL");
        }
        driver.quit();
    }
}