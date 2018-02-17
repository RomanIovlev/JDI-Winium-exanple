package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.win.winnium.elements.common.Button;
import com.epam.jdi.uitests.win.winnium.elements.complex.Selector;
import com.epam.jdi.uitests.win.winnium.elements.composite.Section;
import org.mytests.uiobjects.example.site.custom.Dates;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Roman_Iovlev on 1/9/2018.
 */
public class LeftMenu extends Section {
    @FindBy(id = "homeTab") public Button home;

    @FindBy(id = "%sView") public Selector menu;
    public Dates customDates;

    @FindBy(id = "ContactFormTab") public Button contacts;
    @FindBy(id = "SupportView") public Button support;
    @FindBy(id = "DatesView") public Button dates;
    @FindBy(id = "ComplexTableView") public Button complexTable;
    @FindBy(id = "SimpleTableView") public Button simpleTable;
    @FindBy(id = "TableWithPages") public Button tableWithPages;
    @FindBy(id = "DifferentElements") public Button differentElements;
    @FindBy(id = "MetalsAndColorsView") public Button metalsAndColors;
}
