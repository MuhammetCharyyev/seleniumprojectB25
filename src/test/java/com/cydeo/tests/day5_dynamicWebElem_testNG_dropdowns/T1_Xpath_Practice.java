package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
        // WebElement addElementBtn =
        // driver.findElement(By.xpath("//button[.='Add Element']"));//by text
        WebElement addElementBtn =
                driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementBtn.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='added-manually']"));

        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
// 5. Click to “Delete” button.
        deleteBtn.click();
// 6. Verify “Delete” button is NOT displayed after clicking.
//when we're trying to find it is displayed or not it gives us StaleElementReferenceException
        try { //handle with exception
            System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("-->StaleElementReferenceException exception is thrown");
            System.out.println("-->This means the web element is completely deleted from the page");
            System.out.println("deleteButton.isDisplayed() = false");
        }

        }
}
/**
 * TC #1: StaleElementReferenceException handling
 * 1. Open Chrome browser
 * 2. Go to https://practice.cydeo.com/add_remove_elements/
 * 3. Click to “Add Element” button
 * 4. Verify “Delete” button is displayed after clicking.
 * 5. Click to “Delete” button.
 * 6. Verify “Delete” button is NOT displayed after clicking.
 */