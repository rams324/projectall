package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class recruit_reset_pages 
{
	WebDriver driver;
	By Username = By.name("txtUsername");
	By Password = By.name("txtPassword");
	By Submit = By.name("Submit");  
	By Recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
	By candidate = By.id("menu_recruitment_viewCandidates");
	By Jobtitle = By.name("candidateSearch[jobTitle]");
	By Vacancy = By.name("candidateSearch[jobVacancy]");
	By Hiringmanager = By.name("candidateSearch[hiringManager]");
	By Status = By.name("candidateSearch[status]");
	By CandidateName = By.name("candidateSearch[candidateName]");
	By Keywords = By.name("candidateSearch[keywords]");
	By From = By.name("candidateSearch[dateApplication][from]");
	By From_calendar = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
	By To = By.name("candidateSearch[dateApplication][to]");
	By To_calendar = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a");
	By Methodofapplication = By.name("candidateSearch[modeOfApplication]");
	By Reset = By.xpath("//*[@id=\"btnRst\"]");
	
	public void ChromeLaunch() {
		   System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   driver.get("https://google.com");
		   System.out.println(driver.getTitle());
	 }
	
	 public void OrangeHRM_Homepage() 
		{
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			System.out.println(driver.getTitle());
		}
	 
	 public void LoginDetails()
	   {
		   driver.findElement(Username).sendKeys("Admin");
		   driver.findElement(Password).sendKeys("admin123");
	   }
	 
	 public void submit() throws InterruptedException
		{
			driver.findElement(Submit).click();
			
		}  
	
	public void Reset_item() throws InterruptedException
	{
		driver.findElement(Recruitment).click();
		WebElement a = driver.findElement(candidate);
		Actions act = new Actions(driver);
		act.moveToElement(a).click().build().perform();
		driver.findElement(Jobtitle).click();
		driver.findElement(Vacancy).click();
		driver.findElement(Hiringmanager).click();
		driver.findElement(Status).click();
		driver.findElement(CandidateName).sendKeys("Rajya Lakshmi");
		driver.findElement(Keywords).sendKeys("abc");
		driver.findElement(From).click();
		driver.findElement(From_calendar).click();
		driver.findElement(To).click();
		driver.findElement(To_calendar).click();
		driver.findElement(Methodofapplication).click();
		driver.findElement(Reset).click();
		
		driver.close();
		
		
		

	}
}


