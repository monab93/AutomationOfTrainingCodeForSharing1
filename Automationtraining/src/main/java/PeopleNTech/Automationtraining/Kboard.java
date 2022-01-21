package PeopleNTech.Automationtraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kboard {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com");
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//implicit wait works with any exceptions
		//Thread.sleep(1000);
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("computer");
		//Thread.sleep(1000);
		
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		searchfield.clear();
		//Thread.sleep(1000);
		searchfield.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement searchfield2=driver.findElement(By.id("twotabsearchtextboxit"));
		WebDriverWait wt=new WebDriverWait(driver,10);//when you want to use -explicit wait- you have to create the object of the WebDriverWait class
		wt.until(ExpectedConditions.elementToBeClickable(searchfield2));//and you will choose your necessary condition for Explicit wait
		/*Implicit and Explicit wait allow for wait time if possible error is suspected
		 * Thread.sleep() doesn't regard whether there are errors or not
		 * Explicit wait is appropriate if you want a wait for a specific element or exception whereas implicit wait works with each and every exception
		 */
		
		//Thread.sleep(3000);
		driver.close();
	}

}
