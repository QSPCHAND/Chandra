package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeaveType
{
   public WebDriver driver;
   
   @FindBy(xpath="//input[@placeholder='Leave Type Name']")
   private WebElement createleavename;
   
   @FindBy(xpath="//div[@id='leaveTypeLightBox_commitBtn']")
   private WebElement createleavebutton;
   
   public CreateNewLeaveType(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void createleavenameMethod() throws InterruptedException
   {
	   createleavename.sendKeys("New year");
	   Thread.sleep(3000);
   }
   public void createleavebuttonMethod()
   {
	   Actions action=new Actions(driver);
	  action.click(createleavebutton).perform();;
   }
   public void acceptMethod()
   {
	   Alert alt=driver.switchTo().alert();
	   alt.accept();
   }
}
