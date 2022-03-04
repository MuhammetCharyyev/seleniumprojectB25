package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {


    @Test (priority = 2)//will execute as 2nd of priority
    public void singleton_understand_test1() {

        String str1 = Singleton.getWord(); //called method from Singleton class
        System.out.println(str1);//as it is null with value then below is printed:
        // printed first line-> 'First time call. Word obj is null. Assigning value to it now!
        //printed second line-> 'something'

        String str2 = Singleton.getWord(); //called method from Singleton class
        System.out.println(str2);//as 'word' is assigned to 'something' then below printed:
        //printed first line->Word already has value
        //printed second line->something

        String str3 = Singleton.getWord(); //called method from Singleton class
        System.out.println(str3);///as 'word' is assigned to 'something' then below printed:
        //printed first line->Word already has value
        //printed second line->something

    }

    @Test (priority = 1) //make it first place of priority
    public void singleton_understand_test2() {
        String str4 = Singleton.getWord(); //called method from Singleton class
        System.out.println("str4 = " + str4);
//if you put on 1st place of priority this test then it will print message when word==null
    }
}
