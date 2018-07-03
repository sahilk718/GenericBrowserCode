package autoitPoc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;


public class AutoitCheck {
	
	public void authenticateCheck(WebDriver driver) throws InterruptedException, IOException{
		
		Runtime.getRuntime().exec("C:\\AutoIt_Script.exe");
	driver.get("https://www.engprod-charter.net/");
	
	//Thread.sleep(5000);
	driver.quit();

	
}
}