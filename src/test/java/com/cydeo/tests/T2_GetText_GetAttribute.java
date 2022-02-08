package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_GetText_GetAttribute {


    public static void main(String[] args) {
//1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
//rememberMeLabel.getText() will return the WebElement to String
        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("label verification passed");
        }else{
            System.out.println("label verification failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordText = forgotPassword.getText();

        if( actualForgotPasswordText.equals(expectedForgotPasswordText)){
            System.out.println("Forgot password verification passed");
        }else{
            System.out.println("expectedForgotPasswordText = " + expectedForgotPasswordText);
            System.out.println("actualForgotPasswordText = " + actualForgotPasswordText);
            System.out.println("Forgot password verification failed");
        }

//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPassword.getAttribute("href");
        //actual refers to a HREF attribute of forgotPassword message

        System.out.println("actualInHref = " + actualInHref);

        if(actualInHref.contains(expectedInHref)){
            System.out.println("HREF passed");
        }else{
            System.out.println("HREF failed");
        }
driver.quit();

    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes


 */
