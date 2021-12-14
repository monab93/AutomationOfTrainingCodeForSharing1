package PeopleNTech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement field=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));//absolute xpath
		field.sendKeys("enter your email address");
		Thread.sleep(500);
		WebElement pass=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));//absolute xpath
		pass.sendKeys("password");
		Thread.sleep(500);
		WebElement logIn=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		logIn.click();
		//relative xpath using partial text value of an attribute is Contains xpath: //*[contains(@type,'sub')]
		WebElement user=driver.findElement(By.xpath("//*[contains(@placeholder,'Email or phone number')]"));
		user.sendKeys("mashiri");
		Thread.sleep(1000);
		WebElement fPass=driver.findElement(By.xpath("//a[text()='Forgot password?']"));//relative xpath using xpath text() function, useful when no specific attribute is not available
		fPass.click();
		Thread.sleep(6000);
		driver.close();
	}

}
