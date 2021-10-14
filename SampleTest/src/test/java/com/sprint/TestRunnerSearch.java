package com.sprint;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/akulka25/eclipse-workspace/SampleTest/src/test/java/com/sprint/Search.feature",
glue= {"com.sprint"}, plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
,publish=true)
public class TestRunnerSearch {

}
