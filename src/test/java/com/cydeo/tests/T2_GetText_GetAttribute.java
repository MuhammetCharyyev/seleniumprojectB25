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

        //3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        //find element by class name, the 1st matching one
        inputUserName.sendKeys("incorrect");
        //then by sendKeys we put cursor on selected place and it will put our String

        //4- Enter incorrect password: “incorrect”
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        //find element by name, the 1st matching one
        inputPassword.sendKeys("incorrect");
        //then by sendKeys we put cursor on selected place and it will put our String

        //5- Click to log in button.
        WebElement clickLogButton = driver.findElement(By.className("login-btn"));
        //find element by class name, the 1st matching one
        clickLogButton.click();
        //clicking the found link

        // //6- Verify error message text is as expected:
        //        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        //find element by class name, the 1st matching one

        String expectedErrMess = "Incorrect login or password";
        String actualErrMess = errorMessage.getText();
        //errorMessage.getText() will return the WebElement to String

        if (actualErrMess.equals(expectedErrMess)) {
            System.out.println("error message verification PASSED");
        } else {
            System.err.println("error message verification FAILED!");
        }

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
