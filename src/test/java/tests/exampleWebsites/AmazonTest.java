package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class AmazonTest {

    @Test
    public void amazonTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void amazonTest2(){
        System.out.println("This is test 2 of amazon");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test
    public void amazonTest3(){
        System.out.println("This is test 3 of amazon");
        SeleniumUtils.waitForSeconds(3);
    }
}
