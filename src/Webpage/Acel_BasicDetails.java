package Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Acel_BasicDetails {

	
	public static By first=By.name("user[first_name]");
	public static By last=By.name("user[last_name]");
	public static By cbox1=By.xpath("//div[@data-test-id='introduction-terms-service-input']");
	public static By cbox2=By.xpath("//div[@data-test-id='introduction-marketing-email-consent-input']");
	public static By ncompany=By.name("name");
	public static By cont=By.name("commit");
			
	//Basic details
public static void FillDetails(WebDriver driver,String firstname,String lastname) throws InterruptedException {
	
	driver.findElement(first).sendKeys(firstname);
	driver.findElement(last).sendKeys(lastname);
	 Thread.sleep(2000);
	driver.findElement(cbox1).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(1000);
	driver.findElement(cbox2).click();
	
	driver.findElement(By.name("commit")).click();
	Thread.sleep(3000);
	
}
//addcompany name
public static void Addcompany(WebDriver driver,String companyname) throws InterruptedException {
	
	Thread.sleep(3000);
	driver.findElement(ncompany).sendKeys(companyname);
	driver.findElement(cont).click();
	Thread.sleep(3000);
	
}
}
