package Automation.Automation;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest extends Necessary

{
	
	
	@Test(priority=1)
	public void sampleTestGoogle()
	{
		WebDriver driver=null;
		CommonUtilities c = new CommonUtilities(driver);
		c.launchChromeBrowser();
		c.getURL("http://google.com");
		c.closeDriver();
		
	}
	
	@Test(priority=1)
	public void sampleTestFB()
	{
		WebDriver driver=null;
		CommonUtilities c = new CommonUtilities(driver);
		c.launchChromeBrowser();
		c.getURL("http://facebook.com");
		//assert.assertEquals("String", "Stromg");
		c.closeDriver();
		
	}
	
	@Test(priority=1)
	public void sampleTestGmail()
	{
		WebDriver driver=null;
		CommonUtilities c = new CommonUtilities(driver);
		c.launchChromeBrowser();
		c.getURL("http://gmail.com");
		c.closeDriver();
		
	}
	
	
}
