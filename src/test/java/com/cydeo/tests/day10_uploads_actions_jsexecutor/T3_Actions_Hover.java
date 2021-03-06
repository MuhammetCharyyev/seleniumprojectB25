package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hover_test() {
      // 1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
    //2. Hover over to first image
//locate all images here
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));
//there are several images, we select by (//img)[index] and indication index of each img

   //locate all users text by hovering
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));
//there are several users, by hovering on an img, we select by //h5[text()='name: user3'

       Actions action = new Actions(Driver.getDriver());//object to call hovering in below

  //2. Hover over to first image
        BrowserUtils.sleep(2);
        action.moveToElement(img1).perform();//hovering to img1
      //3. Assert:
        // * a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        // * b. “view profile” is displayed

   //4. Hover over to second image
        BrowserUtils.sleep(2);
        action.moveToElement(img2).perform();//hovering to img2
//        5. Assert:
// * a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

      //6. Hover over to third image
        BrowserUtils.sleep(2);
        action.moveToElement(img3).perform();//hovering to img3
        // * 7. Confirm:
        // * a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());



    }
}
/**
 * 1. Go to https://practice.cydeo.com/hovers
 * 2. Hover over to first image
 * 3. Assert:
 * a. “name: user1” is displayed
 * b. “view profile” is displayed
 * 4. Hover over to second image
 * 5. Assert:
 * a. “name: user2” is displayed
 * b. “view profile” is displayed
 * 6. Hover over to third image
 * 7. Confirm:
 * a. “name: user3” is displayed
 * b. “view profile” is displayed
 */