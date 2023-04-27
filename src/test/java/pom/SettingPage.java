package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingPage
{
    @FindBy(xpath="//a[.='Types of Work']")
    private WebElement typesOfWork;
    
    @FindBy(xpath="//a[.='Leave Types']")
    private WebElement leaveType;
    
    public SettingPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void typesOfWorkMethod()
    {
    	typesOfWork.click();
    }
    public void leavetypesMethod()
    {
    	leaveType.click();
    } 
}
