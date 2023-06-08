package com.loop.test.home_task.day4;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtraTask {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://app.docuport.app/company-formation/resident");
        WebDriverFactory.wait(driver,20);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test() throws InterruptedException {
        WebElement corporationButton = driver.findElement(By.xpath("//label[.='Corporation']"));
        corporationButton.click();

        WebElement corporationAfterClick = driver.findElement(By.xpath("//label[.='Corporation']//preceding-sibling::div/input"));
        Assert.assertTrue( corporationAfterClick.isSelected(),"CORPORATION IS NOT SELECTED");

        WebElement virginiaButton = driver.findElement(By.xpath("//label[.='Virginia']"));
        virginiaButton.click();
        WebElement virginiaButtonAfterclick = driver.findElement(By.xpath("//label[.='Virginia']//preceding-sibling::div/input"));
        Assert.assertTrue(virginiaButtonAfterclick.isSelected(),"VIRGINIA IS NOT SELECTED");

        WebElement llcButton = driver.findElement(By.xpath("//label[.='LLC']"));
        llcButton.click();

        WebElement llcButtonAfterClick = driver.findElement(By.xpath("//label[.='LLC']//preceding-sibling::div/input"));
        Assert.assertTrue(llcButtonAfterClick.isSelected(),"LLC IS NOT SELECTED");


        WebElement registrationFee = driver.findElement(By.xpath("//p[.=' State registration fee ']//following-sibling::p"));
        Assert.assertEquals(registrationFee.getText(),"$100");

        WebElement processingFee = driver.findElement(By.xpath("//p[contains(text(),'Payment processing')]//following-sibling::p"));
        Assert.assertEquals(processingFee.getText(),"$6");

        WebElement serviceFee = driver.findElement(By.xpath("//p[contains(text(),'Service fee')]//following-sibling::p"));
        Assert.assertEquals(serviceFee.getText() , "$150");

        WebElement total = driver.findElement(By.xpath("//div[@class='col col-8']//following-sibling::div"));
        Assert.assertEquals(total.getText() ,"$256");

        WebElement marylandButton = driver.findElement(By.xpath("//label[.='Maryland']"));
        marylandButton.click();
        WebElement marylandButtonAfterclick = driver.findElement(By.xpath("//label[.='Maryland']//preceding-sibling::div/input"));
        Assert.assertTrue(marylandButtonAfterclick.isSelected(),"MARYLAND IS NOT SELECTED");

        WebElement corporationButton2 = driver.findElement(By.xpath("//label[.='LLC']"));
        corporationButton2.click();
        WebElement registrationFee2 = driver.findElement(By.xpath("//p[contains(text(),' State registration fee ')]//following-sibling::p"));
        Assert.assertEquals(registrationFee2.getText(),"$170");
        WebElement processingFee2 = driver.findElement(By.xpath("//p[contains(text(),'Payment processing')]//following-sibling::p"));
        Assert.assertEquals(processingFee2.getText(),"$10.20");
        WebElement serviceFee2 = driver.findElement(By.xpath("//p[contains(text(),'Service fee')]//following-sibling::p"));
        Assert.assertEquals(serviceFee2.getText() , "$150");
        WebElement total2 = driver.findElement(By.xpath("//div[@class='col col-8']//following-sibling::div"));
        Assert.assertEquals(total2.getText() ,"$330.20");
    }

    }