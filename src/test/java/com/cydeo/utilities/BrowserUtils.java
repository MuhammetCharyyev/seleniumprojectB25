package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page
 */

public class BrowserUtils {

    public void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
        }
    }

}
/*
    This method will accept int (in seconds) and execute Thread.sleep
    for given duration
     */