package org.tMobile.utils;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;


import java.util.List;
@Slf4j
public class ClickIndexListUtil {

    public static void clikcElement(WebElement webElement){
        webElement.click();
        log.info("Element was clicked");
    }

    public static void indexOnList(List<WebElement> webElements, int index){
        clikcElement(webElements.get(index));
        log.info("Element was indexed");
    }


}
