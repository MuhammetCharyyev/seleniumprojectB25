package com.cydeo.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    //1. create the object of Properties
    Properties properties = new Properties();

    //2. we need to open the file in Java memory; FileInputStream
    FileInputStream file = new FileInputStream("configuration.properties");
    //get the name in "configuration.properties" and put in perianthes

    //3. load the properties object using FileInputStream object

        properties.load(file);// 'load' is exception like FileInputStream, 'load' is a parent class
//loading the properties of the "configuration.properties" file

}
