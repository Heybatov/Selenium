package com.loop.test.base;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

   public WebDriver driver ;


   @BeforeMethod
    public void setUpMethod(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       WebDriverFactory.wait(driver,10);
   }

   @AfterMethod
    public void tearDown() throws InterruptedException {
   driver.close();
//      Thread.sleep(3000);
//      driver.quit();
   }








}
