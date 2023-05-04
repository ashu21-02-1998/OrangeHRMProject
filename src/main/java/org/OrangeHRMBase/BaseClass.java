package org.OrangeHRMBase;
import java.time.Duration;
import org.OrangeHRMUtility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
     
	@BeforeMethod
	public void openBrowser() throws Exception 
	{
        if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"));
        {   
        	System.setProperty("webDriver.chrome.driver","./Drivers/chromedriver.exe");
        	driver = new ChromeDriver();
        }
       
        driver.manage().window().maximize();
        driver.get(Utility.fetchPropertyValue("applicationUrl").toString());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
           
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
