package org.OrangeHRM.TestCases;
import java.io.IOException;
import org.OrangeHRMBase.BaseClass;
import org.OrangeHRMPages.LoginPage;
import org.OrangeHRMUtility.Utility;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_ValidateLogin extends BaseClass{

	@Test()
	public void verifyLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		l.enterusername(Utility.getTD(0,1));
		l.enterpassword(Utility.getTD(1, 1));
		l.clicksubmit();	
		WebElement homepage = driver.findElement(By.xpath("(//h6)[1]"));
		String ExpResult ="Dashboard";
		String ActResult = homepage.getText();
		Assert.assertEquals(ExpResult,ActResult);	
	}
	
	
	
	
	
	
	
	
	

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

