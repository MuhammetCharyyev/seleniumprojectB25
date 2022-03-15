package com.cydeo.tests.day13_review_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage; //object from DynamicControlsPage

    @BeforeMethod
    public void setUp() {
        // * 2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();//object from DynamicControlsPage

    }

    @Test
    public void remove_button_test() {

        //* 3- Click to “Remove” button
        dynamicControlsPage.removeBtn.click();
        //click on 'remove' btn using location we created in 'DynamicControlsPage'

        // * 4- Wait until “loading bar disappears”

        BrowserUtils.waitForInvisibility(dynamicControlsPage.loadingBar);
        //method from BrowserUtils to wait until loading bar is running and will be invisible

        // * 5- Verify:
        // * a. Checkbox is not displayed
        try {
            Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());//checkbox disappeared and not displayed
            //assertFalse method will pass the test if the boolean value returned is: false
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());//no need to have both, as they both do the same
        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }
//this try/catch block will help execute test besides the false about NoSuchElementException
        // when checkbox is not displayed after clicking

        // * b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.goneMess.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.goneMess.getText().equals("It's gone!"));

    }

    @Test
    public void enable_button_test() {

        // * 3- Click to “Enable” button
        System.out.println("before click inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());
        //check if input box is enabled before clicking

//        System.out.println("dynamicControlsPage.enableBtn.isEnabled() = "
//                + dynamicControlsPage.enableBtn.isEnabled());
//        //check if this btn is enabled before click

        dynamicControlsPage.enableBtn.click();//from DynamicControlsPage

        System.out.println("after click inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());
        //check if input box is enabled after clicking

        // * 4- Wait until “loading bar disappears”
        //Calling our ExplicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibility(dynamicControlsPage.loadingBar);
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = "
                + dynamicControlsPage.inputBox.isEnabled());

        // * 5- Verify:
        // * a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        // * b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.goneMess.isDisplayed());

        //Check string values is matching as expected
        Assert.assertTrue(dynamicControlsPage.goneMess.getText().equals("It’s enabled!"));

    }
}
/**
 * TC #2: Explicit wait practice
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/dynamic_controls
 * 3- Click to “Remove” button
 * 4- Wait until “loading bar disappears”
 * 5- Verify:
 * a. Checkbox is not displayed
 * b. “It’s gone!” message is displayed.
 * <p>
 * NOTE: FOLLOW POM
 * <p>
 * TC #3: Explicit wait practice
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/dynamic_controls
 * 3- Click to “Enable” button
 * 4- Wait until “loading bar disappears”
 * 5- Verify:
 * a. Input box is enabled.
 * b. “It’s enabled!” message is displayed.
 */

/**
 * TC #3: Explicit wait practice
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/dynamic_controls
 * 3- Click to “Enable” button
 * 4- Wait until “loading bar disappears”
 * 5- Verify:
 * a. Input box is enabled.
 * b. “It’s enabled!” message is displayed.
 */