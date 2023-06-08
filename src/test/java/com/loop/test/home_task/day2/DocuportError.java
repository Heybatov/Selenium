package com.loop.test.home_task.day2;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DocuportError {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement userNamePlaceholder = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUserNamePlaceholderName = userNamePlaceholder.getText();
        String expectedUserNamePlaceholderName = "Username or email";
        if (actualUserNamePlaceholderName.equals(expectedUserNamePlaceholderName)) {
            System.out.println("Actual login placeholder name \"" + actualUserNamePlaceholderName + "\" matches to expected login placeholder name \"" + expectedUserNamePlaceholderName + "\" TEST PASSED!");
        } else {
            System.out.println("Actual login placeholder name \"" + actualUserNamePlaceholderName + "\" DOESN'T MATCH to expected login placeholder name \"" + expectedUserNamePlaceholderName + "\"");
            System.err.println("TEST FAILED!");
        }
        WebElement passwordPlaceholder = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordPlaceholderName = passwordPlaceholder.getText();
        String expectedPasswordPlaceholderName = "Password";
        if (actualPasswordPlaceholderName.equals(expectedPasswordPlaceholderName)) {
            System.out.println("Actual login placeholder name \"" + actualPasswordPlaceholderName + "\" matches to expected login placeholder name \"" + expectedPasswordPlaceholderName + "\" TEST PASSED!");
        } else {
            System.out.println("Actual login placeholder name \"" + actualPasswordPlaceholderName + "\" DOESN'T MATCH to expected login placeholder name \"" + expectedPasswordPlaceholderName + "\"");
            System.err.println("TEST FAILED!");
        }
        WebElement loginButton = driver.findElement(By.cssSelector("span.v-btn__content"));
        loginButton.click();
        WebElement loginError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
        String actualLoginErrorMessage = loginError.getText();
        String expectedLoginErrorMessage = "Please enter your username or email address";
        System.out.println("--------");
        if (expectedLoginErrorMessage.equals(actualLoginErrorMessage)) {
            System.out.println("Actual login error message \"" + actualLoginErrorMessage + "\" matches to expected login error message \"" + expectedLoginErrorMessage + "\" =TEST PASSED! ");
        } else {
            System.out.println("Actual login error message \"" + actualLoginErrorMessage + "\" DIDN'T match to expected login error message \"" + expectedLoginErrorMessage + "\"");
            System.err.println("TEST FAILED!");
        }
        WebElement passwordError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));
        String actualPasswordErrorMessage = passwordError.getText();
        String expectedPasswordErrorMessage = "Please enter your password";
        System.out.println("------");
        if (expectedPasswordErrorMessage.equals(actualPasswordErrorMessage)) {
            System.out.println("Actual password error message \"" + actualPasswordErrorMessage + "\" matches to expected password error message \"" + expectedPasswordErrorMessage + "\"=TEST PASSED! ");
        } else {
            System.out.println("Actual password error message \"" + actualPasswordErrorMessage + "\" DIDN'T match to expected password error message \"" + expectedPasswordErrorMessage + "\"");
            System.err.println("TEST FAILED!");
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
