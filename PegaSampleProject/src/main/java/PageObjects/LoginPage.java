package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	By email= By.xpath("//input[@id='ap_email']");
	By pwd=By.xpath("//input[@id='ap_password']");
	By signInBtn=By.xpath("//input[@id='signInSubmit']");
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getSubmitBtn()
	{
		return driver.findElement(signInBtn);
	}
}
