package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewtypesOfWork 
{
    @FindBy(xpath="//input[@id='name']")
    private WebElement createname;  
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement createtypeofworkbutton;  
    
    @FindBy(xpath="//input[@onclick='handlecancel();']")
    private WebElement canceltypeofworkbutton;  
    
    public CreateNewtypesOfWork(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void createnameMethod() throws InterruptedException
    {
    	createname.sendKeys("typing");
    	Thread.sleep(2000);
    }
    public void createtypeofworkMethopd() throws InterruptedException
    {
        createtypeofworkbutton.click();
        Thread.sleep(2000);
    }   
}
