package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
    Object currentClass = result.getInstance();
    WebDriver driver = ((base.BaseTest) currentClass).getDriver();

    String methodName = result.getMethod().getMethodName();
    int invocationCount = result.getMethod().getCurrentInvocationCount();

    String screenshotName = methodName + "_Iteration_" + invocationCount;

    ScreenshotUtil.captureScreenshot(driver, screenshotName);
    
    }
}