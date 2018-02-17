package org.mytests.uiobjects.example.site.custom;

import com.epam.jdi.uitests.core.interfaces.base.ISetup;
import com.epam.jdi.uitests.win.winnium.elements.common.Button;
import com.epam.jdi.uitests.win.winnium.elements.common.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by Roman_Iovlev on 2/6/2018.
 */
public class Dates extends TextBox implements ISetup {

    @Override
    public void input(CharSequence text) {
        WebElement textField = getDriver()
            .findElement(By.className("DatePicker"))
            .findElement(By.className("TextBox"));
        textField.sendKeys(text);
    }
    public void openCalendar() {
        new Button(By.name("Show Calendar")).click();
    }

    public void inputDate(LocalDate date) {
        openCalendar();
        WebElement button = getDriver()
            .findElement(By.className("Calendar"))
            .findElement(By.className("CalendarDayButton"))
            .findElement(By.name(date.getDayOfMonth()+""));
        button.click();
    }

    public void setup(Field field) {

    }
}
