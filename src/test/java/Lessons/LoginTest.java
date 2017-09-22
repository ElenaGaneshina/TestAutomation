package Lessons;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private IndexPage indexPage;

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();
    }
    @Test
    public  void loginTest() {
        System.setProperty("webdriver.chrome", "chromedriver.exe");
        // Open Site
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");

        indexPage = PageFactory.initElements(driver, IndexPage.class);

        indexPage.login("epam", "1234");

    }
}
