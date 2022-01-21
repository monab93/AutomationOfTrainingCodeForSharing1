package PeopleNTech.Automationtraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows {
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
		WebElement books=driver.findElement(By.linkText("Kindle Books"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		books.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		String Current= driver.getWindowHandle();
		System.out.println(Current);
		Set<String> windowhandles=	driver.getWindowHandles();
		Iterator<String> iterators=windowhandles.iterator();
		String Parentwindowhandle=	iterators.next();
		String Childwindowhandle=	iterators.next();
		System.out.println("This is parent window="+Parentwindowhandle);
		System.out.println("This is child window="+Childwindowhandle);
		driver.switchTo().window(Childwindowhandle);
		Thread.sleep(3000);
		WebElement exclusive=driver.findElement(By.linkText("Kindle Exclusives"));
		exclusive.click();
		
	}

}
