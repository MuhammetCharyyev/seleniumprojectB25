package com.cydeo.tests.day2_locators_getYext_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_ZeroBank_HeaderVerification {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”

        WebElement headerText = driver.findElement(By.tagName("h3"));
        //searching By tag name, found through 'Inspect' the <h3/h3>...
        String expectedHeadText = "Log in to ZeroBank";

        String actualHeadText = headerText.getText();
        //assign because we need to get return as a String "Log in to ZeroBank"

        if (actualHeadText.equals(expectedHeadText)) {
            System.out.println("header text verification passed");
        } else {
            System.out.println("header text verification failed");
        }

    }

}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */