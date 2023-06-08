package com.loop.test.Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //WEB DRIVER is INTERFACE
        //CHROMEDRIVER is CLASS

        // SETTING up the web driver  (DEPENDENCE FROM BONI GARCIA )
        WebDriverManager.chromedriver().setup();

        //creating an INSTANCE of driver
        WebDriver driver = new ChromeDriver();


        // to GO TO the URL
        driver.get("https://www.etsy.com");
        //driver.navigate().to("https://beta.docuport.app"); --> same with GET , but old version



        // MAXIMIZE window
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen(); --> same with maximize,but fullscreen need use everytime,but MAXIMIZE one time for all project

        //to open SLOWLY
        Thread.sleep(1000);


        //NAVIGATE BACK
        driver.navigate().back();
        Thread.sleep(1000);


        //NAVIGATE FORWARD
        driver.navigate().forward();
        Thread.sleep(1000);

        //REFRESH
        driver.navigate().refresh();

        //CLOSE PAGE BUT when open chrome page it's still on that page
        driver.close();

        //QUIT AND CLOSED PAGE
        driver.quit();




    }
}