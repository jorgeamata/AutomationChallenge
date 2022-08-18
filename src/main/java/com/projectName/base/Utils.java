package com.projectName.base;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils extends Base {

	//Waits
	public static void setImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static void waitForAlert(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForVisibilityOfElement(WebElement element, int seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}
