package com.projectName.pageObjects.old;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class GoogleHomePage extends Base {

	//Page Objects Factory
	@FindBy(name = "q")
	public WebElement searchBox;

	@FindBy(xpath = "//input[@role='button' and @type='submit']")
	public WebElement searchButton;


	// Constructor
	public GoogleHomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void searchKeyword(String keyword) {
		searchBox.sendKeys(keyword);
		searchButton.submit();
	}

}
