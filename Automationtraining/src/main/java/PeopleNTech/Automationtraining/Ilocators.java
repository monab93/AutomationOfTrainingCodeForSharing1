package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement SearchIcon= driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		WebElement BestSellers= driver.findElement(By.linkText("Best Sellers"));
		Thread.sleep(1000);
		BestSellers.click();
		Thread.sleep(1000);
		WebElement linktx=driver.findElement(By.partialLinkText("Epic"));
		Thread.sleep(1000);
		linktx.click();
		Thread.sleep(1000);
		WebElement searchBar= driver.findElement(By.name("field-keywords"));
		searchBar.sendKeys("computer");
		WebElement SearchIcon1= driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon1.click();
		Thread.sleep(1500);
		driver.close();
	}

}
