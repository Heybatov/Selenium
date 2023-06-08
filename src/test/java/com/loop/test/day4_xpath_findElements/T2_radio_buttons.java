package com.loop.test.day4_xpath_findElements;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_radio_buttons {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement radioYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));

        WebElement radioNo = driver.findElement(By.xpath("//input[@id='noRadio']"));

        //is Selected()
Thread.sleep(1000);
        System.out.println("before clicking " +radioYes.isSelected());
        radioYes.click();
        Thread.sleep(8000);
        System.out.println("after click "+radioYes.isSelected());

        System.out.println("Yes button is Enable : "+radioYes.isEnabled());
        System.out.println("No button is Eneable : "+radioNo.isEnabled());


        driver.quit();

    }
}
