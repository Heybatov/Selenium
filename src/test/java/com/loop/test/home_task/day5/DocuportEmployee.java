package com.loop.test.home_task.day5;

import com.loop.test.base.TestBase;
import com.loop.test.utility.DocuportConstants;
import com.loop.test.utility.DocuportUtils;
import com.loop.test.utility.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DocuportEmployee extends TestBase {
    @Test
    public void test_webTables() throws InterruptedException {
        driver.get(DocuportConstants.DOCUPORT_URL);
        DocuportUtils.login(driver, DocuportConstants.EMPLOYEE);

        WebElement users = driver.findElement(By.xpath("//span[contains(.,'Users')]"));
        users.click();

        String actual = DocuportWebTableUtils.returnAnyField(driver, DocuportConstants.ALEX_EMAIL, DocuportConstants.FULL_NAME);
        String expected = DocuportConstants.ALEX_FULL_NAME;
        System.out.println(actual+" actual name");
        assertEquals(actual,expected);


        String actualUserName = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.ALEX_EMAIL , DocuportConstants.USERNAME);
        String expectedUserName = DocuportConstants.ALEX_USER_NAME ;
        System.out.println(actual+" actual name");
        assertEquals(actualUserName , expectedUserName);

        Thread.sleep(2000);

        String actualAdvisor = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.ALEX_EMAIL, DocuportConstants.USER_ADVISOR );
        String expectedAdvisor = DocuportConstants.ALEX_ADVISOR ;
        System.out.println("expectedAdvisor = " + expectedAdvisor);
        assertEquals(actualAdvisor,expectedAdvisor);


        String actualPhoneNumber = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.ALEX_EMAIL , DocuportConstants.USER_PHONE);
        String expectedPhone = DocuportConstants.ALEX_PHONE;
        System.out.println("expectedPhone = " + expectedPhone);
        assertEquals(actualPhoneNumber, expectedPhone);

        String actualRole = DocuportWebTableUtils.returnAnyField(driver,DocuportConstants.ALEX_EMAIL , DocuportConstants.USER_ROLE);
        String expectedRole = DocuportConstants.ALEX_ROLE;
        System.out.println("expectedRole = " + expectedRole);
        assertEquals(actualRole , expectedRole);
    }
}
