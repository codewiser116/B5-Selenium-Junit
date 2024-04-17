package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.Driver;
import utilities.SeleniumUtils;

public class GoogleTest {

    @BeforeMethod (groups = {"sanity"})
    public void beforeMethod(){
        System.out.println("BEFORE METHOD IN GOOGLE");
    }

    @Test (groups = {"login"})
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleTest2(){
        System.out.println("This is test 2 of google");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test (groups = {"sanity"})
    public void googleTest3(){
        System.out.println("This is test 3 of google");
        SeleniumUtils.waitForSeconds(10);
    }

    @Test (groups = "loginTest")
    public void login1(){
        System.out.println("login google test 1");
    }

    @Test (groups = "loginTest")
    public void login2(){
        System.out.println("login google test 2");
    }

    @BeforeSuite
    public static void beforeSuiteMEthod(){
        System.out.println("THIS IS BEFORE SUITE INSIDE GOOGLE");
    }


    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("THIS IS AFTER SUITE INSIDE GOOGLE");
    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("before test method google");
    }

    @AfterTest
    public static void afterTest(){
        System.out.println("after test method google");
    }

    @BeforeGroups (groups = "sanity")
    public static void beforeGroup(){
        System.out.println("THIS IS BEFORE GROOOOOOOOOOOOOOOOUP");
    }
}
