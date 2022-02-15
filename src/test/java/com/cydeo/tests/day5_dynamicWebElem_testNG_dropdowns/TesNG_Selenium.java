package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TesNG_Selenium {

    @Test
    public void selenium_test() {
//do browser driver setup
        //open browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is  "Google"


    }

}
