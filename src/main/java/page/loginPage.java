package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

	WebDriver driver;

	@FindBy(how=How.XPATH, using="//input[@id='username']") WebElement usernameElement;
	@FindBy(how=How.XPATH,using="//input[@type='password']") WebElement passwordElement;
	@FindBy(how=How.XPATH,using="//button[@type='submit']")WebElement loginElement;

	public loginPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
	public void insertusername(String username) {
		usernameElement.sendKeys(username);
		}
	public void insertpassword(String loginpassword) {
		passwordElement.sendKeys(loginpassword);
	}
	public void submit() {
		loginElement.click();
	}
	}
