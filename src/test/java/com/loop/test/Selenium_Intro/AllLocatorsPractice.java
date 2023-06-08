package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class AllLocatorsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form/");

        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Tosu");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Zengilanskiy");

        WebElement eMail = driver.findElement(By.id("userEmail"));
        eMail.sendKeys("loop@academy.io");

        WebElement gender = driver.findElement(By.cssSelector("label[for=gender-radio-1]"));
        gender.click();

        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("555-55-55");
        Thread.sleep(3000);
//        WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement hobbies = driver.findElement(By.cssSelector("label[for=hobbies-checkbox-1]"));
        hobbies.click();
        Thread.sleep(2000);

        driver.quit();

    }
}
