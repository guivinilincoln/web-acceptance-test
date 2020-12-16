package runnes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/stepDefinition/Login.feature"},
        strict = false,
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber_json_reports/cadastro-html.json","html:target/login-html"},
        glue = {"driver",
        		"tests",
        		"base",
        		"pages"})
public class LoginTest {
}
