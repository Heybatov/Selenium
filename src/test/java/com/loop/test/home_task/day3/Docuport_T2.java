package com.loop.test.home_task.day3;

import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
1. go to docuport+
2. sign as adviser+
3. store left navigate items to (Home, Received docs, My uploads, Invitations etc) to the List+
4. iterate and print out href values +
 */
public class Docuport_T2 {
    @Test
    public void DocuportTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://beta.docuport.app");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement findByIdUSerName = driver.findElement(By.xpath("//input[@id='input-14']"));
        findByIdUSerName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement findByIdPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        findByIdPassword.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        WebElement findLogin = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        findLogin.click();

        List<WebElement> list = driver.findElements(By.xpath("//a[contains(@class,'py-x-2')]"));
        String[] arr = {"Home","Received docs","My uploads","Clients","Invitations","Users","Leads","Bookkeeping","1099 Form","Reconciliations"};
        Thread.sleep(1000);
        WebDriverFactory.visibleOf(driver, 10, list.get(0));
        for (int i = 0; i < list.size(); i++) {
            Assert.assertTrue(list.get(i).getText().contains(arr[i]));

        }
        driver.quit();
    }
}