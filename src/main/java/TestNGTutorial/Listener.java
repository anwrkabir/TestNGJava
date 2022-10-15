package TestNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {


    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("all test passed  and name of the method is " + result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
