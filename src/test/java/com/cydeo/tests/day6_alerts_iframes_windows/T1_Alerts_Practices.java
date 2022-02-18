package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alerts_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        // * 1. Open Chrome browser
        // * 2. Go to https://practice.cydeo.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @Test
    public void alert_test1(){
//3. Click to “Click for JS Alert” button
        WebElement infoAlertBtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlertBtn.click();

        //4. Click to OK button from the alert
        //to be able to click Alert ok button we need switch driver's focus to Alert itself

        Alert alert = driver.switchTo().alert();//switching to Alert itself
        alert.accept();
//accepting the Alert message because we are not able to inspect this pop up Alert message

        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultAlertOkBtn = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultAlertOkBtn.isDisplayed(), "Result text is not displayed");
        //assertTrue will return with warning text if only it's 'false'

        String expectedText = "You successfully clicked an alert";
        String actualText = resultAlertOkBtn.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text result is not as expected!!!");
        //will return with message if actual!=expected


    }

}
/**
 * TC #1: Information alert practice
 * 1. Open browser
 * 2. Go to website: http://practice.cydeo.com/javascript_alerts
 * 3. Click to “Click for JS Alert” button
 * 4. Click to OK button from the alert
 * 5. Verify “You successfully clicked an alert” text is displayed.
 */