package test_Cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common_Functions.Commonfunctions;
import page_Objects.SystemUsers_Object;

public class CheckEnabledAdmin extends Commonfunctions{
	

	
	@SuppressWarnings("deprecation")
	@Test
	public void usernamefilter() throws InterruptedException {
		
		PageFactory.initElements(driver, SystemUsers_Object.class);
		
		SystemUsers_Object.admin.click();
		
		logger.info("click admin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SystemUsers_Object.usermanagement.click();
		
		logger.info("click usermanagement");
		
		SystemUsers_Object.users.click();
		
		logger.info("click username");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SystemUsers_Object.Usernamebox.sendKeys("adash");
		
		logger.info("typing in usernamebox adash");
		
		Select select=new Select(SystemUsers_Object.userrolldropdown);
		select.selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("Selecting userroll in dropdown");
		
		SystemUsers_Object.employeenameBox.sendKeys("Ananya Dash");
		
		logger.info("Typing employee name in Employee name text box");
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select select2=new Select(SystemUsers_Object.statusDropdown);
		select2.selectByIndex(0);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("Selecting status in dropdown");
		
		SystemUsers_Object.searchButton.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("Click searchbutton");
		
		/*
		 * String ActualName=SystemUsers_Object.verifyname.getText();
		 * 
		 * org.testng.Assert.assertEquals(ActualName, "Enabled");
		 */


		
		
	}
	


	
	
	
	
	
	
	

	
	
	
	
}
