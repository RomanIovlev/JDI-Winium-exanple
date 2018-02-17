package org.mytests.uiobjects.example.site;

import com.epam.jdi.uitests.win.winnium.elements.pageobjects.annotations.objects.WinApp;
import org.mytests.uiobjects.example.site.sections.LeftMenu;
import org.openqa.selenium.support.FindBy;

@WinApp(application = "DesktopApp/JDITestDesktopApp.exe",
        windowLocator = @FindBy(xpath = "./*[contains(@AutomationId, 'JDITestDesktopApp')]"))
public class JDIDesktop {
    public static LeftMenu leftMenu;

}
