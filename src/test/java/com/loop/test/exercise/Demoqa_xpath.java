package com.loop.test.exercise;

import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demoqa_xpath {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Joe");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Biden");
        WebElement eMail = driver.findElement(By.id("userEmail"));
        eMail.sendKeys("president@of.usa");
        WebElement gender = driver.findElement(By.cssSelector("label[for=gender-radio-1]"));
        gender.click();
        WebElement number = driver.findElement(By.id("userNumber"));
        number.sendKeys("2000000001");
        Thread.sleep(1000);
        WebElement dOB = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
dOB.sendKeys(Keys.CONTROL+"a");
        Thread.sleep(1000);
        dOB.sendKeys("01 Jun 2022"+ Keys.ENTER);
      try {
          WebElement subject = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
       subject.click();
          subject.sendKeys(Keys.ENTER);
          subject.sendKeys("En");
      }catch (Exception e){
          System.out.println("don't care");
      } Thread.sleep(1500);
        WebElement hobbies = driver.findElement(By.cssSelector("label[for=hobbies-checkbox-1]"));
        hobbies.click();
        Thread.sleep(2000);
        //        Thread.sleep(1500);
//        WebElement chooseFile = driver.findElement(By.cssSelector("input[id='uploadPicture']"));
//        chooseFile.click();
//        Thread.sleep(1000);
        WebElement address = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Current Address')]"));
        address.sendKeys("17 & H St , Washington DC");
        driver.quit();
    }
}