package Com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Excel_Utility.Excel_Utility;

public class OrangeHRM_Login_pages {
	WebDriver driver;
	   By Username = By.name("txtUsername");
	   By Password = By.name("txtPassword");
	   By Submit = By.name("Submit");
	   
	   public OrangeHRM_Login_pages(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	   public void ChromeLaunch() {
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
	 }
	   public void OrangeHRM_Homepage()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			System.out.println(driver.getTitle());
		}
	   
	   public void LoginDetails(int a)  throws IOException 
	   {
		   Excel_Utility page = new Excel_Utility();
		   driver.findElement(Username).sendKeys(page.excel_username(a));
		   driver.findElement(Password).sendKeys(page.excel_password(a)); 
	   }
	   
	   public void submit() throws InterruptedException
		{
			driver.findElement(Submit).click();
			driver.close();
			
		}  
	  }


