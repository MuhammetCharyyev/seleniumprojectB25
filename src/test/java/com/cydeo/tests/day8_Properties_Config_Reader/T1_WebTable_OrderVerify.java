package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_OrderVerify {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void order_name_verify_test() {

//  Go to https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

        //* 2. Verify Bob’s name is listed as expected.
        //locate the cell that have "Bob Martin" in it

        WebElement nameBobVerify =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("nameBobVerify.getText() = " + nameBobVerify.getText());
        String expectedBobName = "Bob Martin";
        String actualName = nameBobVerify.getText();
        //* Expected: “Bob Martin”
        Assert.assertEquals(actualName, expectedBobName, "wrong name");

// * 3. Verify Bob Martin’s order date is as expected: 12/31/2021

        WebElement orderDateVerify =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = orderDateVerify.getText();

        Assert.assertEquals(actualDate, expectedDate, "wrong date");

    }

}

/**
 * TC #1: Web table practice
 * 1. Go to: https://practice.cydeo.com/web-tables
 * 2. Verify Bob’s name is listed as expected.
 * Expected: “Bob Martin”
 * 3. Verify Bob Martin’s order date is as expected
 * Expected: 12/31/2021
 */