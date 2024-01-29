package org.tMobile.pages.basket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tMobile.pages.withoutSubscription.WithoutSubscriptionPage;
import org.tMobile.utils.DriverFactory;

public class BasketPage {

    private final WebDriver driver;

    WithoutSubscriptionPage withoutSubscriptionPage = new WithoutSubscriptionPage(DriverFactory.getDriver());
    @FindBy(xpath = "//a[@class = 'logoWrap']")
    private WebElement imgLogo;


    public BasketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnLogo() {
        imgLogo.click();

    }

}
