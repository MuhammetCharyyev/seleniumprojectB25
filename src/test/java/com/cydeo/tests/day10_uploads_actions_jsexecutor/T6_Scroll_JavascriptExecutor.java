package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_Scroll_JavascriptExecutor {

    @Test
    public void javascript_executor_test1() {
        //1- Open a chrome browser
        // * 2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

//3- Use below JavaScript method and scroll
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //casting our 'Driver' into 'JavascriptExecutor'
        BrowserUtils.sleep(2);
        js.executeScript("window.scrollBy(0,750)");//coming from Javascript accept arg
        // in (x,y axis) "sistema koordinat"// comand to window to scroll from 0 to 750 pixels,
        //it is actually one scroll by mouse

        //((JavascriptExecutor) Driver.getDriver()).executeScript();//also this way to chain above

// * a.  750 pixels down 10 times.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,750)");//iterate scrolling 750 pxs 10 times
        }

// * b.  750 pixels up 10 times
        //JavaScript method to use : window.scrollBy(0,0)
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(2);
            js.executeScript("window.scrollBy(0,-750)");
            //instead of going up with ' - ' it will go up
        }
    }
}
/**
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/infinite_scroll
 * 3- Use below JavaScript method and scroll
 * a.  750 pixels down 10 times.
 * b.  750 pixels up 10 times
 *
 * JavaScript method to use : window.scrollBy(0,0)
 */