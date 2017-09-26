package HomeWork3.init_classes;

import HomeWork3.page_objects.pages.IndexPage;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.support.PageFactory;

public abstract class ExtensionForTests {
    public ExtensionForTests(){
        Configuration.browser = "CHROME";
        System.setProperty("webdriver.chrome", "chromedriver.exe");
        //Configuration.holdBrowserOpen = true;
    }
}
