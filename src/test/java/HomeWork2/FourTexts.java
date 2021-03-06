package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class FourTexts {

    @DataProvider(parallel = true)
    public Object[][] epamFrameworkWishes() {
        return new Object[][]{
                {1, "To include good practices\n" +
                        "and ideas from successful\n" +
                        "EPAM projec"},
                {2, "To be flexible and\n" +
                        "customizable"},
                {3, "To be multiplatform"},
                {4, "Already have good base\n" +
                        "(about 20 internal and\n" +
                        "some external projects),\n" +
                        "wish to get more…"}};
    }

    @Test(dataProvider = "epamFrameworkWishes")
    public void fourTexts(int num, String text) {
        System.setProperty("webdriver.chrome", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Site
        driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");

        //Check Text under pictures
        WebElement textToCheck = driver.findElement(By.xpath("//div[" + num + "]/div/span[@class='benefit-txt']"));
        Assert.assertEquals(textToCheck.getText(), text);

        driver.quit();
    }
}

