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

        String currentTitle = driver.getTitle(); //-> second option
System.out.println("currentTitle = " + currentTitle);

        //stop code execution of below code for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back as browser do with button ->
        driver.navigate().back();//first loading blank then tesla then blank

        //stop code execution of below code for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward as browser do with button <-
        driver.navigate().forward();//first loading blank then tesla then blank, then tesla

        //stop code execution of below code for 3 seconds
        Thread.sleep(3000);

//use selenium to refresh page
        driver.navigate().refresh(); //refreshing tesla web page

        //stop code execution of below code for 3 seconds
        Thread.sleep(3000);

        //use selenium to move to other web page
        driver.navigate().to("https://www.google.com");
 //scip from tesla to google,exactly the same as get() method, to() is calling get()

        //gwt the title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle()); ->one option
//will print out "driver.getTitle() = Google" in a console, coz it's last what is declared
//        String currentTitle = driver.getTitle(); -> second option
//        System.out.println("currentTitle = " + currentTitle);

        currentTitle = driver.getTitle();//get both titles tesla and google
        System.out.println("currentTitle = " + currentTitle);

        //get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


    }

}
