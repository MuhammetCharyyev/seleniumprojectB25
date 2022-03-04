package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton { //create the same approach as in 'Driver' Utility
    //#1 create private constructor

    private Singleton(){}

    //#2 create private static String
//prevent access and provide getters
    private static String word;

//this utility method will return 'word' in the way we want to return
    public static String getWord(){
        if (word==null){
            System.out.println("First time call. Word obj is null. Assigning value to it now!");
            word = "something";
        }else{
            System.out.println("Word already has value");
        }
        return word;
    }



}
