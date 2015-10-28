package Tests;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot// extends TestBase
{
//private static RemoteWebDriver driver = null;
                
public boolean takeScreenshot(final String name, RemoteWebDriver driver) 
{
	String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	System.out.print(screenshotDirectory);
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
}
/*@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void setUpPage() {
	// TODO Auto-generated method stub
}*/
}