package com.cydeo.tests.day2_locators_getYext_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_BackForth_Navigation {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right
        WebElement gmailButton = driver.findElement(By.className("gb_d"));
        gmailButton.click();

        //4- Verify title contains: Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("The title is matched, test passed");
        } else {
            System.out.println("The title is not matched, test failed");
        }

       // 5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals: Expected: Google
        expectedTitle = "Google";
       actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("The title is matched, test passed");
        } else {
            System.out.println("The title is not matched, test failed");
        }

    }

}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */