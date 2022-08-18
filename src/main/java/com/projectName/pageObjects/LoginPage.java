package com.projectName.pageObjects;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    //Page Objects Factory

    /*
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[contains(text(), 'Account')]")
    public WebElement btnAccount;
    */


    // Constructor
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions


}
