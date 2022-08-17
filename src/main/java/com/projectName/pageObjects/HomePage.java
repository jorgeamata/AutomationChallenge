package com.projectName.pageObjects;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    //Page Objects Factory
    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@role='button' and @type='submit']")
    public WebElement searchButton;


    // Constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void searchKeyword(String keyword) {
        searchBox.sendKeys(keyword);
        searchButton.submit();
    }




}
