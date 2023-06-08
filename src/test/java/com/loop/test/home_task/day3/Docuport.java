package com.loop.test.home_task.day3;

import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Docuport {

    @Test
    public void TestDocuport() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://beta.docuport.app");
        WebDriverFactory.wait(driver, 30);

        WebElement findByIdUSerName = driver.findElement(By.xpath("//input[@id='input-14']"));
        findByIdUSerName.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement findByIdPassword = driver.findElement(By.xpath("//input[@id='input-15']"));

        findByIdPassword.sendKeys(DocuportConstants.PASSWORD_ADVISOR);

        WebElement findLogin = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        findLogin.click();

        WebDriverFactory.wait(driver, 30);
        WebElement findHome = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        System.out.println((findHome.isDisplayed()) ? "HOME BUTTON IS DISPLAYED ==> TEST PASSED" : "HOME BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findReceiveDocs = driver.findElement(By.xpath("//span[starts-with(text(),'Received')]"));
        System.out.println((findReceiveDocs.isDisplayed()) ? "RECEIVE DOCS BUTTON IS DISPLAYED ==> TEST PASSED" : "RECEIVE DOCS BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findMyUploads = driver.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        System.out.println((findMyUploads.isDisplayed()) ? "MY UPLOADS BUTTON IS DISPLAYED ==> TEST PASSED" : "MY UPLOADS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        WebElement findInvitations = driver.findElement(By.xpath("//span[starts-with(text(),'Invitations')]"));
        System.out.println((findInvitations.isDisplayed()) ? "INVITATIONS BUTTON IS DISPLAYED ==> TEST PASSED" : "INVITATIONS  BUTTON IS NOT DISPLAYED ==> TEST FAILED");

        System.out.println("--------after pressing three lines-------");

        List<WebElement> leftList = driver.findElements(By.xpath("//div[@role='listbox']/a"));

        String[] arr = new String[leftList.size()]; //size is - [10]
        int index = 0;

        for (WebElement left : leftList) {
            arr[index] = left.getText();
            index++;
        }

        WebElement threeLines = driver.findElement(By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
//        threeLines.click();

        List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']/a"));

        index = 0;
        for (WebElement eachList : list) {
            try {
                eachList.click();
                Thread.sleep(1000);

            } catch (Exception e) {

                System.out.println(arr[index] + " IS NOT DISPLAYED ==> TEST PASSED");
                index++;
            }
        }

        driver.quit();
    }
}