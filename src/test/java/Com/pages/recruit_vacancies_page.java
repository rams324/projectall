package Com.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class recruit_vacancies_page 
{
	WebDriver driver;
	By Username = By.name("txtUsername");
	By Password = By.name("txtPassword");
	By Submit = By.name("Submit");  
	By Recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
	By Vacancies = By.xpath("//*[@id=\"menu_recruitment_viewJobVacancy\"]");
	By jobtitle = By.name("vacancySearch[jobTitle]");
	By vacantpositions = By.name("vacancySearch[jobVacancy]");
	By hiringmanager = By.name("vacancySearch[hiringManager]");
	By status = By.name("vacancySearch[status]");
	By search = By.xpath("//*[@id=\"btnSrch\"]");


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

public void Search_item() throws InterruptedException
{
	driver.findElement(Recruitment).click();
	driver.findElement(Vacancies).click();
	driver.findElement(jobtitle).click();
	driver.findElement(vacantpositions).click();
	driver.findElement(hiringmanager).click();
	driver.findElement(status).click();
	driver.findElement(search).click();
	driver.close();
	

}

	
}
	

