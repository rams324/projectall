package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Footer {
	WebDriver driver;

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void Home_page() {
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
	public void getdata() {
		
		String foot= driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).getText();
		  String orange= foot.substring(0,9);
		  System.out.println(orange);
		  Assert.assertEquals("OrangeHRM", orange);
		 System.out.println(true);
		    driver.close();
	}
}
