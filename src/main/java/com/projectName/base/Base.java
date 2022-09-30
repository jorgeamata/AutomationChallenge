package com.projectName.base;

import com.projectName.pages.TemplatePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	//declare page instances
		//public static TemplatePage templatePage;


	private void initDriverSession(String browserName, String url) {
		switch(browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Running browser on: " + browserName);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Running browser on: " + browserName);
			break;
		default:
			System.out.println("Browser " + browserName + " is not supported");
			break;
		}
	}

	@BeforeMethod
	@Parameters({ "browserName", "url" })
	public void initApplication(String browserName, String url) {
		this.initDriverSession(browserName, url);

		WebDriverSteps.navigateToApplication(url);

		//Pages instantiation
			//templatePage = new TemplatePage();



	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
	
	

}
