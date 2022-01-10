package co.com.zabud.certification.base.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_mentis.feature",
        glue = "co.com.zabud.certification.base.stepDefinitions",
        snippets = SnippetType.CAMELCASE )public class LoginMentisRunner {

}
