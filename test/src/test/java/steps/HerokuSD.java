package steps;

/**
 * Created by agolubev on 12/2/18.
 */


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.heroku.*;

public class HerokuSD extends start.driver.DriverWrapper{

    PageElements locator = new PageElements();

    @Given("^User is on the Threely register page$")
    public void user_is_on_the_Threely_register_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initializeWebDriver("https://floating-anchorage-58495.herokuapp.com/signup");
    }
    @When("^I enter name as (.+) email as <email> password as (.+)$")
    public void enterCred(String name, String email, String password) throws Throwable{


        
        locator.clickOnRegistrationName();
        locator.setOnRegistrationName(name);
        locator.clickOnRegistrationEmail();
        locator.setOnRegistrationEmail(email);
        locator.clickOnRegistrationPassword();
        locator.setOnRegistrationPassword(password);

    }

    @When("^I click 'submit' button$")
    public void i_click_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I verify invalid email address$")
    public void i_verify_invalid_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }



}
