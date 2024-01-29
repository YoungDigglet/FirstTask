package org.tMobile.utils;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickIndexListUtil {

    public static void clikcElement(WebElement webElement) {
        webElement.click();

    }

    public static void indexOnList(List<WebElement> webElements, int index) {
        clikcElement(webElements.get(index));

    }


}
