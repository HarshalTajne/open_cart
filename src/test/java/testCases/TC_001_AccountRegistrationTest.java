package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	
	
	@Test(groups= {"Regression","Master"})
	void test_account_Registration()
	{
		
		  logger.debug("application logs........");
	      logger.info("***  Starting TC_001_AccountRegistrationTest ***");
		try                   // to avoid the exception we use try catch block
		{
		HomePage hp = new HomePage(driver);
		
		      hp.clickMyAccount();
		      logger.info("Clicked on register link");
		     
		      hp.clickRegister();
		      logger.info("Clicked on register link");
		      
	    AccountRegistrationPage repage = new AccountRegistrationPage(driver);
		      
	          logger.info("Providing customer data");
	    
	          repage.setFirstName(randomeString().toUpperCase());
	         
	          repage.setLastName(randomeString().toUpperCase());
	          
	          repage.setEmail(randomeString()+"@gmail.com");
	          
	          repage.setTelephone(randomNumber());
	          
	          String password=randomAlphaNumeric();
	          
	          
	          repage.setPassword(password);
	         
	          repage.setConfPassword(password);
	          
	          repage.setchkPolicy();
	          
	          repage.clickContinue();
	          
	          logger.info("clicked on continue");
	    
	          String confmsg=repage.getConfirmationMsg();
	          
	          logger.info("Validating expected message");
	    
	          Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		} 
		
		catch(Exception e)
		{
			logger.error("Validating expected message");
			//Assert.fail();
		}
	
		 logger.info("***  Finished TC_001_AccountRegistrationTest ***");
	}

	   private String randomAlphaNumeric() {
		
		return null;
	} 
	
	
	
	
}
