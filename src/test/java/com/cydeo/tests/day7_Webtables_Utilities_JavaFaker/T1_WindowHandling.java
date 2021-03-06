package com.cydeo.tests.day7_Webtables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // * 1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// * 2. Go to Go to : https://www.amazon.com/
        driver.get("Go to : https://www.amazon.com/");

    }

    @Test

    public void window_handling_test(){

       // 3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com/%27,%27_blank%27);%22);");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com/%27,%27_blank%27);%22);");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com/%27,%27_blank%27);%22);");

        // 4. Create a logic to switch to the tab where Etsy.com is open
//        Set<String> allWindowsHandles = driver.getWindowHandles();
//
//        for (String each : allWindowsHandles) {
//
//            driver.switchTo().window(each);
//
//            System.out.println("Current Url is : " + driver.getCurrentUrl());
//
//            if (driver.getCurrentUrl().contains("etsy")){
//                break;
//            }
//
//        }

        //5. Assert: Title contains “Etsy”

//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Etsy";
//
//        Assert.assertTrue(actualTitle.contains(expectedTitle));


        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");
        //called method from created class 'BrowserUtils' instead of above stated
        //basically we copied above method to the 'BrowserUtils'

    }

}
/**
 TC #1: Window Handle practice
 1. Create new test and make set ups
 2. Go to : https://www.amazon.com/
 3. Copy paste the lines from below into your class
 4. Create a logic to switch to the tab where Etsy.com is open
 5. Assert: Title contains “Etsy”

 Lines to be pasted:
 ((JavascriptExecutor) driver).executeScript("window.open('http://google.com/%27,%27_blank%27);%22);
 ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com/%27,%27_blank%27);%22);
 ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/%27,%27_blank%27);%22);

 These lines will simply open new tabs using something called JavascriptExecutor
 and get those pages. We will learn JavascriptExecutor later as well.
 */