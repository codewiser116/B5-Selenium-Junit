package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EtsyTest {

    @Test (groups = {"sanity"})
    public void etsyTest1(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com/");
    }

    @Test (groups = "loginTest")
    public void login1(){
        System.out.println("login etsy test 1");
    }

    @Test (groups = "loginTest")
    public void login2(){
        System.out.println("login etsy test 2");
    }
}
