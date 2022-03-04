package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser = ConfigurationReader.getProperty("browser");
        //added method from the ConfigurationReader.getProperty
        //getting browser type from our configuration.properties file

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

    }

    @Test
    public void google_search_test() {
// * 3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys//searchValue is called from config properties
                (ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

// * 4- Verify title:
// * Expected: apple - Google Search

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
        //we add here config properties option to have possibility
        // to change value for searchValue in out config.prop file
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }
}
/**
 * TC #4: Google search
 * 1- Open a chrome browser
 * 2- Go to: https://google.com
 * 3- Write “apple” in search box
 * 4- Verify title:
 * Expected: apple - Google Search
 *
 *
 * Use `configuration.properties` for the following:
 * 1. The browser type
 * 2. The URL
 * 3. The search keyword
 * 4. Make title verification dynamic. If search value changes, title
 * assertion should not fail.
 */