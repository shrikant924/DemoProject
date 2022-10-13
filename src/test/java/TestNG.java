import org.testng.annotations.*;

public class TestNG {

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("BeforeSuit");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

   @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }



    @Test
    public void Test1(){
        System.out.println("This is first test");
    }

    @Test
    public void Test2(){
        System.out.println("This is second test");
    }

    @Test
    public void Test3(){
        System.out.println("This is third test");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }


    @AfterSuite
    public void AfterSuit(){
        System.out.println("AfterSuit");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }

}
