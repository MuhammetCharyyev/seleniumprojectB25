package com.cydeo.tests.day12_page_object_model_synchro;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_POM_Practice {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setUp() {
        // 1- Open a chrome browser
        // * 2- Go to: https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com/");

       // 3- Enter incorrect username or incorrect password
       libraryLoginPage = new LibraryLoginPage();
        //object from 'LibraryLoginPage'
    }

    @Test
    public void required_field_err_message_test() {

        // 4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();
        //just click the btn to verify err message without entering username and passw

       //5- Verify expected error is displayed:
        // * Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //error method from 'LibraryLoginPage'

        Driver.closeDriver();//close current driver but not terminate whole test
        //killing the object for current test but not for further tests

    }

    @Test
    public void invalid_email_error_test() {

        libraryLoginPage.inputUsername.sendKeys("somethingwrong");

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void library_negative_login_test() {

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();

//       4- Verify title expected error is displayed:
// * Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailPasswErrorMessage.isDisplayed());

    }
}
/**
 * TC #1: Required field error message test
 * 1- Open a chrome browser
 * 2- Go to: https://library1.cydeo.com
 * 3- Do not enter any information
 * 4- Click to “Sign in” button
 * 5- Verify expected error is displayed:
 * Expected: This field is required.
 *
 * NOTE: FOLLOW POM DESIGN PATTERN
 */

/**
 * TC #2: Invalid email format error message test
 * 1- Open a chrome browser
 * 2- Go to: https://library1.cydeo.com/
 * 3- Enter invalid email format
 * 4- Verify expected error is displayed:
 * Expected: Please enter a valid email address.
 *
 * NOTE: FOLLOW POM DESIGN PATTERN
 */

/**
 * TC #3: Library negative login
 * 1- Open a chrome browser
 * 2- Go to: https://library1.cydeo.com/
 * 3- Enter incorrect username or incorrect password
 * 4- Verify title expected error is displayed:
 * Expected: Sorry, Wrong Email or Password
 *
 * NOTE: FOLLOW POM DESIGN PATTERN
 */
