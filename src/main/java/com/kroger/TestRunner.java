package com.kroger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Manzur on 4/18/2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"C:\\Users\\Manzur\\IdeaProjects\\LoginTestKrogerNew\\src\\main\\java\\com\\kroger\\login.feature"} )
public class TestRunner {
}
