package test_Cases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.Commonfunctions;
import page_Objects.Loginpage_objects;

public class LoginTestcase1 extends Commonfunctions {

	@SuppressWarnings("deprecation")
	@Test
	
	public void login() throws InterruptedException {
		
		PageFactory.initElements(driver,Loginpage_objects.class);
		Loginpage_objects.username.sendKeys(properties.getProperty("username"));
		logger.info("entering username");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Loginpage_objects.password.sendKeys(properties.getProperty("password"));
		
		logger.info("entering password");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Loginpage_objects.submitbutton.click();
		
		logger.info("click submit button");	
	}
	
	
	
	
	
	
	
	
}
