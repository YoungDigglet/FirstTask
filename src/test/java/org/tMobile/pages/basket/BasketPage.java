package org.tMobile.pages.basket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasketPage {

    private final WebDriver driver;
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
