package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class recruit_vacancies_add_pages 
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
	By add_candidate1 = By.xpath("//*[@id=\"btnAdd\"]");
	By Jobtitle  = By.xpath("//*[@id=\"addJobVacancy_jobTitle\"]");
	By VacancyName = By.xpath("//*[@id=\"addJobVacancy_name\"]");
	By HiringManager = By.xpath("//*[@id=\"addJobVacancy_hiringManager\"]");
	By Number_of_positions = By.xpath("//*[@id=\"addJobVacancy_noOfPositions\"]");
	By Description  = By.xpath("//*[@id=\"addJobVacancy_description\"]");
	By active = By.xpath("//*[@id=\"addJobVacancy_status\"]");
	By save = By.xpath("//*[@id=\"btnSave\"]");
	


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
}
	public void add_candidate()
	{
		driver.findElement(add_candidate1).click();
		driver.findElement(Jobtitle).click();
		driver.findElement(VacancyName).sendKeys("chandra");
		driver.findElement(HiringManager).sendKeys("david");
		driver.findElement(Number_of_positions).sendKeys("10");
		driver.findElement(Description).sendKeys("All candidates should reported within time");
		driver.findElement(active).click();
		driver.findElement(save).click();
		driver.close();
	}
	
	
}
