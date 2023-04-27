package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {
   
   @FindBy(xpath="//div[@id='container_tasks']")
   private WebElement taskLink;
   
   @FindBy(xpath="(//div[@class='menu_icon'])[2]")
   private WebElement settingsLink;
   
   @FindBy(xpath="//a[.='Types of Work']")
   private WebElement typesofWorklink;
   
   @FindBy(xpath="//a[.='Leave Types']")
   private WebElement leaveTypelink;
   
   @FindBy(xpath="//a[.='Logout']")
   private WebElement logoutLink;
   
   //Initialize
  public ActitimeHomePage (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void taskMethod()
   {
	   taskLink.click();   
   }
   public void settingsMethod()
   {
	   settingsLink.click();
   }
   public void typesofWorkMethod() throws InterruptedException
   {
	   Thread.sleep(2000);
	   typesofWorklink.click();
   }
   public void leaveTypeMethod() throws InterruptedException
   {
	   Thread.sleep(2000);
	   leaveTypelink.click();
   }
   public void logoutMethod(WebDriver driver)
   {
	   Actions action=new Actions(driver);
	   action.moveToElement(logoutLink).click().perform();
   }
}