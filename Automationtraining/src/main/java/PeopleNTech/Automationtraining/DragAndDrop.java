package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement dragged=driver.findElement(By.id("draggable"));
		WebElement dropped=driver.findElement(By.id("droppable"));
		Actions ob= new Actions(driver);
		ob.dragAndDrop(dragged, dropped).build().perform();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		
		WebElement resize=driver.findElement(By.linkText("Resizable"));
		resize.click();
		
		Thread.sleep(6000);
		driver.close();
	}

}
