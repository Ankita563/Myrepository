package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Readwriteconfig {                                  //this program is to store values in properties file(config) through java//

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Selenium_Workspace\\AutomationWithSelenium\\src\\Automation\\config.properties");
		Properties pro=new Properties();
				pro.put("browser", "chrome");
				FileOutputStream fout=new FileOutputStream("C:\\Selenium_Workspace\\AutomationWithSelenium\\src\\Automation\\config.properties");
		pro.store(fout, "");
		fout.close();

	}

}
