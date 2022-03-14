package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }

     /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    public static void switchWindowAndVerify (WebDriver driver, String expectedInURL, String expectedTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL is : " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    /*
 This method accepts a String "expectedTitle" and Asserts if it is true
  */
    public static void verifyTitle (WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    /*
    Creating utility for ExplicitWait to not repeat lines
     */
    public static void waitForInvisibility (WebElement webElement){
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //it does not necessary, in case of instability of page
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(), 10);
        //object from WebDriverWait to identify our wait time
        wait.until(ExpectedConditions.invisibilityOf(webElement));
        //tell to driver wait 10 sec until the loading bar will be invisible
    }



}

  /*
    1. Create a new class called BrowserUtils
    2. Create a method to make Task1 logic re-usable
    3. When method is called, it should switch window and verify title.


    Method info:
    • Name: switchWindowAndVerify
    • Return type: void
    • Arg1: WebDriver
    • Arg2: String expectedInUrl
    • Arg3: String expectedTitle
     */
