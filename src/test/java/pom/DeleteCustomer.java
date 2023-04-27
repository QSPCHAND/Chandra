package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer 
{
    public WebDriver driver;
    @FindBy (xpath="//div[.='Akash']")
    private WebElement cname;
    @FindBy (xpath="(//div[.='Akash']//..//..//div[@class='editButton'])[1]")
    private WebElement setting;
    @FindBy (xpath="(//div[.='ACTIONS'])[1]")
    private WebElement action;
    @FindBy (xpath="(//div[.='Delete'])[2]")
    private WebElement deleteButton;
    @FindBy (xpath="//span[.='Delete permanently']")
    private WebElement permanentdeleteButton;
    @FindBy (xpath="(//div[@class='copyButton'])[1]")
    private WebElement copyButton;
    @FindBy (xpath="(//div[@class='hideButton_panelContainer'])[1]")
    private WebElement cancelbutton;
    
    public DeleteCustomer(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    } 
    public void cNameMethod()
    {
    	cname.click();
    }
	public void settingMethod()
    {
    	setting.click();
    }
    public void actionMethod()
    {
    	action.click();
    }
    public void deleteButtonMethod()
    {
    	deleteButton.click();
    }
    public void permanentDeleteMethod()
    {
    	permanentdeleteButton.click();
    }
    public void copyButtonMethod()
    {
    	copyButton.click();
    }
    public void cancelbuttonMethod()
    {
    	cancelbutton.click();
    }
}
