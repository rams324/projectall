package Page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.excelutility.Excel;

public class Login_page 
{
		WebDriver driver;
		By username=By.id("txtUsername");
		By password=By.id("txtPassword");
		By login=By.id("btnLogin");

		public void chromelaunching1() 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		}
		public void orangeHRM_homePage1()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/");
			System.out.println(driver.getTitle());
		
				}
//		public void usernamepassword(int a) throws IOException, InterruptedException
//		{
//			Excel ex=new Excel();
//			driver.findElement(By.id("txtUsername")).sendKeys(ex.excel_username(a));
//			driver.findElement(By.id("txtPassword")).sendKeys(ex.excel_username(a));
//			driver.findElement(By.id("btnLogin")).click();
//			}
	
		public void enter_details() 
		{
			driver.findElement(username).sendKeys("Admin");
			driver.findElement( password).sendKeys("admin123");	
			driver.findElement(login).click();
		}
}
