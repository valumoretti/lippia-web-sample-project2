package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @Then("the client can check that has only '(.*)' sliders")
    public void theClientCanCheckThatHasOnlySliders(int qSliders) {
        HomeService.checkSliders(qSliders);
    }

    @Then("the client can check that has only '(.*)' arrivals")
    public void theClientCanCheckThatHasOnlyArrivals(int qArrivals) {
        HomeService.checkArrivals(qArrivals);
    }

    @When("the client clicks on the Shop menu")
    public void theClientClicksOnTheShopMenu() {
    }



}
