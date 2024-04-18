package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonBasePage;
import pages.DirectoryBasePage;
import pages.LoginBasePage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class HRMTest {
    LoginBasePage loginPage = new LoginBasePage();
    CommonBasePage commonPage = new CommonBasePage();
    DirectoryBasePage directoryPage = new DirectoryBasePage();
    WebDriver driver = Driver.getDriver();

    @BeforeMethod
    public void before(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin","admin123");
    }

    @Test
    public void test1(){
        SeleniumUtils.click(driver, commonPage.directory);
        SeleniumUtils.click(driver, directoryPage.jobTitleDropDown);
//        SeleniumUtils.waitForSeconds(2);
        directoryPage.hrManager.click();
        SeleniumUtils.click(driver, directoryPage.submit);
        Assert.assertEquals(directoryPage.hrManagerVerify.getText(), "HR Manager");

        directoryPage.printURL();

        directoryPage.search("John Doe", "HR Manager");

    }

}
