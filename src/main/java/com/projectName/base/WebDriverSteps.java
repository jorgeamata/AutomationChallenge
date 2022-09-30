package com.projectName.base;

import org.openqa.selenium.WindowType;

public class WebDriverSteps extends Base{

    public static void navigateToApplication(String url){
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static void switchToFrame() {}

    public static void navigateBack() {}

    public static void navigateForward() {}

    public static void switchToSecondTab() {}

    public static void switchToFirstTab() {}

    public static void switchToIframe() {}

    public static void switchBackToIframe() {}

    public static void switchToNewWindow() {
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public static void switchToNewTab(){
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public static void switchBackFromNewWindow() {}




}
