import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
    public  void logsContainsSubmit() {
        System.setProperty("webdriver.chrome", "chromedriver.exe");
        // Open Site
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://jdi-framework.github.io/tests");

        Assert.assertEquals(driver.getTitle(), "Index Page");

        //   Login
        WebElement userBtn = driver.findElement(By.xpath("//i"));
        WebElement login = driver.findElement(By.xpath(".//*[@id='Login']"));
        WebElement password = driver.findElement(By.xpath(".//*[@id='Password']"));
        WebElement enterBtn = driver.findElement(By.xpath("//button"));
        WebElement nameText = driver.findElement(By.xpath("//div[@class='profile-photo']/span"));
        WebElement contactFormLink = driver.findElement((By.xpath("//a[contains (text(), 'Contact form')]")));

        userBtn.click();
        login.sendKeys("epam");
        password.sendKeys("1234");
        enterBtn.click();

        Assert.assertEquals(nameText.getText(), "PITER CHAILOVSKII");

        contactFormLink.click();

        Assert.assertEquals(driver.getTitle(),"Contact Form");

        // Contact Form
        WebElement nameInputField  = driver.findElement((By.xpath("//input[@id='Name']")));
        WebElement lastNameInputField = driver.findElement((By.xpath(".//*[@id='LastName']")));
        WebElement submitBtn = driver.findElement((By.xpath("//button[contains (text(),'Submit')]")));

        nameInputField.sendKeys("Elena");
        lastNameInputField.sendKeys("Ganeshina");
        submitBtn.click();

        // Logs
        WebElement loqText = driver.findElement(By.xpath(".//*[@class='panel-body-list logs']/li"));

        Assert.assertTrue(loqText.getText().toLowerCase().contains("submit"));

        driver.quit();
    }
}
