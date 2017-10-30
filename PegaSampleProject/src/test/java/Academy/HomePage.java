package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.landingPage;
import Resources.base;

public class HomePage extends base{
	
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String username, String Password) throws IOException
	{
		driver= initializeDriver();
		driver.get("http://www.amazon.com");		
		driver.manage().window().maximize();
		
		landingPage l= new landingPage(driver);		
		WebElement signin= l.getlogin();
				
		Actions a= new Actions(driver);
		a.moveToElement(signin).click().build().perform();
		
		LoginPage lp=new LoginPage(driver);		
		lp.getEmail().sendKeys(username);
		lp.getPwd().sendKeys(Password);		
		//System.out.println(text);
		lp.getSubmitBtn().click();
		
		driver.quit();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="nonrestrictedusers@test.com";
		data[0][1]="123456789";
		//data[0][2]="Restricted users";
		
		/*data[1][0]="restrictedusers@test.com";
		data[1][1]="122";
		data[1][2]="UnRestricted users";
		*/
		
		return data;
	}

}
