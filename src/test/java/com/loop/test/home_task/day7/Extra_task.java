package com.loop.test.home_task.day7;


import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.DocuportUtils;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.loop.test.utility.Driver.driver;
import static com.loop.test.utility.Driver.getDriver;

public class Extra_task {

    @Test
    public void test_login_docuport() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebDriver driver1 = Driver.getDriver();
        DocuportUtils.login(driver1, "client");
        WebElement myUploadLeft = driver1.findElement(By.xpath("//span[contains(text(),'My uploads')]"));
        myUploadLeft.click();
        WebElement uploadDocuments = driver1.findElement(By.xpath("//span[contains(text(),'Upload documents')]"));
        uploadDocuments.click();
        Thread.sleep(1000);
        WebElement uploadFile = driver1.findElement(By.xpath("//input[@type='file']"));
        String path = "C://Users//geyba//Desktop//dont_open_18+.jpg";
        uploadFile.sendKeys(path);
        Thread.sleep(1500);
        WebElement service = driver1.findElement(By.xpath("(//div[@class='v-input__icon v-input__icon--append'])[2]"));
        service.click();

        Thread.sleep(1500);

        WebElement bookkeeping = driver1.findElement(By.xpath("//div[contains(text(),'Bookkeeping')]"));
        bookkeeping.click();

        Thread.sleep(1000);
        WebElement irs = driver1.findElement((By.xpath("//h6[.=' Doc Type ']/../following-sibling::div/span")));
        irs.click();
        WebElement quarter = driver1.findElement(By.xpath("(//span[.=' Q2 '])[3]/following-sibling::span"));
        quarter.click();
        Thread.sleep(1000);
        WebElement description = driver1.findElement(By.xpath("//label[.='Description']/following-sibling::textarea"));
        description.click();
        description.sendKeys("I told you , do not open file");

        WebElement upload = driver1.findElement(By.xpath("//button[@type='submit']"));
        upload.click();
    }
}
