package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EtsyTest {

    @Test
    public void etsyTest1(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.etsy.com/");
    }
}
