package org.mytests.tests.example.tests;

import org.mytests.tests.example.CalcTestsInit;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.calculator.Calculator.numButtons;

/**
 * Created by Roman_Iovlev on 1/24/2018.
 */
public class SimpleCalulatorTests extends CalcTestsInit {

    @Test
    public void clickOnTabTest() {
        numButtons.select("2");
        numButtons.select("3");
        numButtons.select("4");
    }
}
