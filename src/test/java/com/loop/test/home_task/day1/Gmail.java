package com.loop.test.home_task.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();
        String expectTitle = "Gmail";
        String actualTitle= driver.getTitle();
        if( actualTitle.equals(expectTitle)){
            System.out.println("Actual title: \""+actualTitle+"\" matched expected title : \""+expectTitle +"\" = TEST PASSED");
        }else {
            System.out.println("ACtual title: \""+actualTitle+"\" does not matched expected title : \""+expectTitle +"\" = TEST FAILED");
        }
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        String expectedTitle1 = "Google";
        String actualTitle1=driver.getTitle();

        if( actualTitle1.equals(expectedTitle1)){
            System.out.println("Actual title: \""+actualTitle1+"\" matched expected title : \""+expectedTitle1 +"\" = TEST PASSED");
        }else {
            System.out.println("ACtual title: \""+actualTitle1+"\" does not matched expected title : \""+expectedTitle1 +"\" = TEST FAILED");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}