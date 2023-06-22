package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver Driver;
	
	public BasePage(WebDriver driver)
	{
		this.Driver=driver;
		PageFactory.initElements(driver,this);
       
		
	}

}
