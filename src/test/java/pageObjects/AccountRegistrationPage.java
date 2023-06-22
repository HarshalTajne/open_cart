package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	    public AccountRegistrationPage(WebDriver driver)   //Constructer
	    {
	    	super(driver);
	    }
	   

	    // Elements
	    
	    @FindBy(xpath="//input[@id='input-firstname']")
	    
	    WebElement txtFirstname;
	    
	    
	    @FindBy(xpath="//input[@id='input-lastname']")
	    
	    WebElement txtLastname;
	    

	    @FindBy(name="email")
	    
	    WebElement txtEmail;
	    
	    
	    @FindBy(name="telephone")

        WebElement txtTelephone;
	    
	    
	    @FindBy(name="password")
	    
	    WebElement txtPassword;
	    
	    
	    @FindBy(name="confirm")
	    
	    WebElement txtConfPassword;
	    
	    @FindBy(name="agree")
	    
	    WebElement chkdPolicy;
	    
	    
	    @FindBy(xpath="//input[@value='Continue']")
	    
	    WebElement btnContinue;
	    
	    
	    @FindBy(xpath="h1[normalise-space()='Your Account Has Been Created!']")
	    
	    WebElement msgConfirmation;
	    
	    
	    //Action Methods
	    
	    public void setFirstName(String fname)
	    {
	    	txtFirstname.sendKeys(fname);
	    }

        
	    public void setLastName(String lname)
	    {
	    	txtLastname.sendKeys(lname);
	    }

        
	    public void setEmail(String email)
	    {
	    	txtEmail.sendKeys(email);
	    }


        public void setTelephone(String tel)
        {
        	txtTelephone.sendKeys(tel);
        }
        
        
        public void setPassword(String pwd)
        {
        	txtPassword.sendKeys(pwd);
        }
        
        
        public void setConfPassword(String cpwd)
        {
        	txtConfPassword.sendKeys(cpwd);
        }
        
        public void setchkPolicy()
        {
        	chkdPolicy.click();
        }


        public void clickContinue()
        
        {
        	btnContinue.click();
        }


        public String getConfirmationMsg()
        {
        	
        	try{ 
        		
        		return(msgConfirmation.getText());
        		
        	   }catch(Exception e) {
        		   
        	      return(e.getMessage());	   
        	   }
        	
        }
        
        
        
}
