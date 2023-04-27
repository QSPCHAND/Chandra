package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskBar {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	
	public TaskBar (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addnewMethod()
	{
      addnewButton.click();
	}
	public void newcustomerMethod()
	{
      newcustomerLink.click();
    }
}