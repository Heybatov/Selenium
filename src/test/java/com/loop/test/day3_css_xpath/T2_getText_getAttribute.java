package com.loop.test.day3_css_xpath;

import com.loop.test.utility.DemoQaConstants;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();

//        WebElement studentForm = driver.findElement(By.tagName("h5"));
        String actualHeaderForForm = driver.findElement(By.tagName("h5")).getText();

        if (actualHeaderForForm.equals(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected header message: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header message: \"" + actualHeaderForForm + "\" = Test PASSED");
        } else {
            System.out.println("Expected header message: \"" + DemoQaConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header message: \"" + actualHeaderForForm);
            System.err.println("TEST FAILED");
        }


// get placeholder
        WebElement firstNamePlaceHolder = driver.findElement(By.id("firstName"));
        String actualPlaceHolderFirstName = firstNamePlaceHolder.getAttribute("placeholder");

        if (actualPlaceHolderFirstName.equals(DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME)){
            System.out.println("Expected placeholder: \"" + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME + "\", matches actual placeholder: \"" + actualPlaceHolderFirstName + "\" = Test PASSED");
        } else {
            System.out.println("Expected placeholder: \"" + DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME + "\", DOES NOT match actual placeholder: \"" + actualPlaceHolderFirstName);
            System.err.println("TEST FAILED");
        }
        driver.quit();


        driver.quit();
    }
}
