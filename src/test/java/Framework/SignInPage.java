package Framework;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AigLogin;
import pageObjects.AigLoginPage;
import pageObjects.AigSignIn;
import utils.BaseClass;

public class SignInPage extends BaseClass {
	public static Logger log =LogManager.getLogger();
	@BeforeTest
	public void startInitBrowser() throws IOException{
		driver = startBrowser();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		log.info("driver is initialized");
	}

@Test(dataProvider="getData")
public void windowNavigation(String user, String pass) throws IOException{
	
	AigLogin a = new AigLogin(driver);
	a.loginPage().click();
	AigLoginPage a1 = new AigLoginPage(driver);
	a1.clickText().click();
//	HomePage h = new HomePage(driver);
//	h.pageNavigation();
	Set<String> s = driver.getWindowHandles();
	Iterator<String> itr=s.iterator();
	String parentid = itr.next();
	String childid = itr.next();
	driver.switchTo().window(childid);
	AigSignIn a2 =  new AigSignIn(driver);
	a2.usernameEnter().sendKeys(user);
	a2.passwordEnter().sendKeys(pass);
	a2.signinClick().click();

}
@DataProvider
public Object[][] getData(){
	Object [] [] data = new Object[1][2];
	data [0][0]="abcd";
	data [0][1]="1234";
//	data [1][0]="asdf";
//	data [1][1]="4566";
	
	return data;
}
@AfterTest
public void tearDown(){
	driver.close();
	driver=null;
}
}

