package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.addCustomer;
import page.dashboardPage;
import page.loginPage;
import util.browser_factory;

public class addcustomerTest {

	WebDriver driver;
	@Test
	@Parameters({"username","password","expectedMessage","fullname","email","passwords","city","address","group","company","phone"})
	public void login_Test(String username, String password,String expectedMessage,String fullname,String email,String passwords, String city,String address, String group,String company, String phone) throws InterruptedException {
		
		driver= browser_factory.init();
		
		loginPage loginpage= PageFactory.initElements(driver, loginPage.class);
		loginpage.insertusername(username);
		loginpage.insertpassword(password);
		loginpage.submit();
		
		dashboardPage dashboard= PageFactory.initElements(driver, dashboardPage.class);
		dashboard.dashboardconfirmation(expectedMessage);
	
		dashboard.clickcustomer();
		dashboard.addcutomerclick();
		
		addCustomer addcustomer=PageFactory.initElements(driver, addCustomer.class);
		
		addcustomer.customerfullname(fullname);
		addcustomer.enteremail(email);
		addcustomer.confirmpassword(passwords);
		//addcustomer.confirmpassword(password);
		addcustomer.city(city);
		addcustomer.address(address);
		addcustomer.group(group);
		addcustomer.compantdropdwn(company);
		addcustomer.enterphonenum(phone);
		addcustomer.save();
		Thread.sleep(500);
		addcustomer.clicklistCustomers();
		addcustomer.verifyInsertedNameAndDelete();
		 

}}