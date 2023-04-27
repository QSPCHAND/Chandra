package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstants;
import generics.ExcelLibrary;
import generics.Helper;

public class ActitimeLoginPage implements AutoConstants
{
	public WebDriver driver;
    //Declaration
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwdTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordlink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	//Initialization
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void loginMethod() throws InterruptedException, IOException
	{
		Helper.highlightelement(driver,usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellValue(sheet1_name, 1, 0));
		Helper.highlightelement(driver,passwdTextfield);
		passwdTextfield.sendKeys(ExcelLibrary.getcellValue(sheet1_name, 1, 1));
		Thread.sleep(3000);
		keepLoggedInCheckBox.click();
		loginButton.click();
		Thread.sleep(3000);
	}
	public void forgotpasswordMethod()
	{
		forgotyourpasswordlink.click();
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}

	
	
	
	
	
	
	
	
	
	
	
}
