package com.cydeo.tests.day5_dynamicWebElem_testing_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_Xpath_Practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //providing extra wait time before it throws NoSuchElement Exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        WebElement addElementBtn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementBtn.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
// 5. Click to “Delete” button.
// 6. Verify “Delete” button is NOT displayed after clicking.
        deleteBtn.click();

       System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());


    }
}
/**
 TC #1: StaleElementReferenceException handling
 1. Open Chrome browser
 2. Go to https://practice.cydeo.com/add_remove_elements/
 3. Click to “Add Element” button
 4. Verify “Delete” button is displayed after clicking.
 5. Click to “Delete” button.
 6. Verify “Delete” button is NOT displayed after clicking.

 */