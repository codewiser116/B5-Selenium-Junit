package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginTests {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeEach
    public void before(){
        driver = Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new LoginPage();
    }


    @Test
    public void testSuccessfulLogin(){
        loginPage.login("Admin", "admin123");
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Test
    public void testUnsuccessfulLogin(){
        loginPage.login("Admin", "fwefe");
        Assertions.assertTrue(loginPage.invalidLoginMessage.isDisplayed());
    }





}
