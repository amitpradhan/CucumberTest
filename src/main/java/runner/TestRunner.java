package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="E:\\Selenium_WebDriver_New\\BDD_FReeCRMTest\\src\\main\\java\\features\\taggedhooks.feature"
		,glue = {"stepDefinitions"},
		format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		//format is used to generate report in different format like html, xml , json etc
		monochrome= true,
		dryRun=false,  //to check the mapping is proper between feature file and step def file
		strict = true //it will check if any step is not defined in step definition file
		//tags={"@SmokeTest,@End2End"}
		//tags = {"@SmokeTest" , "~@RegressionTest", "~@End2End"}	
		)
public class TestRunner {

}
