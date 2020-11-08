package test;

import org.openqa.selenium.By;
import static Webpage.Acel_BasicDetails.*;
import static Webpage.Singup_p.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static Webpage.AddFirstClient.*;
import static Webpage.Acel_TimeTracking.*;


public class Main {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String email="nikks@example.com";
		String password="nikee234";
		String firstname="nikee";
		String lastname="nandu";
		String companyname="wipro";
		String clientname="shagun";
		String secondname="mehta";
		String address1="shyam nagr";
		String address2="ambedkar chowk";
		String city="chandrapur";
		String state="maharashtra";
		String country="IND";
		String zipcode="442401";
		String projectname="test web page";
		String txt="Thank you ";
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumS\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://qa.aceinvoice.com/sign_in");
		 Thread.sleep(3000);
		 
		 WebElement Element=driver.findElement(By.cssSelector(".signup-button > strong"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,250)");
		 Thread.sleep(2000);
		 Element.click();
		 Thread.sleep(3000);
		 
		 
		 signup(driver,email,password);
		 FillDetails(driver,firstname,lastname);
		 Addcompany(driver,companyname);
		 FirstClientDetails(driver,clientname,secondname,address1,address2,city,state,country,zipcode,email);
		 TimeTracking(driver);
		 AddProject(driver);
		 NewProject(driver,projectname);
		 TimeTrack(driver,txt);
		 
		 
		 
		

	}

}
