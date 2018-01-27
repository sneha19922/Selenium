package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AigLogin;
import pageObjects.AigLoginPage;
import utils.BaseClass;

public class HomePage extends BaseClass{
	public static Logger log =LogManager.getLogger();
	@BeforeTest
	public void startInitBrowser() throws IOException{
		driver = startBrowser();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
	}

	@Test
	public void pageNavigation() throws IOException{
		
		AigLogin a = new AigLogin(driver);
		a.loginPage().click();
		AigLoginPage a1 = new AigLoginPage(driver);
		a1.clickText().click();
		log.info("Login is clicked");
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
}
