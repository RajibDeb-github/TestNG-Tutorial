package ListenersPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{  

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Failed test");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Skipped test");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Start test");
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Successful test");
		
	}

}
