package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveTypesPge 
{
   @FindBy(xpath="//span[text()='Create Leave Type']")
   private WebElement createleavebutton;
   
   public LeaveTypesPge(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);  
   }
   public void createleaveMethod() throws InterruptedException
   {
	   createleavebutton.click();
	   Thread.sleep(2000);
   }
}
