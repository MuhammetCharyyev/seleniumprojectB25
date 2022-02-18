package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // * 1. Open Chrome browser
        // * 2. Go to https://practice.cydeo.com/dropdown

       driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropDownTest(){

        // * 3. Verify “Simple dropdown” default selected value is correct
        // * Expected: “Please select an option”

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        //using the 'Select' class of Selenium we create the object which helps
        // us to select the found element

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        //assigning to the WebElement to determine the first selected option in dropdown menu

        String actualSimpleDropdownText = currentlySelectedOption.getText();
        //assigning the WebElement to the String to receive text
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText);

//* 4. Verify “State selection” default selected value is correct
// * Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        //helps us to determine the text of first selected option and compare with expected

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);

    }

}
/**
 * TC#4: Verifying “Simple dropdown” and “State selection” dropdown
 * default values
 * 1. Open Chrome browser
 * 2. Go to https://practice.cydeo.com/dropdown
 * 3. Verify “Simple dropdown” default selected value is correct
 * Expected: “Please select an option”
 * 4. Verify “State selection” default selected value is correct
 * Expected: “Select a State”
 */