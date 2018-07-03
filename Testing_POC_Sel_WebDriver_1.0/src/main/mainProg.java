package main;
import org.openqa.selenium.WebDriver;

import autoitPoc.AutoitCheck;
import openBrowser.openChromebrowser;
import printword.printWord;

public class mainProg {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = openChromebrowser.createWebDriverInstance("CHROME");

		printWord.kronosAttend(driver);
		AutoitCheck a = new AutoitCheck();
		a.authenticateCheck(driver);
		driver.quit();
						
	

		

		

	}
}
