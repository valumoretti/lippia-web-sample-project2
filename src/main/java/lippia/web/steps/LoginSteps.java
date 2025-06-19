package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.CommonService;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

public class LoginSteps extends PageSteps {

    @And("^the client enters registered username \"(.*)\" in the username textbox$")
    public void enterValidUsername(String username) {
        LoginService.enterUsername(username);
    }

    @And("^the client enters valid password \"(.*)\" in the password textbox$")
    public void enterValidPassword(String password) {
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

    @Then("the client should see the My Account dashboard")
    public void verifyMyAccountDashboardIsVisible() {
        MyAccountService.verifyMyAccountDashboard();
    }

    @And("^the client enters the case changed username \"(.*)\" in the username textbox$")
    public void enterCaseChangedUsername(String usernameCaseChanged) {
        LoginService.enterCaseChangedUsername(usernameCaseChanged);
    }

    @And("^the client enters the case changed password \"(.*)\" in the password textbox$")
    public void enterCaseChangedPassword(String passwordCaseChanged) {
        LoginService.enterCaseChangedPassword(passwordCaseChanged);
    }

    @Then("login must fail saying incorrect username-password")
    public void checkLoginMustFail() {
        LoginService.checkLoginFail();
    }

    @And("the client clicks on Sign out")
    public void clickSignOut() {
        MyAccountService.clickSignOut();
    }

    @And("the client presses back button")
    public void pressBackButton() {
        CommonService.pressBackButton();
    }

}
