package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "AllFeatures" }, glue = { "StepDefination" },
dryRun = false)
public class TestRuuner {

}
