package org.tMobile.pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private final WebDriver driver;


    @FindBy(id = "didomi-notice-agree-button")
    private WebElement agreeCookiesButton;

    @FindBy(xpath = "//button[contains(text(),'Urządzenia')]")
    private WebElement deviceButton;

    @FindBy(xpath = "//p[contains(text(), 'Smartwatche i opaski')]/..//a[contains(.,'Bez abonamentu')]")
    private WebElement withoutSubscriptionButton;

    @FindBy(xpath = "//a[contains(@data-ma, 'menu-basket')]/div[contains(@class, 'rounded-full')]")
    private WebElement menuBaskedButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickAgreeButton() {
        agreeCookiesButton.click();

    }

    public void clickDeviceButton() {
        deviceButton.click();
    }

    public void clickOnSpan() {
        withoutSubscriptionButton.click();
    }

    public void checkOnBasketMenu() {
        Assert.assertTrue(menuBaskedButton.isEnabled());
    }

}
