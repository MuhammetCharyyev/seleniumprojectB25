package com.cydeo.tests.day13_review_practices;

//public class CY3_57_Muhammet extends TestBase {
//    @Test(priority = 1)
//    public void driver_learn_pinbar_test() {
//        System.out.println("===========DRIVER===========");
//
//        //1. Login as driver
//        VytrackLoginPage driverLogin = new VytrackLoginPage();
//        driverLogin.login(ConfigurationReader.getProperty("driver_username"),
//                ConfigurationReader.getProperty("driver_password"));
//        BrowserUtils.sleep(2);
//
//        //2. Locate and click on the “Learn how to use this space” link on homepage
//        WebElement howUseSpaceLnk = Driver.getDriver().findElement
//                (By.linkText("Learn how to use this space"));
//        howUseSpaceLnk.click();
//        BrowserUtils.sleep(2);
//
//        //3. Locate and verify message "How To Use Pinbar" on a help page
//        WebElement howUsePinbar = Driver.getDriver().findElement
//                (By.xpath("//h3[.='How To Use Pinbar']"));
//        String expectedUsePinbarMsg = "How To Use Pinbar";
//        String actualUsePinbarMsg = howUsePinbar.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinbarMsg.equals(expectedUsePinbarMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinbarMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinbarMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //4. Locate and verify message “Use pin icon on the right top corner of the
//        // page to create fast access link in the pinbar.” on a help page
//        WebElement usePinIcon = Driver.getDriver().findElement
//                (By.xpath("//div[@class='clearfix']/p[1]"));
//        String expectedUsePinIconMsg = "Use pin icon on the right top corner of the page to create fast access link in the pinbar.";
//        String actualUsePinIconMsg = usePinIcon.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinIconMsg.equals(expectedUsePinIconMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinIconMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinIconMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //5. Locate and verify image is placed to help user find and use pin
//        WebElement imageUsePin = Driver.getDriver().findElement(By.xpath("//img"));
//        String expectedImageUsePinAttr = "https://qa1.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
//        String actualImageUsePinAttr = imageUsePin.getAttribute("src");
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualImageUsePinAttr.equals(expectedImageUsePinAttr)) {
//            System.out.println("User is able to see required image");
//        } else {
//            System.err.println("User is not able to see required image by reason: ");
//            System.out.println();
//            System.out.println("Expected image attribute is: " + expectedImageUsePinAttr);
//            System.err.println("BUT");
//            System.out.println("Actual image attribute is: " + actualImageUsePinAttr);
//        }
//        System.out.println("===========SALES MANAGER===========");
//    }
//
//    @Test (priority = 2)
//    public void salesMan_learn_pinbar_test() {
//
//        //1. Login as Sales Manager
//        VytrackLoginPage salesManLogin = new VytrackLoginPage();
//        salesManLogin.login(ConfigurationReader.getProperty("sales_manager_username"),
//                ConfigurationReader.getProperty("sales_manager_password"));
//        BrowserUtils.sleep(2);
//
//        //2. Locate and click on the “Learn how to use this space” link on homepage
//        WebElement howUseSpaceLnk = Driver.getDriver().findElement
//                (By.linkText("Learn how to use this space"));
//        howUseSpaceLnk.click();
//        BrowserUtils.sleep(2);
//
//        //3. Locate and verify message "How To Use Pinbar" on a help page
//        WebElement howUsePinbar = Driver.getDriver().findElement
//                (By.xpath("//h3[.='How To Use Pinbar']"));
//        String expectedUsePinbarMsg = "How To Use Pinbar";
//        String actualUsePinbarMsg = howUsePinbar.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinbarMsg.equals(expectedUsePinbarMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinbarMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinbarMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //4. Locate and verify message “Use pin icon on the right top corner of the
//        // page to create fast access link in the pinbar.” on a help page
//        WebElement usePinIcon = Driver.getDriver().findElement
//                (By.xpath("//div[@class='clearfix']/p[1]"));
//        String expectedUsePinIconMsg = "Use pin icon on the right top corner of the page to create fast access link in the pinbar.";
//        String actualUsePinIconMsg = usePinIcon.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinIconMsg.equals(expectedUsePinIconMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinIconMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinIconMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //5. Locate and verify image is placed to help user find and use pin
//        WebElement imageUsePin = Driver.getDriver().findElement(By.xpath("//img"));
//        String expectedImageUsePinAttr = "https://qa1.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
//        String actualImageUsePinAttr = imageUsePin.getAttribute("src");
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualImageUsePinAttr.equals(expectedImageUsePinAttr)) {
//            System.out.println("User is able to see required image");
//        } else {
//            System.err.println("User is not able to see required image by reason: ");
//            System.out.println();
//            System.out.println("Expected image attribute is: " + expectedImageUsePinAttr);
//            System.err.println("BUT");
//            System.out.println("Actual image attribute is: " + actualImageUsePinAttr);
//        }
//        System.out.println("===========STORE MANAGER===========");
//    }
//
//    @Test (priority = 3)
//    public void storeMan_learn_pinbar_test() {
//
//        //1. Login as Store Manager
//        VytrackLoginPage storeManLogin = new VytrackLoginPage();
//        storeManLogin.login(ConfigurationReader.getProperty("store_manager_username"),
//                ConfigurationReader.getProperty("store_manager_password"));
//        BrowserUtils.sleep(2);
//
//        //2. Locate and click on the “Learn how to use this space” link on homepage
//        WebElement howUseSpaceLnk = Driver.getDriver().findElement
//                (By.linkText("Learn how to use this space"));
//        howUseSpaceLnk.click();
//        BrowserUtils.sleep(2);
//
//        //3. Locate and verify message "How To Use Pinbar" on a help page
//        WebElement howUsePinbar = Driver.getDriver().findElement
//                (By.xpath("//h3[.='How To Use Pinbar']"));
//        String expectedUsePinbarMsg = "How To Use Pinbar";
//        String actualUsePinbarMsg = howUsePinbar.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinbarMsg.equals(expectedUsePinbarMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinbarMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinbarMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //4. Locate and verify message “Use pin icon on the right top corner of the
//        // page to create fast access link in the pinbar.” on a help page
//        WebElement usePinIcon = Driver.getDriver().findElement
//                (By.xpath("//div[@class='clearfix']/p[1]"));
//        String expectedUsePinIconMsg = "Use pin icon on the right top corner of the page to create fast access link in the pinbar.";
//        String actualUsePinIconMsg = usePinIcon.getText();
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualUsePinIconMsg.equals(expectedUsePinIconMsg)) {
//            System.out.println("User is able to see required message");
//        } else {
//            System.err.println("User is not able to see required message by reason: ");
//            System.out.println();
//            System.out.println("Expected message is: " + expectedUsePinIconMsg);
//            System.err.println("BUT");
//            System.out.println("Actual message is: " + actualUsePinIconMsg);
//        }
//
//        System.out.println("_________________________________________________________");
//
//        //5. Locate and verify image is placed to help user find and use pin
//        WebElement imageUsePin = Driver.getDriver().findElement(By.xpath("//img"));
//        String expectedImageUsePinAttr = "https://qa1.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
//        String actualImageUsePinAttr = imageUsePin.getAttribute("src");
//
//        //apply regular 'if' statement instead of 'Assert' to make it more informative
//        if (actualImageUsePinAttr.equals(expectedImageUsePinAttr)) {
//            System.out.println("User is able to see required image");
//        } else {
//            System.err.println("User is not able to see required image by reason: ");
//            System.out.println();
//            System.out.println("Expected image attribute is: " + expectedImageUsePinAttr);
//            System.err.println("BUT");
//            System.out.println("Actual image attribute is: " + actualImageUsePinAttr);
//        }
//    }
//}
