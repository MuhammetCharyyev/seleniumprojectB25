package com.cydeo.tests.day2_locators_getYext_getAttribute.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_EtsyTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//maximize the window

        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        //use .get() or navigate().to() to get particular web
//3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        //getting the element of 'Inspect'->'name="search_query"
        etsySearchBox.sendKeys("wooden spoon"+ Keys.ENTER);//allow you to enter
        // particular word in a search box ant then pushing the 'Enter');

//        4. Verify title:// Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon | Etsy";
        String actualInTitle = driver.getTitle();

        if (actualInTitle.startsWith(expectedInTitle)) {
            //checking if actual title even start with expected
            System.out.println("The title is matched, test passed");
        } else {
            System.out.println("The title is not matched, test failed");
        }




    }

}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */