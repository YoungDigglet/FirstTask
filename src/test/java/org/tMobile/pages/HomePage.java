package org.tMobile.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class HomePage {

    private final WebDriver driver;


    @FindBy(id = "didomi-notice-agree-button")
    private WebElement agreeCookiesButton;

    @FindBy(xpath = "//button[contains(text(),'Urządzenia')]")
    private WebElement deviceButton;

    @FindBy(xpath = "//p[contains(text(), 'Smartwatche i opaski')]/..//a[contains(.,'Bez abonamentu')]")
    private WebElement withoutSubscriptionButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickAgreeButton() {
        agreeCookiesButton.click();
        log.info("Cookies was agreed");
    }

    public void clickDeviceButton() {
        deviceButton.click();
        log.info("Device button was clicked");
    }

    public void clickOnSpan() {
        withoutSubscriptionButton.click();
        log.info("Without subscription was clicked");
    }
}
