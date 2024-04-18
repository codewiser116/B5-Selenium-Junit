package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginBasePage extends BasePage {

    public LoginBasePage(){
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(css = "button[type=submit]")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement invalidLoginMessage;

    public void login (String userName, String pwd){
        username.sendKeys(userName);
        password.sendKeys(pwd);
        loginButton.click();
    }

    @Override
    public void search(String... parameters) {

    }
}
