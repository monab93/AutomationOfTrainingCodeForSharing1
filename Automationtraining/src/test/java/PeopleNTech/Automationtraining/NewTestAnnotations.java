package PeopleNTech.Automationtraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }
public void f6() {
	
}
  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
