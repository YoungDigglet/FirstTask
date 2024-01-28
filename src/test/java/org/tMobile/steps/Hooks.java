package org.tMobile.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.tMobile.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup() {
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get("https://www.t-mobile.pl");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

}
