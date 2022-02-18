package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alerts_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // * 1. Open Chrome browser
        // * 2. Go to https://practice.cydeo.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    //3. Click to “Click for JS Alert” button

    @Test
    public void clickAlertBtn(){


    }



}
/**
 * TC #1: Information alert practice
 * 1. Open browser
 * 2. Go to website: http://practice.cydeo.com/javascript_alerts
 * 3. Click to “Click for JS Alert” button
 * 4. Click to OK button from the alert
 * 5. Verify “You successfully clicked an alert” text is displayed.
 */