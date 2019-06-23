package Automation.Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Necessary {
	
@org.testng.annotations.BeforeMethod
public void BeforeMethod() {
	
	System.out.println("//////This is before Test");
	
}
@AfterMethod
public void AfterMethod() {
	System.out.println("//////This is After Method");
}

@org.testng.annotations.BeforeClass
public void BeforeClass()
{
	System.out.println("///////Before Class");
}
@AfterClass
public void AfterClas()
{
	System.out.println("//////////After Class");
}

}
