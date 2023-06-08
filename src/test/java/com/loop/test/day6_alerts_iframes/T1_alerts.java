package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class T1_alerts extends TestBase {
    /*
    Information alert practice
    1. Open browser
    2. Go to website: http://the-internet.herokuapp.com/javascript_alerts
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Verify “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
     */


    @Test
    public void informationAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement clickJsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
        clickJsAlert.click();
        Alert alert = driver.switchTo().alert();
//        driver.switchTo().alert().accept();

        Thread.sleep(1000);
        alert.accept();

        WebElement successMessageForAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageForAlert.getText();
        String expected = "You successfully clicked an alert";
        assertEquals(expected, actual, "expected does NOT match the actual");
    }

        @Test
        public void confirmationAlert () throws InterruptedException {

            driver.get("http://the-internet.herokuapp.com/javascript_alerts");
            WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
            clickForJSConfirm.click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            WebElement successMessageConfirmAlert = driver.findElement(By.xpath("//p[@id='result']"));
            String actual = successMessageConfirmAlert.getText();
            String expected = "You clicked: Ok";
            assertEquals(expected,actual , "expected does NOT match the actual");

            clickForJSConfirm.click();
            Thread.sleep(1000);
            driver.switchTo().alert().dismiss();
            actual=successMessageConfirmAlert.getText();
            expected = "You clicked: Cancel";
            assertEquals(actual,expected, "actual does not match the expect");

        }

        @Test
            public void promptAlert(){
                driver.get("http://the-internet.herokuapp.com/javascript_alerts");
                WebElement clickJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
                clickJSPrompt.click();
                String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys("Loop Academy");
//        driver.switchTo().alert().accept();
                Alert alert = driver.switchTo().alert();
                alert.sendKeys(text);
                alert.accept();

                WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
                String actual = successMessagePromptAlert.getText();
                String expected = "You entered: " + text;
                assertEquals(actual, expected, "actual does not match the expected");
            }


        }



