package PeopleNTech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import PageObjectModel.Home;
import PageObjectModel.SignInPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SignInAmazon extends Utility{
  @Test(priority = 2, dependsOnMethods = "VerificationOfText" )//with priority you can control test execution flow, in what order to execute
  //dependsOnMethod-you are setting the condition of test execution to be dependent on the successful execution of the test identified
  public void f() {
	  Home ob= new Home(driver);
	  ob.SignToClick();
	  SignInPage it=new SignInPage(driver);
	  it.EmailFieldSendKeys();
	  it.ContinueButtonClick();
  }
  
  @Test(priority = 1)
  public void VerificationOfText() throws IOException {
	  Home ob= new Home(driver);
	  ob.SignToClick();
	  shots();
	  SignInPage it=new SignInPage(driver);
	  it.EmailFieldSendKeys();
	  shots();
	  it.ContinueButtonClick();
	  shots();
	  String errorit=  it.text();
	  System.out.println(errorit);
	  SoftAssert soft=new SoftAssert();//softassert will execute test completely regardless of failure
	  AssertJUnit.assertEquals(errorit, "We cannot find an account with that email address");
	  //Assert.assertEquals(errorit,"We cannot find an account with that email address");
	  System.out.println("This is after assertion");
	  soft.assertAll();//assertall must be present in order for any faiure in test to be noted, especially with soft assert
	  //with hard assertion, as soon as a portion of the code fails, it will stop the execution of program
  }
}
  

 
