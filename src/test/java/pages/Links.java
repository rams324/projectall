package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Links {
	WebDriver driver;

	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void log_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void loginData() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
	}
	public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
	public void click() {
		driver.findElement(By.xpath("//img[contains(@src,'ApplyLeave')]")).click();
		String leave=driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).getText();
		String leavetext= leave.substring(0,5);
		  System.out.println(leavetext);
		  Assert.assertEquals("Leave", leavetext);
		 System.out.println(true);
		    driver.close();

	}

}
