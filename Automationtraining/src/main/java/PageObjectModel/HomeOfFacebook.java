package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy (name="email") WebElement email;
	@FindBy (name="pass") WebElement psswd;
	@FindBy (name="login") WebElement button;
	public HomeOfFacebook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void emailfieldkeys(String emails) {
	email.sendKeys(emails);
	
}
public void psswdfieldkeys(String id) {
	psswd.sendKeys(id);
}
public void buttontoclick() {
	button.click();
}
}
