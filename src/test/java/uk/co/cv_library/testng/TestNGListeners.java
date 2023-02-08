package uk.co.cv_library.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test started " + iTestResult.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("This on test Success " + iTestResult.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("This on test Failure " + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("This on test Skipped " + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test case " + iTestResult.getName() + " failed but within success percentage.");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Starting test suite: " + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("Finished test suite: " + iTestContext.getName());
    }
}
