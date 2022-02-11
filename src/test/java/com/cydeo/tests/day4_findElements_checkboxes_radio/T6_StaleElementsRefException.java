package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementsRefException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //providing extra wait time before it throws NoSuchElement Exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed
        WebElement linkCydeo = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("Is Cydeo link is displayed? " + linkCydeo.isDisplayed());
        //return with true or false if it's displayed or not

        //4- Refresh the page
        driver.navigate().refresh();

       // 5- Verify it is displayed, again.
        linkCydeo = driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("Is Cydeo link is displayed after page refreshing? " + linkCydeo.isDisplayed());

        //after refreshing the system gives the StaleElementReferenceException
        //But you can reassign again and refresh the element linkCydeo reference
        //you need to re-assign again and again after refreshing the page


    }

}
/*
TC #6: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
 */