package com.cydeo.tests.day2_locators_getYext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize the window
        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement usernameInput = driver.findElement(By.className("form-control"));
//searching By class, found through 'Inspect' the <input type="" id="" class="form-control"...
        usernameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
 //searching By id, found through 'Inspect' the <input type="" id="inputPassword"...
        passwordInput.sendKeys("incorrect password");

//5. Verify: visually “Sorry, Wrong Email or Password” displayed
        WebElement signInButton = driver.findElement(By.tagName("button"));
//searching By tag name, found through 'Inspect' the <button/button>...
        signInButton.click(); //allows to click to sign in button
    }



}
/*
TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
 */