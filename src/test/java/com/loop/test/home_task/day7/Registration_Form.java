package com.loop.test.home_task.day7;

import com.github.javafaker.Faker;
import com.loop.test.utility.ConfigurationReader;
import com.loop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class Registration_Form {
    @Test
    public void form_test() {

        Driver.getDriver().get(ConfigurationReader.getProperty("loop.app"));
        WebElement registrationForm = Driver.getDriver().findElement(By.xpath("//a[.='Registration Form']"));
        registrationForm.click();

        Faker faker = new Faker();
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.bothify("???###"));

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());

        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("202-###-####"));

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        gender.click();

        SimpleDateFormat day = new SimpleDateFormat("MM/dd/yyyy");


        String dob = day.format(faker.date().birthday());

        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(dob);

        Select select = new Select(Driver.getDriver().findElement(By.name("department")));
        select.selectByValue("MO");

        select = new Select(Driver.getDriver().findElement(By.name("job_title")));
        select.selectByVisibleText("Developer");

        Driver.getDriver().findElement(By.xpath("//input[@value='java']")).click();

        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();


    }


}

