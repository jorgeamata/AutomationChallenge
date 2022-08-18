package com.agileThought.testCases;

import com.projectName.base.Base;
import com.projectName.pageObjects.HomePage;
import com.projectName.pageObjects.NavigationBar;
import com.projectName.pageObjects.WelcomeModal;
import com.projectName.pageObjects.old.GoogleHomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class Test001 extends Base {

    //Create objects for page objects classes used for this test class
    WelcomeModal welcomeModal;
    HomePage homePage;
    NavigationBar navBar;

    @BeforeMethod
    @Parameters({ "browserName", "url" })
    public void init(String browserName, String url) {
        initializeDriver(browserName, url);
        welcomeModal = new WelcomeModal();
        homePage = new HomePage();
        navBar = new NavigationBar();
        //welcomeModal.btnDismiss.click();


        if(welcomeModal.isDisplayed() == true){
            welcomeModal.btnDismiss.click();
        }

    }

    //@Test
    public void createAccount(){
        System.out.println("URL : " + driver.getCurrentUrl());

        navBar.btnAccount.click();
        navBar.btnLogin.click();
        System.out.println("URL : " + driver.getCurrentUrl());
    }

    @Test
    public void printItemsList(){
        List<WebElement> items = homePage.itemsList;
        for(WebElement item : items){
           System.out.println(item);
        }
    }

    //@Test
    public void getJuiceItems(String keyword){
        boolean isJuiceItem = keyword.contains("juice");

        List<WebElement> items = homePage.itemsList;

        for(WebElement item : items){
            if(isJuiceItem){
                System.out.println(item.getText());
            }
        }


    }

    //@Test
    public void searchForItem(String item){}

    //@Test
    public void getItemReview(String item){}

    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }




}
