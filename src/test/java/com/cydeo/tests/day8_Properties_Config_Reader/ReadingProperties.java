package com.cydeo.tests.day8_Properties_Config_Reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
//1. create the object of Properties
        Properties properties = new Properties();

        //2. we need to open the file in Java memory; FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");
        //get the name in "configuration.properties" and put in perianthes

        //3. load the properties object using FileInputStream object

        properties.load(file);// 'load' is exception like FileInputStream,
        // 'load' is a parent class, throw it as exception
//loading the properties of the "configuration.properties" file

        //4. use "properties" object to read value

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
//properties.getProperty("browser") = chrome
        //called from "configuration.properties"

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
//properties.getProperty("env") = https://login1.nextbasecrm.com
        //called from "configuration.properties"

        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
//properties.getProperty("username") = helpdesk1@cydeo.com
        //called from "configuration.properties"

    }
}
