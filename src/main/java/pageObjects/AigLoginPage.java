package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.BaseClass;

public class AigLoginPage extends BaseClass {
	By dropdown = By.linkText("Log into AIG Go WC");
	By text = By.xpath("//*[@id='aig-template-wrapper']/div/div[1]/h1");
	public AigLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement titleText(){
		
		return driver.findElement(text);
	}
	
	public WebElement clickText(){
		
		return driver.findElement(dropdown);
	}
	
}
