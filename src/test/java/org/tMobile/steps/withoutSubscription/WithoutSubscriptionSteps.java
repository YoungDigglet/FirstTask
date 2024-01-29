package org.tMobile.steps.withoutSubscription;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.tMobile.pages.withoutSubscription.WithoutSubscriptionPage;
import org.tMobile.utils.DriverFactory;
import org.tMobile.utils.LoggerUtil;


public class WithoutSubscriptionSteps {

    WithoutSubscriptionPage withoutSubscriptionPage = new WithoutSubscriptionPage(DriverFactory.getDriver());


    @Given("User add product to basket")
    public void userAddProductToBasket() {
        withoutSubscriptionPage.setAddToBasket();
        LoggerUtil.logger.info("The user added the product to the basket");
        withoutSubscriptionPage.compareObjectVariable();
        LoggerUtil.logger.info("The user compared prices");

    }

    @Then("User choose first item from smartwatches list")
    public void userChooseFirstItemFromSmartwatchesList() {
        withoutSubscriptionPage.clickOnFirstElement();
        LoggerUtil.logger.info("The user clicked on the first item in the list");
        withoutSubscriptionPage.getCompareObjectVariable();
        LoggerUtil.logger.info("The user compared product prices");
    }
}
