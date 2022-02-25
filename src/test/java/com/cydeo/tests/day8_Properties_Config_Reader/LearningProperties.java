package com.cydeo.tests.day8_Properties_Config_Reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void jav_properties_reading_test() {
//key=value -> browser=chrome, for example
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
//System.getProperty("os.name") = Windows 10 -> giving me information about oper system of current comp
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        //System.getProperty("user.name") = mukha

    }
}
