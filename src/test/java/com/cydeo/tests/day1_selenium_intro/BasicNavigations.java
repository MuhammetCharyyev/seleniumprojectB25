package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setting up the browser driver manager//came from io.github.bonigarcia
        //we creat our "Browser Driver" by this:
        WebDriverManager.chromedriver().setup();

        //2- create instance of the Selenium web driver
        //this opens a blank page
        WebDriver driver = new ChromeDriver();

        //3- got to "https://www.tesla.com"
        driver.get("https://www.tesla.com");
        //opening with no www but not working wtht https

        //stop code execution of below code for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back as browser do with button ->
        driver.navigate().back();//first loading blank then tesla then blank


    }

}
