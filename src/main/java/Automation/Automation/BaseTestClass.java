package Automation.Automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass extends ChromeDriver {

	public void close() {
		
		System.out.println("Attempting close");
		super.close();
		
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
 }

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void get(String arg0) {
			
		System.out.println("Navigating to URL: "+ arg0);
		super.get(arg0);
	}

	public String getCurrentUrl() {
		
		return null;
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

}
