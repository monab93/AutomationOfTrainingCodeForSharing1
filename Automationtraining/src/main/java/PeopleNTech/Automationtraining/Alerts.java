package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alerts {
public static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement simplealert=driver.findElement(By.id("alertButton"));
		Thread.sleep(1000);
		simplealert.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement alert2=driver.findElement(By.id("confirmButton"));
		alert2.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		WebElement alert3=driver.findElement(By.id("confirmButton"));
		alert3.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		driver.close();

	}

}
