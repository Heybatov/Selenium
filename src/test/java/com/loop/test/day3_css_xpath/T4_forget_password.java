package com.loop.test.day3_css_xpath;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_forget_password {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();

        WebElement forgotPass = driver.findElement(By.cssSelector("a[class='body-2 text-decoration-none primary--text']"));
        forgotPass.click();

        WebElement emailForReset = driver.findElement(By.cssSelector("input#input-21"));
        emailForReset.sendKeys("loop@academy.io");
        WebElement sendPass = driver.findElement(By.cssSelector("span[class='v-btn__content']"));
  sendPass.click();
    }
}
