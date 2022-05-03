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
import com.projectName.pageObjects.BingHomePage;
import com.projectName.pageObjects.BingResultsPage;

public class BingSearchTests extends Base {

	//Create objects for page objects classes used for this test class
	
	BingHomePage bingHomePage;
	BingResultsPage bingResultsPage;
	
	//Initialize driver and launch URL before the tests
	
	@BeforeMethod
	@Parameters({ "browserName", "url" })
	public void init(String browserName, String url) {
		initializeDriver(browserName, url);
		bingHomePage = new BingHomePage();
		bingResultsPage = new BingResultsPage();
	}

	//Tests
	
	@Test
	@Parameters({ "keyword" })
	public void validateSearchOnBing(String keyword) {
		System.out.println("Testing Bing search engine...");
		bingHomePage.searchKeyword(keyword.toLowerCase());

		WaitActions.waitForVisibilityOfElement(bingResultsPage.resultsLabel, 10);

		List<WebElement> results = bingResultsPage.getSearchResults();

		for (WebElement element : results) {
			String searchKeyword = element.getText().toLowerCase();
			if (searchKeyword.contains(keyword.toLowerCase())) {
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
