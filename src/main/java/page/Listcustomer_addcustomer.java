package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Listcustomer_addcustomer extends base {


WebDriver driver;
@FindBy(how=How.XPATH,using="//input [@ id='account']")WebElement cutomerfullnameElement;
@FindBy(how=How.XPATH,using="//select[@id='cid']")WebElement companydropdwnElement;
@FindBy(how=How.XPATH,using="//input[@id='email']")WebElement emailElement;
@FindBy(how=How.XPATH,using="//input[@id='password']")WebElement passwordElement;
@FindBy(how=How.XPATH,using="//input[@id='cpassword']")WebElement confirmpasswordElement;
@FindBy(how=How.XPATH,using="//input[@id='phone']")WebElement phoneElement;
@FindBy(how=How.XPATH,using="//input[@id='address']")WebElement addressElement;
@FindBy(how=How.XPATH,using="//input[@id='city']")WebElement cityElement;
@FindBy(how=How.XPATH,using="//input[@id='state'and @name='state']")WebElement stateElement;
@FindBy(how=How.XPATH,using="//input[@id='zip'and @name='zip']")WebElement zipElement;
@FindBy(how=How.XPATH,using="//select[@id='group']")WebElement groupElement;
@FindBy(how=How.XPATH,using="//*[@id=\"submit\"]")WebElement saveElement;
@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]") WebElement clicklistcustomer;
@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]")WebElement addCutomer_listcustomer;
public Listcustomer_addcustomer(WebDriver driver) {
	this.driver=driver;
	
}

public void clicklistCustomers() {
	
	clicklistcustomer.click();
}

public void addcustomer_listcustomer() {
	
	addCutomer_listcustomer.click();
}
public void customerfullname(String fullname) {
	
String insertedfullname=fullname+generateRandomNum(10);
cutomerfullnameElement.sendKeys(insertedfullname);

}
public void compantdropdwn(String company) {
	selectFromDropdown(companydropdwnElement, company);
	
}

public void enteremail(String email) {
	emailElement.sendKeys(generateRandomNum(33)+email);
}
public void enterpassword(String password) {
	passwordElement.sendKeys(password);
}
public void confirmpassword(String confirmpassword) {
	confirmpasswordElement.sendKeys(confirmpassword);
}
public void enterphonenum(String phone) {
	phoneElement.sendKeys(phone+generateRandomNum(587));
}
public void address(String address) {
	addressElement.sendKeys(address);
}
public void city(String city) {
	cityElement.sendKeys(city);
}
public void state(String state) {
	stateElement.sendKeys(state);
}
public void zip(String zipcode) {
	zipElement.sendKeys(zipcode);
}
public void group(String group) {
	selectFromDropdown(groupElement, group);
}

public void save() {
	
	saveElement.click();
}


	}


