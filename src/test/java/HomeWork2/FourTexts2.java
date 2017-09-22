package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
    public class FourTexts2 {

        @DataProvider(parallel = true)
        public Object[][] epamFrameworkWishes(){
            return  new Object[][]{
                    {0, "To include good practices\n" +
                            "and ideas from successful\n" +
                            "EPAM projec"},
                    {1, "To be flexible and\n" +
                            "customizable"},
                    {2, "To be multiplatform"},
                    {3, "Already have good base\n" +
                            "(about 20 internal and\n" +
                            "some external projects),\n" +
                            "wish to get more…"}};
        }

        @Test(dataProvider = "epamFrameworkWishes")
        public  void fourTexts(int num, String text){
            System.setProperty("webdriver.chrome", "chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            // Open Site
            driver.manage().window().maximize();
            driver.navigate().to("https://jdi-framework.github.io/tests/index.htm");
            //WebElement textToCheck = driver.findElement(By.xpath("//div["+num+"]/div/span[@class='benefit-txt']"));
            List<WebElement> textPictures = driver.findElements(By.className("benefit-txt"));
            WebElement textToCheck=textPictures.get(num);
            Assert.assertEquals(textToCheck.getText(), text);
            driver.quit();
        }
    }

