package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {


    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //getting from method we created in Utility package
        driver.manage().window().maximize();

        //providing extra wait time before it throws NoSuchElement Exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page
        //find several elements on a page
        //windows : alt+enter generates List<WebElement>
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

       // 4- Print out the number of the links on the page
        //.size will show in console what is the size of links, how many links ->int
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links
        // for each and each.getText() is suitable to print all text of links
        // 6. prtin out the href attribute values of the links
        //  each.getAttribute("href") is suitable to print all web links
        for (WebElement each : allLinks) {
            System.out.println("Text of links = " + each.getText());
            System.out.println(each.getAttribute("href"));
            // if you go just sout(each); it will prnout links references
        }
//windows ctrl + shift and move with arrows


        driver.quit();

    }

}
/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */