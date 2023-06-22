package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{

	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		try 
		{
		logger.info("**** Starting TC_002_LoginTest****");
	
		HomePage hp = new HomePage(driver);
	    hp.clickMyAccount();
	    logger.info("clicked on My Account");
	    
	    hp.clicklogin();
	    logger.info("clicked on Login Link");
	    
	    LoginPage lp = new LoginPage(driver);
	    logger.info("Providing login details");
	
	    lp.setEmail(rb.getString("email")); //valid email from config . proerties file
	    lp.setPassword(rb.getString("password"));//valid-----
	    lp.clickLogin();
	    logger.info("clicked on login button ");
	    
	    MyAccountPage macc=new MyAccountPage(driver);
	
	   boolean targetpage= macc.isMyAccountPageExists();
	
	   Assert.assertEquals(targetpage, true,"Invalid login data");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest ****");
	   
	}
	
}
