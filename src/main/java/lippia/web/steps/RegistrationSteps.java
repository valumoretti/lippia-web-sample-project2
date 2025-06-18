package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.RegistrationService;

public class RegistrationSteps {

    @And("^the client enters \"(.*)\" in the Email address textbox$")
    public void enterInTheEmailAddressTextbox(String email) {
        RegistrationService.enterEmailAddress(email);
    }

    @And("the client leaves the password textbox empty")
    public void leavePasswordTextboxEmpty() {
        RegistrationService.leavePasswordEmpty();
    }

    @And("the client clicks on Register button")
    public void clickOnRegisterButton() {
        RegistrationService.clickRegisterButton();
    }

    @Then("the registration must fail and show a message")
    public void checkRegistrationMustFail() {
        RegistrationService.checkRegistrationFail();
    }
}
