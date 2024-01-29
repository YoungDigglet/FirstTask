package org.tMobile.steps.basket;

import io.cucumber.java.en.And;
import org.tMobile.pages.HomePage;
import org.tMobile.pages.basket.BasketPage;
import org.tMobile.utils.DriverFactory;
import org.tMobile.utils.LoggerToFile;

public class BasketSteps {

    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @And("User will be redirect to home page")
    public void userWillBeRedirectToHomePage() {
        basketPage.clickOnLogo();
        LoggerToFile.logger.info("The user has been redirected to the home page");
        homePage.checkOnBasketMenu();
        LoggerToFile.logger.info("Menu basked was checked");
    }
}
