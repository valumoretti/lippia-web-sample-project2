package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.CommonService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class CommonSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        CommonService.navigateTo();
    }

    @When("the client clicks on the Shop menu")
    public void clickOnTheShopMenu() {
        SuperiorBarNavigationBarService.clickShopMenu();
    }

    @And("the client clicks on the Home menu")
    public void clickOnTheHomeMenu() {
        SuperiorBarNavigationBarService.clickHomeMenu();
    }

}
