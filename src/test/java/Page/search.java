package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class search
{
	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By login=By.id("btnLogin");
	By admin=By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	By user_management=By.id("menu_admin_UserManagement");
	By users=By.id("menu_admin_viewSystemUsers");
	By username1=By.id("searchSystemUser_userName");
	By userrole=By.id("searchSystemUser_userType");
	By employeename=By.xpath("//*[@id=\"searchSystemUser_employeeName_empName\"]");
	By Status=By.id("searchSystemUser_status");
	By search=By.xpath("//*[@id=\"searchBtn\"]");
	
	public void chromelaunching5() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT65\\.eclipse\\Orange\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	}
	public void orangeHRM_homePage5()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
	
			}

	public void login_details5() 
	{
		driver.findElement(username).sendKeys("Admin");
		driver.findElement( password).sendKeys("admin123");	
		driver.findElement(login).click();
	}
	
public void searching()
{
	driver.findElement(admin).click();
	WebElement a=driver.findElement(user_management);
	WebElement b=driver.findElement(users);
	Actions act=new Actions(driver);
	act.moveToElement(a).click().build().perform();
	act.moveToElement(b).click().build().perform();
	driver.findElement(username1).sendKeys("uadfdajg");
	driver.findElement(userrole).click();
	driver.findElement(employeename).sendKeys("uartyrdfdajg");
	driver.findElement(Status).click();
	driver.findElement(search).click();
	
	}
}
