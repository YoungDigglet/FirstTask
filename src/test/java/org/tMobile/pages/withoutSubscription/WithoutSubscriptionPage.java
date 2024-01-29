package org.tMobile.pages.withoutSubscription;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tMobile.utils.ClickIndexListUtil;
import org.tMobile.utils.GetPrice;

import java.util.List;


public class WithoutSubscriptionPage {
    private final WebDriver driver;
    @FindBy(css = ".isNewUxHeaderEnabled button")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//div[contains(@class, 'isNewUxHeaderEnabled')]//div[contains(@class, 'jUaeUf')]//div[contains(@data-qa, 'PRD_TotalUpfront')]//div[contains(@class, 'dt_price_change')]")
    private WebElement actualStartPriceLabel;

    @FindBy(xpath = "//div[contains(@class, 'isNewUxHeaderEnabled')]//div[contains(@class, 'priceRightSection')]//div[contains(@class, 'dt_price_change')]")
    private WebElement actualRightPriceLabel;

    @FindBy(xpath = "//div[contains(@data-qa, 'BKT_TotalupFrontCurrCOde')]")
    private WebElement totalStartPriceLabel;

    @FindBy(xpath = "//div[contains(@data-qa, 'BKT_TotalMonthlyCurrCOde')]")
    private WebElement totalMonthPriceLabel;

    @FindBy(xpath = "//div[contains(@data-qa, 'LST_ProductCard')]")
    private List<WebElement> productList;

    public WithoutSubscriptionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnFirstElement() {
        ClickIndexListUtil.indexOnList(productList, 0);
    }

    public void setAddToBasket() {
        addToBasketButton.click();

    }

    public void getCompareObjectVariable() {
        GetPrice.setPriceBetweenView("ActualPrice", actualStartPriceLabel.getText());
        GetPrice.setPriceBetweenView("ActualMonthPrice", actualRightPriceLabel.getText());
    }

    public void compareObjectVariable() {
        Assert.assertEquals(totalStartPriceLabel.getText(), GetPrice.getPriceBetweenView("ActualPrice"));
        Assert.assertEquals(totalMonthPriceLabel.getText(), GetPrice.getPriceBetweenView("ActualMonthPrice"));
    }

}
