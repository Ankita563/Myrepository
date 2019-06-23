package second;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToMMT {
	@BeforeMethod
	public void StartBrowser()
	{
		Reporter.log("=====Browser Session Started=====", true);
		System.out.println("Launch Browser");
	}
	@Test(priority=0,description="This test case is for Login")
	public void LoginToMMT()
	{
		System.out.println("Logged In to MMT");
	}

	@AfterMethod
	public void LoginToMMT1()
	{
		System.out.println("Closing Browser");
		Reporter.log("=====Browser Session Ended=====",true);
	}

}
