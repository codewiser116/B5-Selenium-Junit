package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroTests {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is BEFORE CLASS");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("I am test 1");
        Assert.assertTrue(5 > 2);
    }

    @Test
    public void test2(){
        Assert.assertFalse(2 > 5);
        System.out.println("Test 2");
    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){

    }


}
