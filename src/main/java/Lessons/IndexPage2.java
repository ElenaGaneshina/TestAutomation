//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import ru.yandex.qatools.htmlelements.annotations.Name;
//import ru.yandex.qatools.htmlelements.element.Button;
//import ru.yandex.qatools.htmlelements.element.HtmlElement;
//import ru.yandex.qatools.htmlelements.element.Link;
//import ru.yandex.qatools.htmlelements.element.TextInput;
//import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
//import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
//
//public class IndexPage2 extends HtmlElement {
//
//
//    //Elements on the page
//    @Name("Link to login Form")
//    @FindBy(xpath = "//i")
//    private Link loginForm;
//
//    @Name("Username")
//    @FindBy(xpath = ".//*[@id='Login']")
//    private TextInput username;
//
//    @Name("Password")
//    @FindBy(xpath = ".//*[@id='Password']")
//    private  TextInput password;
//
//    @Name("Submit button")
//    @FindBy(xpath = "//button")
//    private Button submit;
//
//    public IndexPage2(WebDriver driver) {
//        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)),this);
//    }
//
//    //Methods
//    public void login(String user, String pass){
//        loginForm.click();
//        username.sendKeys(user);
//        password.sendKeys(pass);
//        submit.click();
//    }
//}
