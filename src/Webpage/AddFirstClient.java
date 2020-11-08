package Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddFirstClient {
	
	public static By cname=By.name("client[name]");
	public static By csecondname=By.name("client[secondary_name]");
	public static By add1=By.name("client[address_attributes][address_line_1]");
	public static By add2=By.name("client[address_attributes][address_line_2]");
	public static By cty=By.name("client[address_attributes][city]");
	public static By ste=By.name("client[address_attributes][state]");
	public static By cntry=By.name("client[address_attributes][country]");
	public static By zcode=By.name("client[address_attributes][zip_code]");
	public static By duedate=By.name("client[default_invoice_due_in_days]");
	public static By ready=By.name("commit");
	public static By go=By.xpath("//button[@data-test-id='onboarding-continue']");
	public static By clt=By.xpath("//a[@data-test-id='header-clients']");
	public static By clickname=By.xpath("//a[@data-test-id='client-1-link']");
	public static By nemail=By.xpath("//*[@id=\"team-members\"]/tbody/tr/td[3]");
	
	//first client details
	
	public static void FirstClientDetails(WebDriver driver,String clientname,String secondname,String address1,String address2,String city,
			String state,String country,String zipcode,String email) throws InterruptedException {
		
		driver.findElement(cname).sendKeys(clientname);
		driver.findElement(csecondname).sendKeys(secondname);
		driver.findElement(add1).sendKeys(address1);
		driver.findElement(add2).sendKeys(address2);
		driver.findElement(cty).sendKeys(city);
		driver.findElement(ste).sendKeys(state);
		driver.findElement(cntry).sendKeys(country);
		driver.findElement(zcode).sendKeys(zipcode);
		
		Select drop_down = new Select(driver.findElement(duedate));
		drop_down.selectByVisibleText("+5 days");  
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(ready).click();
		
		//congratulation page
		Thread.sleep(3000);
		 driver.findElement(go).click();
		 //verify details
		 Thread.sleep(3000);
		 String newemail= driver.findElement(nemail).getText();
		 verifymail(newemail,email);
		
		 Thread.sleep(3000);
		 //click on client
		 driver.findElement(clt).click();
		 Thread.sleep(3000);
		 //click on name
		 driver.findElement(clickname).click();
		 Thread.sleep(3000);
		 
		
	}
	
	public static void verifymail(String nemail,String email) {
		if(nemail.equalsIgnoreCase(email)) {
			System.out.print("Test Passed");
		}else {
			System.out.print("Test failed");
		}
	}



		
	
	}


