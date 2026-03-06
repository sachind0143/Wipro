package listeners;

//import base.BaseTest;
import com.aventstack.extentreports.*;
import org.testng.*;
import utils.ExtentManager;

public class TestListener implements ITestListener {

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private ExtentReports extent;

    @Override
    public void onTestStart(ITestResult result) {

        String testName = result.getMethod().getMethodName();

        extent = ExtentManager.getInstance(testName);

        ExtentTest test = extent.createTest(testName);

        extentTest.set(test);

        extentTest.get().info("Test Started");

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest.get().pass("Test Passed");
        extent.flush();
    }

    @Override
    public void onTestFailure(ITestResult result) {

        extentTest.get().fail("Test Failed");
        extentTest.get().fail(result.getThrowable());

        extent.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        extentTest.get().skip("Test Skipped");
        extent.flush();
    }
}