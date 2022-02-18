package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // * 1. Open Chrome browser
        // * 2. Go to https://practice.cydeo.com/iframe

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframe_test4(){
//4. Assert: “Your content goes here.” Text is displayed.

        //we need to switch driver's focus to Iframe with text “Your content goes here.”
//option1 - switching using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //locate paragraph tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
  // as it is only one paragraph tag on page then we may just indicate '//p' for xpath
        //we'll get NoSuchElementException because we have to switch attention from HTML to Iframe
        //NoSuchElementException will not be displayed right away because implicitlyWait
            // which is wait 10 sec while program searching

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());//verifying display text

//Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        //to be able to verify the header we must switch back to main HTML

        driver.switchTo().parentFrame(); //return to HTML

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());

    }



}
/*
TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */