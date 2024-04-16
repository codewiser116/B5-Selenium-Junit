package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTest {

    @Test
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleTest2(){
        System.out.println("This is test 2 of google");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test
    public void googleTest3(){
        System.out.println("This is test 3 of google");
        SeleniumUtils.waitForSeconds(10);
    }
}
