package com.projectName.base;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions extends Base {

    //Assertions
    public static boolean isDisplayed(WebElement element){
        try{
            element.isDisplayed();
            System.out.println("PASSED-Element is displayed - " + element.getText());
            return true;
        } catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("FAILED-Element is not displayed - " + element.getText());
            return false;
        }
    }

    public static boolean verifyAssert(String actual, String expected){
        try{
            Assert.assertTrue(actual.contains(expected));
            System.out.println("PASSED-actual and expected matches - " + actual + " / " + expected);
            return true;
        } catch(AssertionError e){
            System.out.println("FAILED-actual/expected mismatch: " + actual + " / " + expected);
            return false;
        }
    }


}
