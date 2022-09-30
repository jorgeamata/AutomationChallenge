package com.projectName.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions extends Base {

    public void mouseOver(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element);
    }

    public void dragAndDrop(WebElement sourceElementLocation, WebElement targetElementLocation) {
        Actions action = new Actions(driver);
        action.dragAndDrop(sourceElementLocation, targetElementLocation);
    }

    public void dragAndDropBy(WebElement element, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, x, y);
    }

    public void scrollDownUntilElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView", element);
    }

    public void scrollDownAtTheBottomOfThePage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

}
