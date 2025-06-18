package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.MyAccountService;

public class MyAccountSteps {

    @And("the client clicks on Account details")
    public void clickOnAccountDetails() {
        MyAccountService.clickOnAccountDetails();
    }

    @Then("client can view account details where he could change his password also")
    public void checkAccountDetails() {
        MyAccountService.checkAccountDetails();
    }
}
