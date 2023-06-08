package com.loop.test.day3_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* go to http://the-internet.herokuapp.com/forgot_password
 *  locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
 *  css
 * verify those elements are displayed
 */

public class T5_css_xpath_isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        driver.manage().window().maximize();
        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        if (forgetPasswordHeading.isDisplayed()){
            System.out.println("Forget password heading is displayed");
        } else {
            System.out.println("Forget password heading is NOT displayed");
        }


        WebElement emailHeading= driver.findElement(By.cssSelector("label[for=email]"));
        Thread.sleep(3000);
        if (emailHeading.isDisplayed()){
            System.out.println("Forget email heading is displayed");
        } else {
            System.out.println("Forget email heading is NOT displayed");
        }
        driver.quit();
    }
}
