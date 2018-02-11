package IT;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class MyStepdefs {
    @Given("^there are words in the dictionary$")
    public void thereAreWordsInTheDictionary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hello");
        //throw new PendingException();
    }

    @And("^i request to view the words in the dictionary$")
    public void iRequestToViewTheWordsInTheDictionary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^i should see the words in the dictionary$")
    public void iShouldSeeTheWordsInTheDictionary() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
