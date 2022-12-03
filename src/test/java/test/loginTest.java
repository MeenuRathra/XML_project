package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.addCustomer;
import page.dashboardPage;
import page.loginPage;
import util.browser_factory;

public class loginTest {

	WebDriver driver;
	@Test
	@Parameters({"username","password","expectedMessage"})
	public void login_Test(String username, String password,String expectedMessage) throws InterruptedException {
		
		driver= browser_factory.init();
		
		loginPage loginpage= PageFactory.initElements(driver, loginPage.class);
		loginpage.insertusername(username);
		loginpage.insertpassword(password);
		loginpage.submit();
		
		dashboardPage dashboard= PageFactory.initElements(driver, dashboardPage.class);
		dashboard.dashboardconfirmation(expectedMessage);
		
		
	}
	}
