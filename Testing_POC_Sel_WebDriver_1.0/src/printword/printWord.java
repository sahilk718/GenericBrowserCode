package printword;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class printWord {

	public static void kronosAttend(WebDriver driver) throws InterruptedException{
		
	
	driver.get("http://myencore.internal.mcmcg.com/");
	driver.get("http://igisqlp03.internal.mcmcg.com/wfc/navigator/logon");
	Thread.sleep(5000);
	driver.findElement(By.id("username")).sendKeys("skapoor1");
	driver.findElement(By.id("passInput")).sendKeys("");
	driver.findElement(By.id("loginSubmit")).click();
	

}
}