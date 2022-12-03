package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_factory {

	static String browser="chrome";
	static WebDriver driver;
	
	
	

public static  WebDriver init() throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Firefox"))
				{System.setProperty("webdriver.gecko.driver", "geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();}
		else if(browser.equalsIgnoreCase("chrome")) {System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		return driver;
}}

