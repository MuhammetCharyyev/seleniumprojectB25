package com.cydeo.tests.day13_review_practices;

import com.cydeo.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    @BeforeMethod
    public void setUp() {
       // * 2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
    }

    @Test
    public void remove_button_test() {
   //* 3- Click to “Remove” button
   // * 4- Wait until “loading bar disappears”
  // * 5- Verify:
   // * a. Checkbox is not displayed
   // * b. “It’s gone!” message is displayed.

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
 *
 * NOTE: FOLLOW POM
 */