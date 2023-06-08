package com.loop.test.home_task.day5;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Alert_T1 extends TestBase {
    @Test
    public void task() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton1.click();
        driver.switchTo().alert().accept(); //3. handle alert
//        Thread.sleep(5000);


        WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        alertButton2.click();
        Thread.sleep(5100);
        driver.switchTo().alert().accept();  //6. click - On button click, confirm box will appear

        WebElement alertButton3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        alertButton3.click();
        driver.switchTo().alert().accept();
        String actualConfirmationText = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        String expectedConfirmationText = "You selected Ok"; //7. click ok and validate - You selected Ok
        assertEquals(expectedConfirmationText, actualConfirmationText);

        alertButton3.click();
        driver.switchTo().alert().dismiss();
        String actualConfirmationText1 = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
        String expectedConfirmationText1 = "You selected Cancel"; //7. click ok and validate - You selected Ok
        assertEquals(expectedConfirmationText1, actualConfirmationText1); //8. after that do it again this time cancel and validate - You selected Cancel
        Thread.sleep(1000);
        WebElement alertButton4 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertButton4.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Loop Academy");
        alert.accept();

        WebElement confirmationTextPrompt = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String actualPromptText = confirmationTextPrompt.getText();
        String expectedPromptText = "You entered Loop Academy";
        assertEquals(actualPromptText,expectedPromptText);

    }
}
