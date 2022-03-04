package com.cydeo.tests.day8_Properties_Config_Reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
/* comment below out for a while to try 'Driver' from Utility:

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        String browser = ConfigurationReader.getProperty("browser");
        //added method from the ConfigurationReader.getProperty
        //getting browser type from our configuration.properties file

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

 */

    @Test
    public void google_search_test() {
        Driver.getDriver().get("https://google.com");
        //Driver.getDriver() called from 'Driver' Utility instead of just 'driver'

// * 3- Write “apple” in search box
        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        //Driver.getDriver() called from 'Driver' Utility instead of just 'driver'

        googleSearchBox.sendKeys//searchValue is called from config properties
                (ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

// * 4- Verify title:
// * Expected: apple - Google Search

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+ " - Google Search";
        //we add here config properties option to have possibility
        // to change easily 'value' for searchValue in our config.prop file
        String actualTitle =Driver.getDriver().getTitle();
        //Driver.getDriver() called from 'Driver' Utility instead of just 'driver'

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