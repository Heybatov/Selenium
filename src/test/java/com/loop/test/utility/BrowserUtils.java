package com.loop.test.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtils {
    /**
     * validate id driver switched to expected url and title
     *
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Uncle Rusik
     * implements assertion
     * note: usually we do not do validation in method , this is for practice purpose
     */
    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle) {

        expectedUrl = expectedUrl.toLowerCase();
        expectedTitle = expectedTitle.toLowerCase();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * switches to new window by the exact title
     * return to origin window if windows with given title not found
     */
    public static void switchToWindow(WebDriver driver, String targetTitle) {

//        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
//        driver.switchTo().window(origin);
    }

    /**
     * @param driver
     * @param expectedTitle
     * @author Uncle Rusik
     * <p>
     * note: return void , assertion is implemented
     */
    public static void validateTitle(WebDriver driver, String expectedTitle) {
        assertTrue(driver.getTitle().contains(expectedTitle));

    }

    /**
     * Click any for loop
     *
     * @param nameOfPage
     */
    public static void loopLinkClick(String nameOfPage) {
        WebElement element =Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


    /**
     * method that will hover over
     *
     * @param element
     */
    public static void hoverOver(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * method which scrolls to the given element
     *
     * @param element
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoVie(true);", element);
    }

    /**
     * method which scroll to element and click js
     *
     * @param element
     */
    public static void scrollAndClick(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoVie(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * this method will double click any given element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick().perform();
    }

    /**
     * waits for providing element to be visible
     *
     * @param element
     * @param timeToWaitSec
     * return element
     * @author Uncle Rusik
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * waits for providing element to be not visible
     *
     * @param element
     * @param timeToWaitSec
     * @author Uncle Rusik
     */
    public static void waitForInvisibility(WebElement element, int timeToWaitSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
         wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * waits for providing element to be clickable
     * @param element
     * @param timeToWaitSec
     * @return
     * @author Uncle Rusik
     */
    public static WebElement waitForClickable(WebElement element, int timeToWaitSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * method performs a pause
     * @param seconds
     */
    public static void justWait(int seconds){
      try{  Thread.sleep(seconds*1000);
    }catch (InterruptedException e){
          e.printStackTrace();
      }
    }



}