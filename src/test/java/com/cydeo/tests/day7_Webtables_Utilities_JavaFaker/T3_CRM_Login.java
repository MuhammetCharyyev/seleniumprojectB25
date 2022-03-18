package com.cydeo.tests.day7_Webtables_Utilities_JavaFaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {



    @Test
    public void crm_login_test(){
        // 2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
//5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

//        6. Verify title is as expected:
//        Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");

    }

    @Test
    public void crm_login_test2(){
        // 2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver);//called from CRM_Utilities class we created for login

//        6. Verify title is as expected:
//        Expected: Portal

        BrowserUtils.verifyTitle(driver, "Portal");

    }

    @Test
    public void crm_login_test3(){
        // 2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,
                "helpdesk2@cybertekschool.com", "UserUser");
        //called from CRM_Utilities class we created for login
//this is second option with indication username and password in arguments along with driver

//        6. Verify title is as expected:
//        Expected: Portal

        BrowserUtils.verifyTitle(driver, "(2) Portal");

    }



}
/*
TC #3: Login scenario
 1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to Log In button
6. Verify title is as expected:
Expected: Portal

USERNAME  PASSWORD
helpdesk1@cybertekschool.com  UserUser
Helpdesk2@cybertekschool.com  UserUser
 */