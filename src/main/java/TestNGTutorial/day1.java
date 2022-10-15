package TestNGTutorial;


import org.testng.annotations.*;
import org.testng.annotations.Parameters;


public class day1 {
    @Test()
    @Parameters({"URL","USERNAME"})

    public void parmeterMethod ( String urlname, String username){
        System.out.println("From day 1");
        System.out.println(" This is from the method parmeterMethod to test parameter from day1<@test>");
        System.out.println( "url name is  " + urlname+ " and the user name is "+ username);// parameterized
    }


    @BeforeMethod
    public void demo7(){
        System.out.println("From day 1");
        System.out.println("Before method<@Before Method>");
    }

    @Test()
    public void demo1(){
        System.out.println("From day 1");
        System.out.println(" This is from the method demo1 from day1<@test>");
    }


    @Test(timeOut = 40000)
    public void demo10(){
        System.out.println("From day 1");
        System.out.println(" This is from the method demo10 to test timeout from day1<@test(timeOut = 40000)>");
    }

    @Test (enabled = false)
    public void demo2(){
        System.out.println("From day 1");
        System.out.println(" This is from the method demo2 from day1 <@Test (enabled = false)>");
    }

    @Test(groups={"regression"})
    public void demo8(){
        System.out.println("From day 1");
        System.out.println(" This is from the method demo8, for regression run with Group notaion from day1<@test>");
    }

    @AfterTest
    public void demo3(){
        System.out.println("From day 1");
        System.out.println(" This is from method 3 from day 1 and with AfterTest annotaion<@AfterTest>");
    }
    @AfterSuite
    public void demo5(){
        System.out.println("From day 1");
        System.out.println("This is from method 5 from day1 and this should be the last method with <<@AfterSuite>>");
    }

    @BeforeSuite
    public void demo6(){
        System.out.println("From day 1");
        System.out.println("This is from method 6 from day1 and this should be the first method with << @BeforeSuite>>");
    }
    @BeforeSuite
    public void demo4(){
        System.out.println("From day 1");
        System.out.println("This is from method 4 from day1 and this should be the first method with <<@BeforeSuite>>");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("From day 1");
        System.out.println("This is the before class method with <Before Class>");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("From day 1");
        System.out.println("This is  the after class method with <After Class>");
    }


    @BeforeTest
    public void prerequisite1(){
        System.out.println("From day 1");
        System.out.println(" this is pre requisite method1 from day 1 with BeforeTest annotaion <<@BeforeTest>>");
    }
}
