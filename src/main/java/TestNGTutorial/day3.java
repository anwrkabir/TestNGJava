package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
    @Test(groups={"regression"})
    public void LearnJava(){
        System.out.println(" learn java method, for regression run with Group notaion class day3 <@Test>");
    }
    @Test
    public void LearnSelenium(){
        System.out.println(" learn selenium method class day3 <@Test>");
        Assert.assertTrue(false);// to fail the test
    }

    @Parameters({"Piano"})
    @Test
    public void LearnAutomation( String musicTool){
        System.out.println("Learn automation method class day3 <@Test>");
        System.out.println("my favorite pianist is "+ musicTool);// the parameter set at test level
    }
    @DataProvider
    public Object[][] practiceDataProvider(){
        Object[][] data = new Object[3][2];// 3 rows and 2 columns
        data[0][0]= "first set user name";
        data[0][1]= "first password";

        data[1][0]= "second set user name";
        data[1][1]= "second password";

        data[2][0]= "third set user name";
        data[2][1]= "third password";
        return data;
    }
    @Test(dataProvider = "practiceDataProvider")
    public void retrieveDataProvider(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

}
