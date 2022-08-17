package com.projectName.pageObjects.old;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class BingResultsPage extends Base {

	//Page Objects Factory
		@FindBy(xpath = "//span[@class='sb_count']")
		public WebElement resultsLabel;

		@FindAll(@FindBy(xpath = "//ol[@id='b_results']//li[@class='b_algo']//h2"))
		public List<WebElement> results;


		// Constructor
		public BingResultsPage() {
			PageFactory.initElements(driver, this);
		}

		// Actions
		public List<WebElement> getSearchResults(){
			return results;
		}
		
		public String getResultsLabel() {
			return resultsLabel.getText();
		}
		
		
}
