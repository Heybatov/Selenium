package com.loop.test.home_task.day5;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Alert_T2 extends TestBase {

    @Test
    public  void alertTest()  {
        driver.get("https://demoqa.com/nestedframes/");
        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc ='<p>Child Iframe</p>']")));
        WebElement textBox = driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));


        String actual = textBox.getText();
        String expected= "Child Iframe";
        System.out.println("expected child= " + expected);
        assertEquals(actual,expected);

        driver.switchTo().parentFrame();
        WebElement textOfParent = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
        String actualParent = textOfParent.getText();
        String expectedParent = "Parent frame";
        System.out.println("expectedParent = " + expectedParent);
        assertEquals(actualParent , expectedParent);

        driver.switchTo().defaultContent();

        WebElement nestedText = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));

        String actualNestedText = nestedText.getText();
        String expectedNestedText="Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";

        assertEquals(actualNestedText,expectedNestedText);
        System.out.println("expectedNestedText = " + expectedNestedText);

    }
}
/*
1. go to https://demoqa.com/nestedframes
2. Validate "Child Iframe" text
3. Validate "Parent Iframe" text
4. Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspected or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."

 */
