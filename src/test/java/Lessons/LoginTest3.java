package Lessons;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest3 {

    @BeforeClass
    public void setUp(){
        Configuration.browser = "CHROME";
        System.setProperty("webdriver.chrome", "chromedriver.exe");
            }

    @Test
    public  void loginTest() {
        open("https://jdi-framework.github.io/tests/index.htm");//selenide.open
        $(".fa-user").click();
        $("#login").sendKeys("epam");
        $("#Password").sendKeys("1234");
        $(".fa-sign-in").click();
          }
}
