package com.loop.test.day3_css_xpath;

import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();

//    WebElement userName = driver.findElement(By.cssSelector("input#input-14"));
//    userName.sendKeys(DocuportConstants.USERNAME_CLIENT);
//        WebElement userName = driver.findElement(By.cssSelector("span.v-tbn__content"));


        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));
        String docuport = logo.getAttribute("alt");

        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)) {
            System.out.println("Expetced logo text: \'" + DocuportConstants.LOGO_DOCUPORT + "\" matches actual logo text: \"" + docuport + "\" = Test Passed");
        } else {
            System.out.println("Expetced logo text: \'" + DocuportConstants.LOGO_DOCUPORT + "\" does not matches actual logo text: \"" + docuport + "\" =Test Failed");

        }

        WebElement userName = driver.findElement(By.cssSelector("input[id=input-14]"));
        userName.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement password = driver.findElement(By.cssSelector("input[type='password']")) ;
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']")) ;
        loginButton.click();

        Thread.sleep(3000);
        WebElement homeButton = driver.findElement(By.cssSelector("[class='v-icon notranslate mdi mdi-home theme--light']"));
//        homeButton.click();


        if (homeButton.isDisplayed()){
            System.out.println("Login was succesful");
        }else{
            System.out.println("Login failed");
        }


        driver.quit();


    }
}
