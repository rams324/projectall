package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class delete_details 
{
	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By login=By.id("btnLogin");
	By admin=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	By user_management=By.id("menu_admin_UserManagement");
	By users=By.id("menu_admin_viewSystemUsers");
	By usercheckbox=By.xpath("ohrmList_chkSelectRecord_3");
	By delete=By.id("btnDelete");
	
	public void chromelaunching3() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	}
	public void orangeHRM_homePage3()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
	}
		public void login_details3() 
		{
			driver.findElement(username).sendKeys("Admin");
			driver.findElement( password).sendKeys("admin123");	
			driver.findElement(login).click();
		}
	
		public void delete_requirements() 
		{
			driver.findElement(admin).click();
			WebElement a=driver.findElement(user_management);
			WebElement b=driver.findElement(users);
			Actions act=new Actions(driver);
			act.moveToElement(a).click().build().perform();
			act.moveToElement(b).click().build().perform();
			WebElement a1 =driver.findElement(usercheckbox);
			a1.click();
			//driver.findElement(usercheckbox).click();
			driver.findElement(delete).click();
	
		}
	
}
