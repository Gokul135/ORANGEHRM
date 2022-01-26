package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemUsers_Object {

	
	@FindBy(xpath="//a[@class='firstLevelMenu']//b[text()='Admin']")
	public static WebElement admin;
	
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	public static WebElement usermanagement;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	public static WebElement users;
	
	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	public static WebElement Usernamebox;
	
	@FindBy(xpath="//select[@id='searchSystemUser_userType']")
	public static WebElement userrolldropdown;
	
	@FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	public static WebElement employeenameBox;
	
	@FindBy(xpath="//li[@class='ac_even ac_over']")
	public static WebElement selectname;
		
	@FindBy(xpath="//select[@id='searchSystemUser_status']")
	public static WebElement statusDropdown;
	
	@FindBy(xpath="//input[@id='searchBtn']")
	public static WebElement searchButton;
	
	@FindBy(xpath="//td[text()='Enabled']")
	public static WebElement verifyname;
	
	
	
}
