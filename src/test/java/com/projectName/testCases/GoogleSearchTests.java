package com.projectName.testCases;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.projectName.base.Base;
import com.projectName.base.WaitActions;
import com.projectName.pageObjects.GoogleHomePage;
import com.projectName.pageObjects.GoogleResultsPage;
import org.testng.asserts.SoftAssert;

public class GoogleSearchTests extends Base {

	//Create objects for page objects classes used for this test class
	
	GoogleHomePage googleHomePage;
	GoogleResultsPage googleResultsPage;
	
	//Initialize driver and launch URL before the tests
	
	@BeforeMethod
	@Parameters({ "browserName", "url" })
	public void init(String browserName, String url) {
		initializeDriver(browserName, url);
		googleHomePage = new GoogleHomePage();
		googleResultsPage = new GoogleResultsPage();
	}

	//Tests
	
	@Test
	@Parameters({ "keyword" })
	public void validateSearchOnGoogle(String keyword) {
		System.out.println("Testing Google search engine......");
		googleHomePage.searchKeyword(keyword.toLowerCase());
		
		WaitActions.waitForVisibilityOfElement(googleResultsPage.resultsLabel, 10);
		
		
		List<WebElement> results = googleResultsPage.getSearchResults();
		
		for (WebElement element : results) {
			String searchKeyword = element.getText().toLowerCase();
			
			if(searchKeyword.contains(keyword.toLowerCase())) {
				System.out.println("Printing matching value: " + element.getText());
				Assert.assertTrue(true);
			} else {
				System.out.println("Printing non mathing value: " + element.getText());
				Assert.assertTrue(false);
			}
			
		}
		
	}
	
	
	//Closing driver session and browser
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
