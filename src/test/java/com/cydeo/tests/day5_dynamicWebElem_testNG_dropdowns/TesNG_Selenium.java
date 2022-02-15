package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TesNG_Selenium {


    WebDriver driver; //instance for object driver

    @BeforeMethod
    public void setupMethod(){
        //we assign everything to execute before any method
        //do browser driver setup
        //open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod //we close everything after each method
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test() {
        //Get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is  "Google"
        Assert.assertEquals(driver.getTitle(), "Google", "title is not matching");
//compare the actual getTitle with expected, 'message:' is optional to add the fail message

    }

}
