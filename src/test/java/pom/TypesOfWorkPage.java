package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWorkPage 
{
    @FindBy (xpath="//div[@class='i']")
    private WebElement createworkButton;
    
    @FindBy (xpath="//a[.='coding']//..//..//a[@href='javascript:deleteType(22);']")
    private WebElement deletebutton;
    
    public TypesOfWorkPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void createtypesofworkMethod() throws InterruptedException
    {
    	createworkButton.click();
    	Thread.sleep(2000);
    }
    public void deleteWork()
    {
    	deletebutton.click();
    }
}
