package com.projectName.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns extends Base {

    public static void selectByVisibleText(WebElement dropdownElement, String optionVisibleText) {
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(optionVisibleText);
    }

    public static void selectByIndex(WebElement dropdownElement, int index) {
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    public static List<WebElement> getDropdownOptions(WebElement dropdownElement) {
        Select dropdown = new Select(dropdownElement);
        List<WebElement> dropdownOptions = dropdown.getOptions();

        return dropdownOptions;
    }

    public static void deselectAllOptions(WebElement dropdownElement) {
        Select dropdown = new Select(dropdownElement);
        dropdown.deselectAll();
    }

}
