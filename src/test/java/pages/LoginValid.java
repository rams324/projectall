package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelUtility.ExcelLoginData;

public class LoginValid {
	
	
	WebDriver driver;
	public void ChromeLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void OpenOrangeHrm() {
	   		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	     }
	  public void loginData(int a) throws InterruptedException, IOException {
		  ExcelLoginData ex=new ExcelLoginData();
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys(ex.Username(a));
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys(ex.Password(a));
	  }
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}

}
