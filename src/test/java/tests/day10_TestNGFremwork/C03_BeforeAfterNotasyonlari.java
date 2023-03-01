package tests.day10_TestNGFremwork;

import org.testng.annotations.*;

public class C03_BeforeAfterNotasyonlari {

    /*


    Smoke Test
    Regression Test
    EndToEnd (E2E)

    Test: Bir amac icin biraraya getirilmis test methodlari ,class lari veya packaageleri icerir

    test Hiyerarsisi:

    -suit
   - Test
   -groups,package,classes,methods

     */
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit");

    }


    @BeforeTest
    public  void beforeTesti(){
        System.out.println("beforeTesti");

    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");


    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("beforeMethod");


    }
    @Test
    public void test01(){
        System.out.println("test1");
    }
    @Test
    public  void test02(){

        System.out.println("test2");
    }
    @Test
    public  void test03(){
        System.out.println("test3");
    }
    @AfterSuite
    public  void afterSuit(){
        System.out.println("aftersuit");

    }

    @AfterTest
    public  void afterTest(){
        System.out.println("afterTest");

    }
    @AfterClass
    public  void afterClass(){
        System.out.println("afterClass");

    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("afterMethod");

    }



}
