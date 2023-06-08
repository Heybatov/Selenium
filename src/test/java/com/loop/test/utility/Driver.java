package com.loop.test.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {


    private Driver(){

    }

    public static WebDriver driver;

    /**
     * singleton parent
     * @return driver
     * @author Uncle Rusik
     *
     */

    public static WebDriver getDriver(){
        if (driver==null){
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType.toLowerCase()){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }


        return driver;
    }

    /**
     * closing driver
     */
    public static void closeDriver(){

        if (driver!= null) {
            driver.quit();
            driver = null;
        }
    }


}
