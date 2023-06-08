package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import com.loop.test.utility.BrowserUtils;
import com.loop.test.utility.DocuportConstants;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class T2_windows extends TestBase {
         /*
    1. Go to : https://www.amazon.com
    2. Copy paste the lines from below into your class
    3. Create a logic to switch to the tab where Etsy.com is open
    4. Assert: Title contains “Etsy”
    Lines to be pasted:
    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
    These lines will simply open new tabs using something called JavascriptExecutor
    and get those pages. We will learn JavascriptExecutor later as well.

     */

    @Test

    public void test_window_handle() throws InterruptedException {
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com')");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com')");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com')");


//        Set<String> windowsHandles = driver.getWindowHandles();
//        for (String each : windowsHandles) {
//            System.out.println("each window handle " + each);
//            driver.switchTo().window(each);
//
//            if (driver.getCurrentUrl().toLowerCase().contains("amazon")) {
//                break;
//            }
//        }
//        assertTrue(driver.getTitle().toLowerCase().contains("amazon"));


        BrowserUtils.switchToWindow(driver,"Facebook");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("Pizza");

        email.clear();
        email.sendKeys(Keys.DELETE);
////        driver.close();
//        Thread.sleep(6000);

//driver.get("https://www.yahoo.com/");
//driver.get("https://www.mail.ru/");
//
//        ((JavascriptExecutor) driver).executeScript("window.open('http://www.yahoo.com/','_blank');");
//        ((JavascriptExecutor) driver).executeScript("window.open('http://www.mail.ru/','_blank');");

//
//        ((JavascriptExecutor)driver).executeScript("window.open('http://beta.docuport.app/')");



    }



}
