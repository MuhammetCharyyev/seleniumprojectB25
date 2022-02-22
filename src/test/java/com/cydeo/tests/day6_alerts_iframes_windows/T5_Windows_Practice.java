package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // * 1. Open Chrome browser
        // * 2. Go to https://practice.cydeo.com/windows

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiply_window_test5() {

        //storing the main pages window handle as String
        // is good practice for future reusable purposes
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //printed -> 'mainHandle = CDwindow-B45122B9BD3B94D8542FB03BF774D7F8'

        // 4. Assert: Title is “Windows”
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("title before click: " + actualTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        //6. Switch to new Window, Selenium switches focus to the new opened window
        for (String each : driver.getWindowHandles()) { //check all opened windows
            //getWindowHandles() returns to Strings
            driver.switchTo().window(each);
            System.out.println("current title while switching window: " + driver.getTitle());
        }

        // 7. Assert: Title is “New Window”
        String expectedTitleAfterClick = "New Window";

        actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitleAfterClick);

        System.out.println("title after click: " + actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();//will close New Window, driver.quit() will close both of windows
    }

}
/**
 * TC #5: Window Handle practice
 * <p>
 * 1. Create a new class called: T5_WindowsPractice
 * 2. Create new test and make set ups
 * 3. Go to : https://practice.cydeo.com/windows
 * 4. Assert: Title is “Windows”
 * 5. Click to: “Click Here” link
 * 6. Switch to new Window.
 * 7. Assert: Title is “New Window”
 */