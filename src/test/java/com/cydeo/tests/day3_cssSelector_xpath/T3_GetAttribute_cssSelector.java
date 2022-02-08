package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GetAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //syntax-> tagName[attribute='value']
       // input[class='login-btn']
        //using cssSelector
        //cssSelector allows you to find exactly what we want without indication attributes

       // WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn'"));
        // WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit'"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedButtonText = "Log In";
        String actualButtonText = signInButton.getAttribute("value");
        //signInButton.getAttribute ->because "log In" text is inside the attribute 'value'

        System.out.println("actualButtonText = " + actualButtonText);
        //printed out -> actualButtonText = Log In

        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("login text verification passed");
        }else{
            System.out.println("login text verification failed");
        }


    }

}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In

 */