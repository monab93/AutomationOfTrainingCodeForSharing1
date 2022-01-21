package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Flights {
	public static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://expedia.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement flights=driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span"));
		flights.click();
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		Thread.sleep(1000);
		WebElement depDate=driver.findElement(By.xpath("//*[@aria-label='Dec 26, 2021']"));
		depDate.click();
		Thread.sleep(1000);
		WebElement retDate=driver.findElement(By.xpath("//*[@data-day='31']"));
		retDate.click();
	
		
		Thread.sleep(6000);
		driver.close();
		
	
	}

}
