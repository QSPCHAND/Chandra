package test;
import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;
import pom.CreatNewCustomer;
import pom.TaskBar;

public class ActitimeLoginCreateCustomerDeleteCustomerLogout extends BaseTest
{
    @Test
    public void createCustomerAndDeleteCustomer() throws InterruptedException, IOException
    {
       ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
  	   loginpage.loginMethod();
  	   Thread.sleep(2000);
  	   ActitimeHomePage homepage=new ActitimeHomePage(driver);
  	   homepage.taskMethod();
  	   Thread.sleep(2000);
  	   TaskBar task=new TaskBar(driver);
  	   task.addnewMethod();
  	   Thread.sleep(2000);
  	   task.newcustomerMethod();
  	   Thread.sleep(2000);
  	   CreatNewCustomer newCustomer=new CreatNewCustomer(driver);
  	   newCustomer.entercustomernameMethod();
  	   newCustomer.entercustomerdescriptionMethod();
  	   newCustomer.createcustomerMethod();
    }
}
