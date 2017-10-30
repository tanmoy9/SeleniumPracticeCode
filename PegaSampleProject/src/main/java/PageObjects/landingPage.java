package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By signininvoke= By.xpath("//a[@id='nav-link-accountList']");
	//By signinButton= By.xpath("//span[@class='nav-action-inner']");
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement getlogin()
	{
		return driver.findElement(signininvoke);
	}
	
	/*public WebElement getLoginBtn()
	{
		return driver.findElement(signinButton);
	}*/
}
