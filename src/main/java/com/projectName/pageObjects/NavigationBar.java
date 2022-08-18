package com.projectName.pageObjects;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends Base {

    //Page Objects Factory

    @FindBy(xpath="//span[@class='mat-search_icons ng-tns-c254-1']")
    public WebElement searchIcon;

    @FindBy(xpath="//input[@id='mat-input-0']")
    public WebElement searchTextField;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[contains(text(), 'Account')]")
    public WebElement btnAccount;

    @FindBy(xpath="//div[@class='mat-menu-content ng-tns-c248-2']//button")
    public WebElement btnLogin;

    // Constructor
    public NavigationBar() {
        PageFactory.initElements(driver, this);
    }

    // Actions

}
