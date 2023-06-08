package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch  {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String expectedUrl="https://www.google.com";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = "+actualTitle);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual Title: "+actualTitle+" , matched expected title : "+expectedTitle+" ,= TEST PASS");
        }else {
            System.out.println("Actual Title: "+actualTitle+" , DOES NOT matched expeted title : "+expectedTitle+" ,=.TEST FAIL");
        }


        String actualUrl=driver.getCurrentUrl();
        System.out.println("Actual URL: "+actualUrl);

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Actual URL: "+actualUrl+" , matched expected URL : "+expectedUrl+" ,= TEST PASS");
        }else {
            System.err.println("Actual URL: "+actualUrl+" , DOES NOT matched expeted URL : "+expectedUrl+" ,=.TEST FAIL");
        }



        Thread.sleep(1000);
        driver.quit();






    }
}
