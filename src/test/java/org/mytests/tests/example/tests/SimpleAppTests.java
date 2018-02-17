package org.mytests.tests.example.tests;

import org.mytests.tests.example.ApplicationTestInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.mytests.uiobjects.example.site.JDIDesktop.leftMenu;

public class SimpleAppTests extends ApplicationTestInit {

    @Test
    public void clickOnTabTest() {
        leftMenu.menu.select("Dates");
        leftMenu.support.click();
        leftMenu.contacts.click();
        leftMenu.dates.click();
    }

    @Test
    public void customTest() {
        leftMenu.customDates.inputDate(LocalDate.now());
        leftMenu.customDates.openCalendar();
        leftMenu.customDates.input("TEST");
    }

}
