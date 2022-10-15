package TestNGTutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
    @Test(groups={"regression"})
    public void carLoan(){
        System.out.println(" This is car loan from day 2  for regression run with Group notaion < @Test>");
    }


    @Parameters({"URL"})
    @Test
    public void homeloan( String url) {
        System.out.println("This is home loan from day 2 < @Test>");
        System.out.println("value of the url set at suite level "+ url);
    }
    @BeforeTest
    public void prerequisite2(){
        System.out.println(" this is pre requisite method2 from day 2 with BeforeTest annotaion <<@BeforeTest>>");
    }

}
