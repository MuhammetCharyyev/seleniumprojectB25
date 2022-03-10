package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class T1_DrugNDrop {

    @Test
    public void task1_drag_n_drop_test() {

        // Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
   //* 2. Drag and drop the small circle to bigger circle.

        // * 3. Assert:
        // * -Text in big circle changed to: “You did great!”


    }
}
/**
 * TC #: Drag and drop
 * 1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
 * 2. Drag and drop the small circle to bigger circle.
 * 3. Assert:
 * -Text in big circle changed to: “You did great!”
 */