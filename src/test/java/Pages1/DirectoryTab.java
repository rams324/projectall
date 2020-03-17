package Pages1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelUtility.ValidExcelUtility;

public class DirectoryTab {
	protected WebDriver driverObj;
	ValidExcelUtility obj = new ValidExcelUtility();
	By driverTab = By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b");
	By verifyText = By.xpath("//*[@id=\"content\"]/div[1]/a");
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverObj = new ChromeDriver();
		driverObj.manage().window().maximize();
		driverObj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverObj.get("www.google.com");
	}

	public void homePage(String url) {
		driverObj.get(url);
	}

	public void login() throws IOException {
		obj.excel_username(1);
		obj.excel_password(2);
	}
	public void DriverTab() {
		driverObj.findElement(driverTab).click();	 
			
	}

	public boolean verify() {
		return driverObj.findElement(verifyText).isDisplayed();
	}
	public void close() {
		driverObj.quit();
	}
}
