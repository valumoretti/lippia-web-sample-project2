package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps extends PageSteps {

    @Given("The client is in google page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @And("enters {string} in the username textbox")
    public void entersInTheUsernameTextbox(String arg0) {
    }
}
