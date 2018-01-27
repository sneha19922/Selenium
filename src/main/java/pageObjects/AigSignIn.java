package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class AigSignIn extends BaseClass {
	By uname = By.id("username");
	By pwd = By.id("password");
	By signin = By.xpath("//*[@id='aig-main-registration']/div/div/div[1]/button");
	public AigSignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement usernameEnter(){
		
		return driver.findElement(uname);
	}
	public WebElement passwordEnter(){
		
		return driver.findElement(pwd);
	}
	public WebElement signinClick(){
		
		return driver.findElement(signin);
	}
}
