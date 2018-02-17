package org.mytests.tests.example;

import com.epam.jdi.uitests.core.logger.LogLevels;
import com.epam.jdi.uitests.win.settings.WinSettings;
import com.epam.jdi.uitests.win.testing.testRunner.TestNGBase;
import com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication;
import org.mytests.uiobjects.example.site.JDIDesktop;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.win.winnium.elements.composite.DesktopApplication.init;

public class ApplicationTestInit extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws IOException {
        killAllRunDrivers();
        init(JDIDesktop.class);
        logger.setLogLevel(LogLevels.STEP);
        logger.info("Run Tests");
        WinSettings.driverFactory.getDriver();
    }
}
