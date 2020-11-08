package Webpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Singup_p {
	
	public static By mail=By.name("email");
	public static By getstatrted=By.name("get_started");
	public static By pass=By.name("password");
    public static By cont=By.name("continue");		
	
	public static void signup(WebDriver driver,String email,String password) throws InterruptedException
	{
		driver.findElement(mail).sendKeys(email);
		 driver.findElement(getstatrted).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(pass).sendKeys(password);
		 driver.findElement(cont).click();
		 Thread.sleep(3000);
		 
		 
		
	  }
	}


	


