package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    /*
    this method will login with helpdesk@cybertekschool.com user when it's called
     */
    public static void srm_login(WebDriver driver) {
//USERNAME  PASSWORD
//helpdesk1@cybertekschool.com  UserUser
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();


    }

    public static void srm_login(WebDriver driver, String username, String password) {
//USERNAME  PASSWORD
//helpdesk1@cybertekschool.com  UserUser
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);
        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        //5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();


    }

}
/**
 * TC #4: Create utility method
 *  1. Create a new method for login
 * 2. Create a method to make Task3 logic re-usable
 * 3. When method is called, it should simply login
 *
 * This method should have at least 2 overloaded versions.
 *
 * Method #1 info:
 * • Name: login_crm()
 * • Return type: void
 * • Arg1: WebDriver
 *
 *
 * Method #2 info:
 * • Name: login_crm()
 * • Return type: void
 * • Arg1: WebDriver
 * • Arg2: String username
 * • Arg3: String password
 */