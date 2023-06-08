package com.loop.test.home_task.day2;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Docuport {
    public static void main(String[] args )throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement login = driver.findElement(By.cssSelector("input#input-14"));
        login.sendKeys("b1g2_client@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input#input-15"));
        password.sendKeys("Group2");
        WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();
        Thread.sleep(1000);
        WebElement homeIcon = driver.findElement(By.cssSelector("i[class='v-icon notranslate mdi mdi-home theme--light']"));
        if(homeIcon.isDisplayed()){
            System.out.println("Login was successful");
        }else {
            System.out.println("Login was unsuccessful");
        }
        Thread.sleep(1000);
        WebElement dropDown=driver.findElement(By.cssSelector("div[class='v-avatar primary']>span"));
        dropDown.click();
        Thread.sleep(3000);
        WebElement logOut = driver.findElement(By.cssSelector("div#list-item-88"));
        logOut.click();
        WebElement loginHeader = driver.findElement(By.cssSelector("img[alt='Docuport']"));
        String expectedLoginHeader = "Docuport";
        boolean actualLoginHeader =loginHeader.isDisplayed();
        if(actualLoginHeader){
            System.out.println("Logout successful");
        }else {
            System.out.println("Logout not successful");
        }

        Thread.sleep(1500);
        driver.quit();
    }
}
