package org.tMobile.steps.home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.tMobile.pages.HomePage;
import org.tMobile.utils.DriverFactory;
import org.tMobile.utils.LoggerToFile;

public class HomeSteps {

    private final HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("User open homepage")
    public void userOpenHomepage() {
        String title = DriverFactory.getDriver().getCurrentUrl();
        Assert.assertEquals(title, "https://www.t-mobile.pl/");
        LoggerToFile.logger.info("Open T-Mobile Page");
        homePage.clickAgreeButton();
        LoggerToFile.logger.info("Cookies agree button was clicked");
    }


    @And("User click on Device button")
    public void userClickOnDeviceButton() {
        homePage.clickDeviceButton();
        LoggerToFile.logger.info("Devices button was clicked");
    }

    @And("User click on without subscription label")
    public void userClickOnWithoutsubscriptionLabel() {
        homePage.clickOnSpan();
        LoggerToFile.logger.info("Smartwaches from WithoutSubscription was clicked");
    }

}
