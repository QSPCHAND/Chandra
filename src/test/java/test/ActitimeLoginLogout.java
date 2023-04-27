package test;
import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.ActitimeLoginPage;

public class ActitimeLoginLogout extends BaseTest
{
	// public WebDriver driver;
	@Test
	public void loginlogout() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		loginpage.loginMethod();
		System.out.println("EXECUTION START");
	}
}
