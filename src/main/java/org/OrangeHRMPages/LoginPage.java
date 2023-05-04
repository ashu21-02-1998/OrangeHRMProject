package org.OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Step 1 : Declaration
	
		@FindBy(xpath="//input[@name='username']")
		private WebElement usernameField;
		
		@FindBy(xpath="//input[@name='password']")
		private WebElement passwordField;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement submit;
		
		WebDriver driver;
		
		//Step 2 : Initialization
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		//Step 3 : Utilization
		
		public void enterusername(String username)
		{
			usernameField.sendKeys(username);
		}
		public void enterpassword(String password)
		{
			passwordField.sendKeys(password);
		}
		public void clicksubmit()
		{
			submit.click();
		}
	
	
	
	
	
	
	
	
	
	
	
}
