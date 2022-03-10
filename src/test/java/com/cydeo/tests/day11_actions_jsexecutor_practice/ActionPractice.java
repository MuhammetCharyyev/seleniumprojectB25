package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractice {

    @Test
    public void task4_and_5_test() {

     //1- Open a chrome browser
        // * 2- Go to: https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");

    //3- Scroll down to “Powered by CYDEO”
        //Create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());
        //locating "CYDEO" link to be able to pass in the action method
        // also By.xpath("//a[.='CYDEO'])
        WebElement cydeoLinkBtn = Driver.getDriver().findElement(By.linkText("CYDEO"));

       //4- Scroll using Actions class “moveTo(element)” method
        //moving to "CYDEO" link by 'moveToElement' and 'perform()'
        actions.moveToElement(cydeoLinkBtn).perform();

//1- Continue from where the Task 4 is left in the same test.
// 2- Scroll back up to “Home” link using PageUP button

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();//'page up' by one scroll
        actions.sendKeys(Keys.HOME).perform();//scroll to 'home' at once

        Driver.getDriver().close();
        //what if we use 'close' or 'quit' and then try to open browser again with below test
//if we use 'quit' then in will be NoSuchSessionException,
// will be 'driver==null' from 'Driver' util
    }


    @Test
    public void test2() {

        Driver.getDriver().get("https://practice.cydeo.com/");


    }
}
/**
 * TC #4: Scroll practice
 * 1- Open a chrome browser
 * 2- Go to: https://practice.cydeo.com/
 * 3- Scroll down to “Powered by CYDEO”
 * 4- Scroll using Actions class “moveTo(element)” method
 *
 * TC #5: Scroll practice 2
 * 1- Continue from where the Task 4 is left in the same test.
 * 2- Scroll back up to “Home” link using PageUP button
 */