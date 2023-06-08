package com.loop.test.day3_css_xpath;

import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("input-14"));
 userName.sendKeys(DocuportConstants.USERNAME_CLIENT);



// WebElement password = driver.findElement(By.id("input-15"));
// password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: \"" + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + "\", matches actual error message: \"" + actualErrorMessage + "\" = Test PASSED");
        } else {
            System.out.println("Expected error message: \"" + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + "\", DOES NOT match actual error message: \"" + actualErrorMessage);
            System.err.println("TEST FAILED");
        }

 Thread.sleep(1000);
 driver.quit();





    }
}
