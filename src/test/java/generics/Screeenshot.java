package generics;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screeenshot implements ITestListener
{
   public void onTestFailure(ITestResult result)
   {
	   TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
	   File srcfile=ts.getScreenshotAs(OutputType.FILE);
	   File destfile=new File("./failedscreenshot/failed1.png");
	   try 
	   {
		 FileHandler.copy(srcfile, destfile);
	   } 
	   catch (Exception e)
	   {
		 e.printStackTrace();
	   }
   }
}
