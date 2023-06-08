package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_dropdown_without_select {

    WebDriver driver;

    //    String expected ;
//    String actual;
    @BeforeMethod
    public void setUpMethod() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        WebDriverFactory.wait(driver, 10);
        driver.get("https://beta.docuport.app/");
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


    @Test
    public void testDropdown() {

        WebElement username = driver.findElement(By.xpath("//input[@id='input-14']"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement password = driver.findElement(By.xpath("//input[@id='input-15']"));
        password.sendKeys(DocuportConstants.PASSWORD_ADVISOR);


        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();


        WebElement reciveDoc = driver.findElement(By.xpath("//span[.='Received docs']"));
        reciveDoc.click();


        WebElement searchButton = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));

        searchButton.click();

//        WebElement statusButton = driver.findElement(By.xpath("(//label[.='Status']/../div/following-sibling::div)[2]"));
//        statusButton.click();
// THE SAME AS A NEXT XPATH

        WebElement status = driver.findElement(By.xpath("//label[contains(text(),'Status')]"));
        status.click();


        WebElement inProgress = driver.findElement(By.xpath("//div[contains(text(),'In progress')]"));

        inProgress.click();
    }


}
