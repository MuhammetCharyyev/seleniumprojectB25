package com.cydeo.tests.day13_review_practices;

import com.cydeo.pages.DoubleClickPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DoubleClick {

    @Test
    public void double_click_test() {

        // 1. Go to
        // https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
//2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");
        //place in frame webelement to tell driver to switch to this element

     //   3. Double click on the text “Double-click me to change my text color.”

        DoubleClickPage doubleClickPage = new DoubleClickPage();
        //object from DoubleClickPage template we created to find elements
        Actions actions = new Actions(Driver.getDriver());
        //object from Actions to help with double clicking

        actions.doubleClick(doubleClickPage.textToDoubleClick).perform();
        //actions from above object performs doubleClick method to our
        // doubleClickPage.textToDoubleClick element

        System.out.println("actual attribute = " + doubleClickPage.textToDoubleClick.getAttribute("style"));
        String actualStyleAttr = doubleClickPage.textToDoubleClick.getAttribute("style");
        String expectedStyleAttr= "red";

        Assert.assertTrue(actualStyleAttr.contains(expectedStyleAttr));

    }
}
/**
 TC #1: Double Click Test
 1. Go to
 https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
 2. Switch to iframe.
 3. Double click on the text “Double-click me to change my text color.”
 4. Assert: Text’s “style” attribute value contains “red”.

 NOTE: FOLLOW POM
 */