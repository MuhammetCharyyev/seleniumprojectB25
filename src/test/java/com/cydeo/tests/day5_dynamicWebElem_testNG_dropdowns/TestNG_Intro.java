package com.cydeo.tests.day5_dynamicWebElem_testNG_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass //executed once before everything in class
    public void setupMethod() {
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass //executed once after everything in class
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod //execute everything before each method/@Test in class
    public void setUpMethod(){
        System.err.println("-->BeforeMethod is running<--");
    }

   @AfterMethod //execute everything after each method/@Test in class
    public void tearDownMethod(){
        System.err.println("-->AfterMethod is running<--");
    }

    @Test (priority = 1)//make it runnable, replace main() method
    // priority make execution in line
    public void test1(){
        System.out.println("test1 is running");

        //Assert Equals: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
        //java.lang.AssertionError:
        //Expected :apple2
        //Actual   :apple
    }



    @Test (priority = 2) //define the priority to execute
    public void test2(){
        System.out.println("test2 is running");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));//java.lang.AssertionError:
                                                   // Expected :true
                                                   //Actual   :false
    }

}
