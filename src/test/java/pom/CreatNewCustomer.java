package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstants;
import generics.ExcelLibrary;
import generics.Helper;

public class CreatNewCustomer implements AutoConstants
{
	public WebDriver driver;
   //declaration
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
   private WebElement customername;
   
   @FindBy(xpath="(//textarea[@class='textarea'])[9]")
   private WebElement customerdescription;
   
   @FindBy(xpath="//div[.='Create Customer']")
   private WebElement creatcustomer;
   
   @FindBy(xpath="//div[@class='greyButton cancelBtn']")
   private WebElement cancelButton;
   
   public CreatNewCustomer(WebDriver driver)
   {
	  this.driver=driver; 
	   PageFactory.initElements(driver,this);
   }
   public void entercustomernameMethod() throws InterruptedException, IOException
   {
	   Helper.highlightelement(driver,customername);
	   customername.sendKeys(ExcelLibrary.getcellValue(sheet2_name, 1, 0));
   }
    public void entercustomerdescriptionMethod() throws InterruptedException, IOException
   {
      Helper.highlightelement(driver, customerdescription);
	  customerdescription.sendKeys(ExcelLibrary.getcellValue(sheet2_name, 1, 1));
   }
    public void createcustomerMethod()
   {
	   creatcustomer.click();
   }
   public void cancelMethod()
   {
	   cancelButton.click();  
   }
   public void acceptalert() throws InterruptedException
   {
	   driver.switchTo().alert().accept();
	   Thread.sleep(2000);
   }
}
