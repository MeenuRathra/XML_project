package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class dashboardPage {

	WebDriver driver;
	@FindBy (how=How.XPATH,using="//h2[contains(text(),'Dashboard')]")WebElement dashboardElement;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Customers')]")WebElement clickcustomerElement;
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Add Customer')]")WebElement addcustomerclickElement;

	public dashboardPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void dashboardconfirmation(String expected) {
		Assert.assertEquals(dashboardElement.getText(), expected);
		
	}

	public void clickcustomer() {
		clickcustomerElement.click();
		
	}

	public void addcutomerclick() {
		
		addcustomerclickElement.click();
		
		
	}
	}

