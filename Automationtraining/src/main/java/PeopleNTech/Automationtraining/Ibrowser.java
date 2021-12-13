package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//i) how to open the browser, note webdriver is an interface
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\OneDrive\\Desktop\\NewSelenium\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		String windowhandle= driver.getWindowHandle();
		System.out.println(windowhandle); //each windowhandle you get will have diff code because diff sessions
		String urlofbrowser= driver.getCurrentUrl();
		System.out.println(urlofbrowser);
		driver.close();//will close only one browser
		//driver.quit(); will close all browsers
		
	}

}
