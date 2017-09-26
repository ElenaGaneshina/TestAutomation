package HomeWork3;

import HomeWork3.enums.InputData;
import HomeWork3.init_classes.ExtensionForTests;
import HomeWork3.page_objects.elements.Header;
import HomeWork3.page_objects.elements.LeftSection;
import HomeWork3.page_objects.pages.DatesPage;
import HomeWork3.page_objects.pages.DifferentElementPage;
import HomeWork3.page_objects.pages.IndexPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class CheckRangeSlider extends ExtensionForTests {

        private IndexPage indexPage = page(IndexPage.class);
        private Header header = page(Header.class);
        private DatesPage datesPage = page(DatesPage.class);

        @Test
        public void checkDifferentElementPage() {
            open(InputData.URL.inData);

            header.login(InputData.LOGIN.inData, InputData.PASSWORD.inData);
            header.checkDisplayedUserName();
            indexPage.checkContainsElements();
            header.openDatesPage();
            //ADDITIONAL PARAMETRS R - move to right L- move to left
            //move to the most left and right position (0,100)%
            datesPage.moveSlider(-20,0, 'L');
            //move all to the most left position(0,0)%
            datesPage.moveSlider(0,-100, 'L');
            //move all to the most right position (100,100)%
            datesPage.moveSlider(100,100, 'R');
            //move to (30,70)%
            datesPage.moveSlider(-70,-30, 'L');
        }
    }
