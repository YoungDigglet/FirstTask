package org.tMobile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/org/features",
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"})
public class RunCucumberTest {
}
