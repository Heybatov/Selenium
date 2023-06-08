package com.loop.test.home_task.day6;

import com.loop.test.base.TestBase;
import com.loop.test.utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DocuportExtra extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://app.docuport.app/company-formation/resident");
        driver.findElement(By.xpath("//label[.='Corporation']")).click();
        assertTrue(driver.findElement(By.xpath("//label[.='Corporation']//preceding-sibling::div/input")).isSelected(), "CORPORATION IS NOT SELECTED");
        driver.findElement(By.xpath("//label[.='Virginia']")).click();
        assertTrue(driver.findElement(By.xpath("//label[.='Virginia']//preceding-sibling::div/input")).isSelected(), "VIRGINIA IS NOT SELECTED");
        driver.findElement(By.xpath("//label[.='LLC']")).click();
        assertTrue(driver.findElement(By.xpath("//label[.='LLC']//preceding-sibling::div/input")).isSelected(), "LLC IS NOT SELECTED");
        driver.findElement(By.xpath("//label[.='Maryland']")).click();
        assertTrue(driver.findElement(By.xpath("//label[.='Maryland']//preceding-sibling::div/input")).isSelected(), "MARYLAND IS NOT SELECTED");
        driver.findElement(By.xpath("//label[.='LLC']")).click();
        driver.findElement(By.xpath("//label[.='Legal Company Name  *']/following-sibling::input")).sendKeys("LoopAcademy");
        driver.findElement(By.xpath("//label[.='DBA (Doing Business As)']/following-sibling::input")).sendKeys("Boot Camp");
        driver.findElement(By.xpath("//label[contains(text(),'Industry')]/following-sibling::input")).click();
        driver.findElement(By.xpath("(//div[.='Accounting'])[2]")).click();
        driver.findElement(By.xpath("(//label[.='First name *']/following-sibling::input)[1]")).sendKeys("Nadir");
        driver.findElement(By.xpath("(//label[.='Last name *']/following-sibling::input)[1]")).sendKeys("Qabala");
        driver.findElement(By.xpath("(//label[.='Email address *']/following-sibling::input)[1]")).sendKeys("nadir@qabala.az");
        driver.findElement(By.xpath("(//label[.='Phone number *']/following-sibling::input)[1]")).sendKeys("2022020202");
        driver.findElement(By.xpath("//label[.='Fax']/following-sibling::input")).sendKeys("202020202");
        driver.findElement(By.xpath("(//span[.=' Next '])[1]")).click();
        driver.findElement(By.xpath("(//label[.='First name *']/following-sibling::input[1])[2]")).sendKeys("Ivanov");
        driver.findElement(By.xpath("(//label[.='Last name *']/following-sibling::input[1])[2]")).sendKeys("Ivan");
        driver.findElement(By.xpath("(//label[.='Middle name']/following-sibling::input[1])[1]")).sendKeys("Junior");
        driver.findElement(By.xpath("(//label[.='Address line 1 *']/following-sibling::input[1])[1]")).sendKeys("3601 e 36th street");
        driver.findElement(By.xpath("(//label[.='City *']/following-sibling::input[1])[1]")).sendKeys("Brooklyn");
        driver.findElement(By.xpath("(//label[.='Jurisdiction *']/following-sibling::input)[1]")).click();
        driver.findElement(By.xpath("(//div[.='Baltimore City'])[3]")).click();
        driver.findElement(By.xpath("(//label[.='Jurisdiction *']/following-sibling::input[1])[1]")).sendKeys("Charles City");
        driver.findElement(By.xpath("(//label[.='Zip code *']/following-sibling::input[1])[1]")).sendKeys("01234");
        driver.findElement(By.xpath("(//label[.='Email address']/following-sibling::input[1])[1]")).sendKeys("ivanovJunior@gmail.com");
        driver.findElement(By.xpath("(//label[.='Phone number *']/following-sibling::input[1])[2]")).sendKeys("92933344455");
        driver.findElement(By.xpath("(//span[.=' Next '])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//label[.='Member managed']")).click();
        driver.findElement(By.xpath("(//label[.='First name *']/following-sibling::input)[3]")).sendKeys("Ivanovich");
        driver.findElement(By.xpath("(//label[.='Last name *']/following-sibling::input)[3]")).sendKeys("Ivanka");
        driver.findElement(By.xpath("(//label[.='Middle name']/following-sibling::input)[2]")).sendKeys("Junior");
        driver.findElement(By.xpath("//label[.='Share Ownership (%) *']/following-sibling::input")).sendKeys("99");
        driver.findElement(By.xpath("//label[.='SSN of an Organizing Member *']/following-sibling::input")).sendKeys("555667788");
        driver.findElement(By.xpath("(//label[.='First name *']/following-sibling::input)[4]")).sendKeys("Ivan");
        driver.findElement(By.xpath("(//label[.='Last name *']/following-sibling::input)[4]")).sendKeys("Ivanov");
        driver.findElement(By.xpath("//span[.=' Go to payment ']")).click();
        Thread.sleep(1500);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@placeholder='Card number']")).sendKeys("5432654376548765");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys("0225");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.findElement(By.xpath("//input[@placeholder='CVC']")).sendKeys("122");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//span[contains(text(),'Pay')]")).click();
        String expectedMessage = "We are unable to authenticate your payment method. Please choose a different payment method and try again.";
        System.out.println(driver.findElement(By.xpath("//span[@class='body-1']")).getText());
        assertEquals(driver.findElement(By.xpath("//span[@class='body-1']")).getText(), expectedMessage);
    }
}