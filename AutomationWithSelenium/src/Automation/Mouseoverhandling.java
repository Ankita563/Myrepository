package Automation;

import javax.swing.text.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverhandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Workspace\\AutomationWithSelenium\\Drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
	     d.get("C:/Users/Omita/Desktop/snaps/iframe.html");
	     d.manage().window().maximize();
	     /*WebElement ele=d.findElement(By.xpath("//button[contains(text(),'Month')]"));*/
	     
	    /* WebElement month=d.findElement(By.xpath("//button[contains(text(),'Month')]"));
	     WebElement data=d.findElement(By.xpath("//a[text()='February']"));
	     */
	    WebElement username=d.findElement(By.xpath("//button[contains(text(),'Username')]")); 
	    WebElement data=d.findElement(By.xpath("//a[text()='Ankita']"));
	    
	    WebElement password=d.findElement(By.xpath("//button[contains(text(),'Password')]")); 
	    WebElement data1=d.findElement(By.xpath("//a[text()='Omkar']"));
	    
	    /*WebElement Submit=d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();*/
	    
	    WebElement ele=d.findElement(By.id("dblClkButton_01"));
	   /* WebElement ele1=d.findElement(By.xpath("//button(text(),'Username')]")).click();*/
	   
	    
	     	Actions builder=new Actions(d);
	     	//Action act1=builder.moveToElement(month).moveToElement(data).click().build();
	    Action act=builder.doubleClick(ele).build();
	     	
	     	//builder.moveToElement(month).moveToElement(data).build().perform();
	     	
	     
	     	
	     builder.doubleClick(ele).perform();
	     Alert alt=d.switchTo().alert();
	 	    System.out.println(alt.getText());
	 	    alt.accept();
	     	alt.dismiss();
	     	alt.notify();
	     	
	     act.perform();
	}

}
