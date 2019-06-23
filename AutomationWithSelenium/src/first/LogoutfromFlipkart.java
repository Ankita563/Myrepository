package first;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutfromFlipkart {
	@BeforeMethod
	public void StartBrowser()
	{
		Reporter.log("=====Browser Session Started=====", true);
		System.out.println("Launch Browser");
	}
	@Test(priority=0,description="This test case is for Logout")
	public void LogoutfromFlipkart()
	{
		System.out.println("LogoutfromFlipkart");
	}

	@AfterMethod
	public void LogoutfromFlipkart1()
	{
		System.out.println("Closing Browser");
		Reporter.log("=====Browser Session Ended=====",true);
	}


}
