package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void task7_scroll_test() {

      //  2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");

     // 3- Scroll down to “Cydeo” link
        // * 4- Scroll up to “Home” link
//5- Use below provided JS method only

        //locating "CYDEO" btn
        WebElement cydeoLinkBtn = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //locating "Home" btn
        WebElement homeLinkBtn = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //casting our 'Driver' into 'JavascriptExecutor'
        BrowserUtils.sleep(2);

      //   * JavaScript method to use : arguments[0].scrollIntoView(true)
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLinkBtn);
        //coming from Javascript accept arg
// arguments[0] ->passing index number of arg, if we have more than 1 index we need to indicate index number
// scrollIntoView(true) means scroll until you see "CYDEO" or 'cydeoLinkBtn' on a page

        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLinkBtn, homeLinkBtn);
//arguments[1].scrollIntoView(true) is a method with indication objects to get cydeoLinkBtn or homeLinkBtn


    }
}
/**
 * TC #7: Scroll using JavascriptExecutor
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/large
 * 3- Scroll down to “Cydeo” link
 * 4- Scroll up to “Home” link
 * 5- Use below provided JS method only
 *
 * JavaScript method to use : arguments[0].scrollIntoView(true)
 *
 * Note: You need to locate the links as web elements and pass them as
 * arguments into executeScript() method
 */