package com.agileThought.testCases;

import com.projectName.base.Base;
import com.projectName.pageObjects.old.GoogleHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test001 extends Base {

    //Create objects for page objects classes used for this test class

    GoogleHomePage googleHomePage;

    @BeforeMethod
    @Parameters({ "browserName", "url" })
    public void init(String browserName, String url) {
        initializeDriver(browserName, url);
        googleHomePage = new GoogleHomePage();
    }

    @Test
    public void loginSuccessful(){
        System.out.println("Login successful is open ...");
    }

    @Test
    public void searchForItem(){
        System.out.println("Search for an item ...");
    }

    @Test
    public void getHeroOptions(){
        System.out.println("hero options ...");
    }

    @Test
    public void addItem(){
        System.out.println("adding item ...");
    }

    @AfterMethod
    public static void tearDown() {
        driver.quit();
    }




}
