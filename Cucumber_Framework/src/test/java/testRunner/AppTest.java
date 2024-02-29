package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles/Supplier.feature"},glue = {"stepDefinitions"},monochrome = true,
                 plugin= {"pretty","html:target/cucumber-reports.html"})
public class AppTest 
{

}
