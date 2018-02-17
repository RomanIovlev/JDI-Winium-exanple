package org.mytests.uiobjects.example.calculator;

import com.epam.jdi.uitests.win.winnium.elements.common.Button;
import com.epam.jdi.uitests.win.winnium.elements.complex.Menu;
import com.epam.jdi.uitests.win.winnium.elements.complex.RadioButtons;
import com.epam.jdi.uitests.win.winnium.elements.pageobjects.annotations.objects.WinApp;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 1/24/2018.
 */@WinApp(application = "C:\\Windows\\System32\\calc.exe",
        windowLocator = @FindBy(name = "Calculator"))
public class Calculator {
     @FindBy(id = "num%sButton")
     public static Menu numButtons;
}
