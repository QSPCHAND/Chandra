package test;
import java.io.IOException;
import org.testng.annotations.Test;
import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

//@Listeners(generics.Screeenshot.class)
public class ActitimeLoginLogoutST extends BaseTest
{
   @Test
   public void loginlogoutST() throws InterruptedException, IOException
   {
	   ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
	   loginpage.loginMethod();
	   Thread.sleep(2000);
	   ActitimeHomePage homepage=new ActitimeHomePage(driver);
	   homepage.logoutMethod(driver);
   }
}

