package Webpage;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Acel_TimeTracking {
	public static By TTrack=By.xpath("//a[@data-test-id='header-time-tracking']");
	public static By firstproject=By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/a");
	public static By newpro=By.xpath("//a[@data-test-id='project-add-new']");
	public static By pronm=By.name("projectName");
	public static By billing=By.name("billingMethod");
	public static By HPR=By.name("projectLevelRate");
	public static By submit=By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[4]/button");
	public static By project=By.xpath("//select[@data-test-id='time-entry-project']");
	public static By selecttask=By.xpath("//select[@data-test-id='time-entry-task']");
	public static By hour=By.xpath("//input[@data-test-id='time-entry-hours']");
	public static By text=By.xpath("//textarea[@data-test-id='time-entry-notes']");
	public static By logtime=By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/button[1]");
	
	//for verification
	public static By nproject=By.xpath("//span[@data-test-id='time-entry-project-name-0']");
	public static By nselecttask= By.xpath("//span[@data-test-id='time-entry-task-name-0']");
	public static By nhour=By.xpath("//dic[@data-test-id='time-entry-hours-0']");
	public static By ntext=By.xpath("//div[@data-test-id='time-entry-notes-0']");
	
	
	//click on timetracking
	public static void TimeTracking(WebDriver driver) throws InterruptedException {
		driver.findElement(TTrack).click();
		Thread.sleep(4000);
	}
	
	public static void AddProject(WebDriver driver) throws InterruptedException {
		driver.findElement(firstproject).click();
		Thread.sleep(4000);
		driver.findElement(newpro).click();
		Thread.sleep(2000);
	}
	
	public static void NewProject(WebDriver driver,String projectname) throws InterruptedException {
		driver.findElement(pronm).sendKeys(projectname);
		
		Select drop_down = new Select(driver.findElement(billing));
		drop_down.selectByVisibleText("Hourly project rate"); 
		driver.findElement(HPR).clear();
		driver.findElement(HPR).sendKeys("1500");
		
		
		Thread.sleep(3000);
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		
		 Thread.sleep(1000);
		driver.findElement(submit).click();
		 Thread.sleep(3000);
		}
	//for fill in drop down
	public static void TimeTrack(WebDriver driver,String txt) throws InterruptedException {
		driver.findElement(TTrack).click();
		Thread.sleep(1000);
		
		Select drop_down = new Select(driver.findElement(project));
		drop_down.selectByVisibleText("test web page"); 
		
		Select drop_d = new Select(driver.findElement(selecttask));
		drop_d.selectByVisibleText("Meeting"); 
		
		driver.findElement(hour).sendKeys("2.5");
		driver.findElement(text).sendKeys(txt);
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,250)");
		 Thread.sleep(1000);
		
	   driver.findElement(logtime).click();
	   
	   Thread.sleep(3000);
		
	 JavascriptExecutor jc=(JavascriptExecutor)driver;
	 jc.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 	
	 
	
	
	}
	public static void verifyProjectName(WebDriver driver,String projectName) {
		String verify=driver.findElement(nproject).getText();
		if(verify.equalsIgnoreCase(projectName)) {
			System.out.println("Project name matches:"+verify);
		}
		else {
			System.out.println("Project name doesn't  matches:"+verify);
		}
	}

}
