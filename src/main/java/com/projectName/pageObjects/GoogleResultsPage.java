package com.projectName.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class GoogleResultsPage extends Base {

	// Page Objects Factory
	@FindBy(id = "result-stats")
	public WebElement resultsLabel;
	
	@FindAll(@FindBy(xpath = "//div[@class='eKjLze']//h3 | //div[@class='jtfYYd']//h3"))
	public List<WebElement> results;

	// Constructor
	public GoogleResultsPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	//Results only for visible elements
	public List<WebElement> getSearchResults(){
		return results;
	}
	
	public String getResultsLabel() {
		return resultsLabel.getText();
	}
	
	
	
	

}
