package com.projectName.pageObjects;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeModal extends Base {

    //Page Objects Factory

    @FindBy(xpath = "//div[@id='cdk-overlay-2']")
    public WebElement modal;
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[contains(text(), 'Dismiss')]")
    public WebElement btnDismiss;

    //Constructor
    public WelcomeModal() {
        PageFactory.initElements(driver, this);
    }

    //Actions
    public boolean isDisplayed(){
        return this.modal.isDisplayed();
    }

}

