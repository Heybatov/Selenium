package com.loop.test.home_task.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Docuport {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.docuport.app");
        // username : b1g2_employee@gmail.com
        // pasword  :  Group2
        driver.manage().window().maximize();
        WebElement searchName = driver.findElement(By.id("input-14"));
        searchName.sendKeys("b1g2_employee@gmail.com");
        WebElement searchPass = driver.findElement(By.id("input-15"));
        searchPass.sendKeys("Group2");

        WebElement logIn = driver.findElement(By.className("v-btn__content"));
        logIn.click();
        Thread.sleep(2000);
        driver.quit();
    }
}