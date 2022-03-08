package com.cydeo.tests.day10_uploads_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test() {
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

//2. Find some small file from your computer, and get the path of it.
        //simulate this example, create a String to identify file path what we want to upload
        //file->right click->properties->security->object
        String path = "C:\\Users\\mukha\\OneDrive\\Рабочий стол\\Cybertek\\HTML Class\\Day1\\turkmenistan-flag.jpg";
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);

//3. Upload the file.
        WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();

        //4. Assert:
        // * -File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());


    }
}
/**
 * 1. Go to https://practice.cydeo.com/upload
 * 2. Find some small file from your computer, and get the path of it.
 * 3. Upload the file.
 * 4. Assert:
 * -File uploaded text is displayed on the page
 */