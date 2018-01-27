package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseClass;

public class AigLogin extends BaseClass {
	
	By login=By.xpath("/html/body/div[1]/div[2]/header/div[1]/nav[2]/div/div/div/div[2]/ul/li[4]/a");
	
	public AigLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement loginPage(){
		return driver.findElement(login);
	}
	
}
