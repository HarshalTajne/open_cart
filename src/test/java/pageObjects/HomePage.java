package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//constructer
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}


	//Elements
	
	@FindBy(xpath ="//span[text()='My Account']")
    WebElement lnkMyaccount;

	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;
	
	@FindBy(xpath ="//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	
	
	// Action Methods
	
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
		
	}
	
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	
	public void clicklogin()
	{
		linkLogin.click();
	}
	
	
	
	
	
	
	
	
	

}
