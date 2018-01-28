package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AigLogin;
import pageObjects.AigLoginPage;
import utils.BaseClass;

public class GithubTest extends BaseClass {
	public static Logger log =LogManager.getLogger();
	@BeforeTest
	public void startInitBrowser() throws IOException{
		driver = startBrowser();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		log.info("driver is initialized");
	}

//	@Test
//	public void display() throws IOException{
//		AigLogin a = new AigLogin(driver);
//		a.loginPage().click();
//		AigLoginPage a3=new AigLoginPage(driver);
//		Assert.assertEquals(a3.titleText().getText(), "AIG Log In Aplications");
//		log.error("Text is displayed incorrect");
//	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver=null;
	}
}
