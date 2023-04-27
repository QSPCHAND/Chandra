package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com");
		 driver.manage().window().maximize();
		 
		 ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		 loginpage.loginMethod();
		 
		 ActitimeHomePage homepage=new ActitimeHomePage(driver);
	     homepage.taskMethod();
	     
		 Thread.sleep(3000);
		 TaskBar taskPage=new TaskBar(driver);
		 taskPage.addnewMethod();
		 taskPage.newcustomerMethod();
		 Thread.sleep(3000);
		 
		 CreatNewCustomer creatcustomer=new CreatNewCustomer(driver);
		 creatcustomer.entercustomernameMethod();
		 creatcustomer.entercustomerdescriptionMethod();
		 creatcustomer.createcustomerMethod();	
		//creatcustomer.cancelMethod();
		 
	}

}
