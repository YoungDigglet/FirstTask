package org.tMobile.steps.withoutSubscription;

import io.cucumber.java.en.Then;
import org.tMobile.pages.withoutSubscription.WithoutSubscriptionPage;
import org.tMobile.utils.DriverFactory;


public class WithoutSubscriptionSteps {

    WithoutSubscriptionPage withoutSubscriptionPage = new WithoutSubscriptionPage(DriverFactory.getDriver());

    @Then("User choose first item from smartwatches list")
    public void userChooseFirstItemFromSmartwatchesList() {
        withoutSubscriptionPage.clickOnFirstElement();
        withoutSubscriptionPage.setAddToBasket();

    }
}
