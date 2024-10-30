package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DocumentationPage;
import toolset.WebDriverTool;

public class SampleSteps {

    DocumentationPage documentationPage = new DocumentationPage();

    @BeforeAll
    public static void beforeAll() {
        WebDriverTool.setDriver();
    }


    @Given("^selenium documentation page is displayed$")
    public void seleniumDocumentationPageIsDisplayed() {
        documentationPage.verifyDocumentationPage();
    }

    @When("^the \"([^\"]*)\" word is searched$")
    public void theWordIsSearched(String word) {
        documentationPage.searchInDocumentation(word);
    }

    @Then("^the result that includes \"([^\"]*)\" is displayed$")
    public void theResultThatIncludesIsDisplayed(String word) {
        documentationPage.verifyResult(word);
    }

    @AfterAll
    public static void afterAll() {
        WebDriverTool.closeDriver();
    }
}
