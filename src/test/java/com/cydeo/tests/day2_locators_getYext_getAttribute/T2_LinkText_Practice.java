package com.cydeo.tests.day2_locators_getYext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {


    public static void main(String[] args) {

       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window
//2- Go to: https://practice.cydeo.com/
        driver.navigate().to("https://practice.cydeo.com/");

//3- Click to A/B Testing from top of the list.
       // driver.findElement(By.linkText("A/B Testing")).click();//click()-> clicking to link
        //if you misspell some in linkText the system will give you NoSuchElementException
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click(); // long way to click the link but easy to understand conception

        //4- Verify title is: //  Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("The title is matched, test passed");
        } else {
            System.out.println("The title is not matched, test failed");
        }

        //5- Go back to home page by using the .back();

        driver.navigate().back();//go back to previous page

//6- Verify title equals://  Expected: Practice
        expectedTitle = "Practice";//re-assigning variable to expectedTitle
        actualTitle = driver.getTitle(); //re-assigning variable to actualTitle

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
2- Go to: https://practice.cydeo.com/
3- Click to A/B Testing from top of the list.
4- Verify title is:
  Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
  Expected: Practice
 */