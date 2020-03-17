package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Logout {
	WebDriver driver;
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void Home_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void loginData()  {
	
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
	}
		public void submit() {
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
	}
		public void LogOut() {
			
			WebElement a=driver.findElement(By.xpath("//*[text()='Welcome Admin']"));
			Actions act=new Actions(driver);
			act.moveToElement(a).click().perform();
			WebElement b=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
			Actions act1=new Actions(driver);
			
			act1.moveToElement(b).click().perform();
			
			
		}

}
