package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_DrugNDrop {

    @Test
    public void task1_drag_n_drop_test() {

        // Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
   //* 2. Drag and drop the small circle to bigger circle.
//locating "accept cookies' button and click
        WebElement acceptCookiesBtn= Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesBtn.click();

        //locating object of selecting to drag 'smallCircle' and object to drop 'bigCircle'
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        //create an object from 'Actions'
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        //is dedicated method with indication of drug object first and drop object last

     //   actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();
        //the same action but long way to code

        // * 3. Assert:
        // * -Text in big circle changed to: “You did great!”

        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);


    }
}
/**
 * TC #: Drag and drop
 * 1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
 * 2. Drag and drop the small circle to bigger circle.
 * 3. Assert:
 * -Text in big circle changed to: “You did great!”
 */