package com.tutorialninja.demo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",               //features pack under resources
        glue = "com/tutorialninja/demo/steps",                  //steps under test
        plugin = {"html:target/cucumber-reports/cucumber.html", // default report
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //from info.txt. extent report
        tags = "@smoke")                                            //for test output folder

public class RunCukeTest extends AbstractTestNGCucumberTests {

}
