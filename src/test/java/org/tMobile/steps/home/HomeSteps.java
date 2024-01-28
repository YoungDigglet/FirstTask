package org.tMobile.steps.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.tMobile.pages.HomePage;
import org.tMobile.pages.withoutSubscription.WithoutSubscriptionPage;
import org.tMobile.utils.DriverFactory;

public class HomeSteps {

    private final HomePage homePage = new HomePage(DriverFactory.getDriver());
    private final WithoutSubscriptionPage withoutSubscriptionPage = new WithoutSubscriptionPage(DriverFactory.getDriver());

    @Given("User open homepage")
    public void userOpenHomepage() {
        homePage.clickAgreeButton();
    }

    @And("User will be redirect to home page")
    public void userWillBeRedirectToHomePage() {
        withoutSubscriptionPage.clickOnLogo();
    }

    @And("User click on Device button")
    public void userClickOnDeviceButton() {
        homePage.clickDeviceButton();
    }

    @And("User click on without subscription label")
    public void userClickOnWithoutsubscriptionLabel() {
        homePage.clickOnSpan();
    }
}
