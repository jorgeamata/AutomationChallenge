package com.projectName.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.projectName.base.Base;

public class BingHomePage extends Base {

	//Page Objects Factory
		@FindBy(name = "q")
		public WebElement searchBox;

		@FindBy(xpath = "//input[@type='submit']")
		public WebElement searchButton;


		// Constructor
		public BingHomePage() {
			PageFactory.initElements(driver, this);
		}

		// Actions
		public void searchKeyword(String keyword) {
			searchBox.sendKeys(keyword);
			searchButton.submit();
		}
}
