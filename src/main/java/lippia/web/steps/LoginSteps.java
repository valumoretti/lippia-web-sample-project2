package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps extends PageSteps {

    @When("the client clicks on the My Account menu")
    public void clickOnMyAccountMenu() {
        SuperiorBarNavigationBarService.clickMyAccountMenu();
    }

    @And("^the client enters \"(.*)\" in the username textbox$")
    public void enterUsername(String username) {
        LoginService.enterUsername(username);
    }

    @And("^the client enters \"(.*)\" in the password textbox$")
    public void enterPasswordTextbox(String password) {
        LoginService.enterPassword(password);
    }

    @And("the client clicks on the Login button")
    public void clickLoginButton() {
        LoginService.clickLoginButton();
    }

    @Then("^the error message \"(.*)\" should be displayed$")
    public void errorMessageShouldBeDisplayed(String errorMessage) {
        LoginService.checkLoginErrorMessage(errorMessage);
    }
}
