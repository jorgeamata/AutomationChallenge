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
import com.projectName.pageObjects.old.BingHomePage;
import com.projectName.pageObjects.old.BingResultsPage;
import com.projectName.pageObjects.old.GoogleHomePage;
import com.projectName.pageObjects.old.GoogleResultsPage;

public class GoogleSearchTests extends Base {

	//Create objects for page objects classes used for this test class
	
	GoogleHomePage googleHomePage;
	GoogleResultsPage googleResultsPage;
	BingHomePage bingHomePage;
	BingResultsPage bingResultsPage;
	
	//Initialize driver and launch URL before the tests
	
	@BeforeMethod
	@Parameters({ "browserName", "url" })
	public void init(String browserName, String url) {
		initializeDriver(browserName, url);
		googleHomePage = new GoogleHomePage();
		googleResultsPage = new GoogleResultsPage();
		bingHomePage = new BingHomePage();
		bingResultsPage = new BingResultsPage();
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
	
	
	//@Test
    @Parameters({ "keyword" })
    public void comparePopularResults(String keyword){
        System.out.println("Testing both search engines and compare popular results......");

        //Get google results    
        googleHomePage.searchKeyword(keyword.toLowerCase());
        WaitActions.waitForVisibilityOfElement(googleResultsPage.resultsLabel, 10);
        List<WebElement> googleResults = googleResultsPage.getSearchResults();

        //get bing results
        driver.navigate().to("https://www.bing.com/");
        System.out.println("Testing Bing search engine...");
        bingHomePage.searchKeyword(keyword.toLowerCase());

        WaitActions.waitForVisibilityOfElement(bingResultsPage.resultsLabel, 10);
        List<WebElement> bingResults = bingResultsPage.getSearchResults();

        //List<WebElement> matchingElements = googleResults.stream()
		// .filter(element -> bingResults.contains(element))
		//.collect(Collectors.toList());
        
        //System.out.println(matchingElements);
        

    }
	
	//Closing driver session and browser
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
