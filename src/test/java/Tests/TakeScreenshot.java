package Tests;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import Tests.AbstractBaseTests.TestBase;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TakeScreenshot extends TestBase
{
//private static RemoteWebDriver driver = null;
                
public boolean takeScreenshot(final String name) 
{
	String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	System.out.print(screenshotDirectory);
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
}
	/*@BeforeMethod
    public void setUp() throws Exception 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //driver = new RemoteWebDriver(url, capabilities);                     
    }*/
                
    @Test
    public void test01(String x) throws InterruptedException 
    {
        /*driver.findElement(By.name("Add")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("Complete Taxes");
        driver.findElement(By.name("Save")).click();
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]")).click();*/
        //String screenshot2 = "second";
        takeScreenshot(x);
    }
                
   /*@Test
   public void test02() throws InterruptedException 
   {
       driver.findElement(By.name("Add")).click();
       driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("Book tickets for vacation");
       driver.findElement(By.name("Save")).click();
       String screenshot2 = "second";
       takeScreenshot(screenshot2);
   }
	                
   @AfterMethod
   public static void tearDownClass() 
   {
	   if (driver != null) {
       driver.quit();}
   }*/
@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void setUpPage() {
	// TODO Auto-generated method stub
	
}
}
	   
