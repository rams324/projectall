package Page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class about
{
	WebDriver driver;
	
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By login=By.id("btnLogin");
	By welcome_admin=By.id("welcome");
	By about=By.id("aboutDisplayLink");
	
	
	public void login_page() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println(driver.getTitle());
	}
//	public void orangeHRM()
//	{
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		System.out.println(driver.getTitle());
//
//	}
	public void login_details4() 
	{
		driver.findElement(username).sendKeys("Admin");
		driver.findElement( password).sendKeys("admin123");	
		driver.findElement(login).click();
	}

	public void about_HRM() 
	{

		driver.findElement(welcome_admin).click();
		driver.findElement(about).click();
		}
	
	public void screenshot(String fileWithPath) throws IOException 
	{
		TakesScreenshot ts =(( TakesScreenshot)driver); 
		File teja1=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(teja1,new File(fileWithPath));
					
		
	}
	
}
