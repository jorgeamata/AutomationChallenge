package com.projectName.pages;

import com.projectName.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemplatePage extends Base {

    //Page Objects

    /*
    //button[contains(text(), 'ABC')]
    //button[text() = 'ABC')]
    // - Double slash for any descendant node
    / - Single slash for node which is direct child of current node
     */


    // Constructor

    //Actions

    public void searchForSomething(){

    }

    /* Get the lowest price item and click on it
    List<WebElement> items = driver.findElements(By.xpath("));
    int firstItemPrice = Integer.parseInt(items.get(0).getText());
    WebElement element = null;

    for(WebElement item : items){

        int itemPrice = Integer.parseInt(item.getText().replace("", ""));
        if(itemPrice < firstItemPrice){
            firstItemPrice = itemPrice;
            element = item;
            System.out.println("something");
        }

        element.click();

    }

     */


}
