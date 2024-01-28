package org.tMobile.pages.withoutSubscription;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tMobile.utils.ClickIndexListUtil;

import java.util.List;

@Slf4j
public class WithoutSubscriptionPage {
    private final WebDriver driver;

    @FindBy(css = ".isNewUxHeaderEnabled button")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//a[@class = 'logoWrap']")
    private WebElement imgLogo;

    @FindBy(xpath = "//div[contains(@data-qa, 'LST_ProductCard')]")
    private List<WebElement> productList;

    public WithoutSubscriptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnFirstElement() {
        ClickIndexListUtil.indexOnList(productList, 0);
        log.info("Clicked on first element on list");
    }

    public void setAddToBasket() {
        addToBasketButton.click();
        log.info("Device was added to basket");
    }

    public void clickOnLogo() {
        imgLogo.click();
        log.info("Click to return to HomePage");
    }
}
