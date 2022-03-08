package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test() {

        //* 1. Open browser
        // * 2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        //'getDriver()' from 'Driver', will return a browser, follow to all path via config
        // get() from 'config.prop' will return a value as a String

        //creat a JavaFaker to input random data
        Faker faker = new Faker();

        // * 3. Enter first name
        WebElement inputFirstName =
                Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //instead of old 'driver' used Driver.getDriver()
        inputFirstName.sendKeys(faker.name().firstName());//input fake first name into a field

        // * 4. Enter last name
        WebElement inputLastName =
                Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        //instead of old 'driver' used Driver.getDriver()
        inputLastName.sendKeys(faker.name().lastName());//input fake last name into a field

        // * 5. Enter username
        WebElement userName =
                Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //instead of old 'driver' used Driver.getDriver()
        //userName.sendKeys(faker.name().username().replaceAll(".", ""));
        //input fake username into a field and remove dots from fake username, or:
       String user = faker.bothify("helpdesk###");
       //create String to make reference inside the email filed
        userName.sendKeys(user); //helpdesk with random digits

        // * 6. Enter email address
        WebElement email =
                Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        //instead of old 'driver' used Driver.getDriver()
        email.sendKeys(user+ "@email.com");
        //input 'user' as String with random digits into a field

        // * 7. Enter password
        WebElement password =
                Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.numerify("########"));
        // or you can combine digits, symbols, letters just make it faker.bothify(##??--),
        // #-is for digits, ?-is for letters, and symbols as you wish

        // * 8. Enter phone number
        WebElement phoneNum =
                Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNum.sendKeys(faker.numerify("###-###-####"));

        // * 9. Select a gender from radio buttons
        WebElement gender =
                Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();

        // * 10. Enter date of birth
        WebElement dateBirth =
                Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
       // faker.number().numberBetween(2003,1900); //make a limit in year of birth, optional
        dateBirth.sendKeys("03/08/2000");

        // * 11. Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement
                                   (By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //'selectByIndex' way to select any directory by index number in a dropdown
        //you may indicate limit by 'numberBetween(1,9)' if you know how many indexes

        // * 12. Select Job Title
        // * 13. Select programming language from checkboxes
        // * 14. Click to sign up button
// * 15. Verify success message “You’ve successfully completed registration.” is displayed.



    }
}
/**
 * TC#1: Registration form confirmation
 * Note: Use JavaFaker OR read from configuration.properties file when possible.
 * 1. Open browser
 * 2. Go to website: https://practice.cydeo.com/registration_form
 * 3. Enter first name
 * 4. Enter last name
 * 5. Enter username
 * 6. Enter email address
 * 7. Enter password
 * 8. Enter phone number
 * 9. Select a gender from radio buttons
 * 10. Enter date of birth
 * 11. Select Department/Office
 * 12. Select Job Title
 * 13. Select programming language from checkboxes
 * 14. Click to sign up button
 * 15. Verify success message “You’ve successfully completed registration.” is
 * displayed.
 *
 *
 * Note:
 * 1. Use new Driver utility class and method
 * 2. User JavaFaker when possible
 * 3. User ConfigurationReader when it makes sense
 */