package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locator_GetText {

    public static void main(String[] args) {
//1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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

        if(actualErrMess.equals(expectedErrMess)){
            System.out.println("error message verification PASSED");
        }else{
            System.err.println("error message verification FAILED!");
        }



    }

}
/*
   //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a Chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        //3- Enter incorrect username: “incorrect”
        //4- Enter incorrect password: “incorrect”
        //5- Click to log in button.
        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
 */