package com.cydeo.tests.day2_locators_getYext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window
        //2- Go to: https://google.com
        driver.get("https://google.com ");

        //3- Write “apple” in search box
        //4- press 'Enter' using Keys.ENTER
        WebElement googleSearchBox = driver.findElement(By.name("q"));//getting the element
        // of 'Inspect'->'searchbox->next'q'

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);//allow you to enter
        // particular word in a search box ant then pushing the 'Enter'

        //5- Verify title://Expected: Title should start with “apple” word
        //verifying title allows us to understand if we on the right page
        String expectedInTitle = "apple";
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
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” word
 */