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
            //1.Open test site by URL
            open(InputData.URL.inData);

            //2.Perform login
            header.login(InputData.LOGIN.inData, InputData.PASSWORD.inData);

            //3.Assert User name in the left-top side of screen that user is loggined
            header.checkDisplayedUserName();

            //4.Open Service -> Dates
            header.openDatesPage();

            /*Steps 5 - 8
            * 5. Using drag-and-drop set Range sliders. left sliders - the most left position, right slider - the most rigth position(0,100)
            * 6.Using drag-and-drop set Range sliders. left sliders - the most left position, right slider - the most left position.(0,0)
            * 7.Using drag-and-drop set Range sliders. left sliders - the most rigth position, right slider - the most rigth position.(100,100)
            * 8.Using drag-and-drop set Range sliders.(30,70)
            */
            //ADDITIONAL PARAMETRS are used: R - move to right L- move to left

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
