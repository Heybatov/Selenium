package com.loop.test.exercise;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsyXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");

        WebElement findMOthersGiftButton = driver.findElement(By.cssSelector("span.wt-display-table-cell.wt-text-left-xs"));
        findMOthersGiftButton.click();
        Thread.sleep(1000);

        WebElement jeweleryIcon = driver.findElement(By.xpath("(//a[@class='wt-hide-xs wt-show-md wt-text-caption wt-arrow-link wt-arrow-link--forward'])[2]"));
        jeweleryIcon.click();

        WebElement shopItem1 = driver.findElement(By.xpath("//a[@class='wt-btn wt-btn--outline wt-pl-xs-7 wt-pr-xs-7 wt-mt-xs-4']"));
        shopItem1.click();
        Thread.sleep(1500);
        WebElement selectMaterial = driver.findElement(By.xpath("(//div[@class='wt-validation wt-mb-xs-2'])[1]"));
        selectMaterial.click();
        Thread.sleep(1000);
        WebElement selectGoldSingleStud = driver.findElement(By.cssSelector("option[value='3137953374']"));
        selectGoldSingleStud.click();
        Thread.sleep(1000);
        WebElement selectOption = driver.findElement(By.cssSelector("select#variation-selector-1"));
        selectOption.click();
        Thread.sleep(1000);
        WebElement selectScriptOption = driver.findElement(By.cssSelector("option[value='2633163104']"));
        selectScriptOption.click();
        Thread.sleep(1000);
        WebElement personalization = driver.findElement(By.cssSelector("textarea#listing-page-personalization-textarea"));
        personalization.sendKeys("A");
        WebElement addToCardButton = driver.findElement(By.cssSelector("div[data-selector='add-to-cart-button']"));
        addToCardButton.click();
        Thread.sleep(1000);
        WebElement checkoutProceed = driver.findElement(By.cssSelector("span[class='submit-button-text']"));
        checkoutProceed.click();
        Thread.sleep(1000);

        WebElement guestButton = driver.findElement(By.xpath("(//button[@class='wt-btn wt-btn--secondary wt-width-full'])[1]"));
        guestButton.click();
        WebElement emailButton = driver.findElement(By.cssSelector("input[id='shipping-form-email-input']"));
        emailButton.sendKeys("nba@nba.com");

        WebElement comfirmEmail = driver.findElement(By.cssSelector("input[id='shipping-form-email-confirmation']"));
        comfirmEmail.sendKeys("nba@nba.com");

        WebElement countryChoose = driver.findElement(By.cssSelector("select[id='country_id10-select']"));
        countryChoose.click();
        Thread.sleep(1000);
        WebElement chooseCountry = driver.findElement(By.cssSelector("option[value='63']"));
        chooseCountry.click();
        Thread.sleep(2000);
        WebElement fullName = driver.findElement(By.cssSelector("input[id='name50-input']"));
        fullName.sendKeys("Hacked");
        Thread.sleep(1000);

        WebElement address = driver.findElement(By.cssSelector("input[id='first_line51-input']"));
        address.sendKeys("MashtagaKendi");
        Thread.sleep(1000);

        WebElement aptZip = driver.findElement(By.cssSelector("input[id='second_line52-input']"));
        aptZip.sendKeys("delixana");
        Thread.sleep(1000);

        WebElement postalCode = driver.findElement(By.cssSelector("input[id='zip53-input']"));
        postalCode.sendKeys("1000");

        WebElement city = driver.findElement(By.cssSelector("input[id='city54-input']"));
        city.sendKeys("Baku");

        WebElement continueCheckout = driver.findElement(By.xpath("(//button[@class='wt-btn wt-btn--filled wt-width-full'])[1]"));
        continueCheckout.click();
    }
}


