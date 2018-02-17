package org.mytests.tests.example;

import com.epam.jdi.uitests.core.logger.LogLevels;
import com.epam.jdi.uitests.win.settings.WinSettings;
import com.epam.jdi.uitests.win.testing.testRunner.TestNGBase;
import com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication;
import org.mytests.uiobjects.example.calculator.Calculator;
import org.mytests.uiobjects.example.site.JDIDesktop;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static com.epam.jdi.uitests.core.settings.JDISettings.driverFactory;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication.appPath;
import static com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication.init;
import static com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication.setAppPath;

public class CalcTestsInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws IOException {
        killAllRunDrivers();
        init(Calculator.class);
        logger.setLogLevel(LogLevels.STEP);
        logger.info("Run Tests");
    }
}
