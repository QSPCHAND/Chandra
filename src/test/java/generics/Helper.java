package generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper
{
   public static void highlightelement(WebDriver driver,WebElement element) throws InterruptedException
   {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].setAttribute('style','background:yellow')",element);
	   Thread.sleep(2000);
	   js.executeScript("arguments[0].setAttribute('style','background:white')",element);
   }
}
