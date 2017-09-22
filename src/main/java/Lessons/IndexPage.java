package Lessons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {

    //Elements on the page
    @FindBy(xpath = "//i")
    private  WebElement loginForm;

    @FindBy(xpath = ".//*[@id='Login']")
    private  WebElement username;

    @FindBy(xpath = ".//*[@id='Password']")
    private  WebElement password;

    @FindBy(xpath = "//button")
    private  WebElement submit;

    //Methods
    public void login(String user, String pass){
        loginForm.click();
        username.sendKeys(user);
        password.sendKeys(pass);
        submit.click();
    }
}
