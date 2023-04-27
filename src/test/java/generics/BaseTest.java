package generics;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends ExcelLibrary  implements AutoConstants
{
	public static WebDriver driver;
    @BeforeSuite
    public void executionStart()
    {
    	System.out.println("Execution started");
    }
    
   // @Parameters("browser")
    @BeforeClass
    public void launch() throws InterruptedException
    {
    	ChromeOptions option=new ChromeOptions();
  	    option.addArguments("--remote-allow-origins=*");
  	    WebDriverManager.chromedriver().setup(); 
  	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver=new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  	    driver.get(url);
//    	}
//    	else if(browser.equalsIgnoreCase("edge"))
//    	{
//       	EdgeOptions option=new EdgeOptions();
//  	    option.addArguments("--remote-allow-origins=*");  
//  	    System.setProperty(edge_key,edge_value);
//          driver=new EdgeDriver(option);
//  	    driver.get(url);
//    	}
//    	else
//    	{  
//  	    System.setProperty(gecko_key,gecko_value);
//  	    Thread.sleep(2000);
//  	    DesiredCapabilities capabilities =new DesiredCapabilities();
//  	    capabilities.setCapability("marionette",true);
//          driver=new FirefoxDriver();
//  	    driver.get(url);
//    	}

    }
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }
    @AfterSuite
    public void executionComplete()
    {
    	System.out.println("Execution Completed");
    }
}
