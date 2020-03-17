package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DashBorad {
	


	WebDriver driver;
	public DashBorad(WebDriver driver) {
		this.driver=driver;
		
	}
	 public void launch() {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		 
		 
	 }
	 public void  Home_page() {
	   		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	     }
	 public void loginData() throws InterruptedException, IOException  {
		  
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		Thread.sleep(3000);
		
	 }
	 public void submit() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
	}
	
		
	public void Dashboard_Screenshot(String path) throws IOException, InterruptedException  {
		Thread.sleep(5000);
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source ,new File(path));
	Thread.sleep(5000);
	}

}
