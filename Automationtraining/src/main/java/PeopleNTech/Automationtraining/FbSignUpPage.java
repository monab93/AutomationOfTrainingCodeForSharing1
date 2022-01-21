package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpPage {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAnAccount.click();
		Thread.sleep(1000);
		WebElement MonthOfBirth=driver.findElement(By.name("birthday_month"));
		Select ob = new Select(MonthOfBirth);
		ob.selectByValue("1");
		Thread.sleep(1000);
		WebElement BirthDay=driver.findElement(By.name("birthday_day"));
		Select birth=new Select(BirthDay);
		birth.selectByIndex(5);
		Thread.sleep(1000);
		WebElement BirthYear=driver.findElement(By.id("year"));
		Select year=new Select(BirthYear);
		year.selectByVisibleText("2000");
		WebElement Gendertoggle=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
		Gendertoggle.click();
		Thread.sleep(1000);
		
		Thread.sleep(6000);
		driver.close();
		
		

	}

}
