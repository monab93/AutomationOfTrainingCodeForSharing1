package PeopleNTech.Automationtraining;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utility;

public class listners extends Utility implements ITestListener{
	//listners are professionally used to take screenshots to document results of test execution

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utility)result.getInstance()).driver;
		Date dt = new Date();
		System.out.println(dt);
		String it=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(it);
		String local = System.getProperty("user.dir");
		File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File(local+"\\pictures\\Passed\\"+it+"captured.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utility)result.getInstance()).driver;
		Date dt = new Date();
		System.out.println(dt);
		String it=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(it);
		String local = System.getProperty("user.dir");
		File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(stored, new File(local+"\\pictures\\Failed\\"+it+"captured.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
