package com.cydeo.tests.day12_page_object_model_synchro;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {


    @Test
    public void dynamic_load_test() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //from Selenium, use 'wait' to create our expected condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //wait time until title of page will be "Dynamic title", give time to page to be loaded


        //create object to reach and assert webelements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();
        //constructor from created DynamicLoad7Page

        // * 3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        //check if the dedicated message is appeared

        // * 4. Assert: Image is displayed.
        // * Note: Follow POM
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
        //check if the image  is appeared

    }

    @Test
    public void dynamic_load_1_test() {
        // Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");


    }
}
/**
 * TC#4 : Dynamically Loaded Page Elements 7
 * 1. Go to https://practice.cydeo.com/dynamic_loading/7
 * 2. Wait until title is “Dynamic title”
 * 3. Assert: Message “Done” is displayed.
 * 4. Assert: Image is displayed.
 * Note: Follow POM
 */

/**
 * TC#5 : Dynamically Loaded Page Elements 1
 * 1. Go to https://practice.cydeo.com/dynamic_loading/1
 * 2. Click to start
 * 3. Wait until loading bar disappears
 * 4. Assert username inputbox is displayed
 * 5. Enter username: tomsmith
 * 6. Enter password: incorrectpassword
 * 7. Click to Submit button
 * 8. Assert “Your password is invalid!” text is displayed.
 * Note: Follow POM Design Pattern
 */