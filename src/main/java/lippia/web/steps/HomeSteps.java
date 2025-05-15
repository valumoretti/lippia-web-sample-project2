package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        HomeService.navigateTo();
    }

    @Then("the client can check that has only '(.*)' sliders")
    public void checkSliders(int qSliders) {
        HomeService.checkSliders(qSliders);
    }

    @Then("the client can check that has only '(.*)' arrivals")
    public void checkArrivals(int qArrivals) {
        HomeService.checkArrivals(qArrivals);
    }

    @When("the client clicks on the Shop menu")
    public void clickOnTheShopMenu() {
        HomeService.clickShopMenu();
    }

    @And("the client clicks on the Home menu")
    public void clickOnTheHomeMenu() {
        HomeService.clickHomeMenu();
    }

    @And("^the client clicks on (.*) image in the Arrivals section$")
    public void clickOnOneImageInTheArrivalsSection(String imageName) {
        HomeService.clickArrivalImage(imageName);
    }

    @Then("^the client can verify that it navigates to a page where the book (.*) can be added to the basket$")
    public void verifyThatItNavigatesToAPage(String titleName) {
        HomeService.verifyPage(titleName);
    }
}
