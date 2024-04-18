package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DirectoryBasePage extends BasePage {

    public DirectoryBasePage() {
        super(Driver.getDriver());
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='oxd-input-group__label-wrapper'])[2]//following-sibling::div//div[@class='oxd-select-text--after']")
    public WebElement jobTitleDropDown;

    @FindBy(xpath = "//span[text()='HR Manager']")
    public WebElement hrManager;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement submit;

    @FindBy(xpath = "//p[text()='HR Manager' and @class=\"oxd-text oxd-text--p orangehrm-directory-card-subtitle --break-words\"]")
    public WebElement hrManagerVerify;

    @Override
    public void search(String... parameters) {
        String employeeName = parameters[0];
        String jobTitle = parameters[1];
        String location = parameters[2];



    }

}
