package HomeWork3;


import HomeWork3.enums.*;
import HomeWork3.init_classes.ExtensionForTests;
import HomeWork3.page_objects.elements.Header;
import HomeWork3.page_objects.elements.LeftSection;
import HomeWork3.page_objects.pages.DifferentElementPage;
import HomeWork3.page_objects.pages.IndexPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class CheckDifferentElementsPage extends ExtensionForTests {
      private IndexPage indexPage = page(IndexPage.class);
      private Header header = page(Header.class);
      private LeftSection leftSection = page(LeftSection.class);
      private DifferentElementPage differentElementPage = page(DifferentElementPage.class);

    @Test
    public void checkDifferentElementPage() {
        //1. Open test site by URL
        open(InputData.URL.inData);

        //2. Perform login
        header.login(InputData.LOGIN.inData, InputData.PASSWORD.inData);

        //3.Assert User name in the left-top side of screen that user is loggined
        header.checkDisplayedUserName();

        //4.Check interface on Home page, it contains all needed elements.
        indexPage.checkContainsElements();

        //5.Click on "Service" subcategory in the header and check that drop down contains options
        header.checkServiceMenu();

        //6.Click on Service subcategory in the left section and check that drop down contains options
        leftSection.checkLeftServiceMenu();

        //7.Open through the header menu Service -> Different Elements Page
        header.openDifferentElementsPage();

        //8.Check interface on Service page, it contains all needed elements.
        differentElementPage.checkContainsElements();

        //9.Select and assert checkboxes
        differentElementPage.selectAndAssertCheckbox(CheckBoxes.WATER.checkBoxName);
        differentElementPage.selectAndAssertCheckbox(CheckBoxes.WIND.checkBoxName);

        //10.Select radio
        differentElementPage.selectRadioButton(RadioButtons.SELEN.radioBtn);

        //11.Select in dropdown
        differentElementPage.selectValueFromDDList(DropDownListValues.YELLOW.ddlValue);

        //12.Check in logs section selected values and status (true|false)
        differentElementPage.checkLog(Log.WATER_TRUE.log);
        differentElementPage.checkLog(Log.WIND_TRUE.log);
        differentElementPage.checkLog(Log.SELEN_SET.log);
        differentElementPage.checkLog(Log.YELLOW_SET.log);

        //13.Unselect and assert checkboxes
        differentElementPage.unselectAndAssertCheckbox(CheckBoxes.WATER.checkBoxName);
        differentElementPage.unselectAndAssertCheckbox(CheckBoxes.WIND.checkBoxName);

        //14.Check in logs section unselected values and status (true|false)
        differentElementPage.checkLog(Log.WATER_FALSE.log);
        differentElementPage.checkLog(Log.WIND_FALSE.log);
    }
}
