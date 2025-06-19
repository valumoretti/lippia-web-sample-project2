package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.*;

public class CommonSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        CommonService.navigateTo();
    }

    @When("the client clicks on the My Account menu")
    public void clickOnMyAccountMenu() {
        SuperiorBarNavigationBarService.clickMyAccountMenu();
    }

    @And("^the client enters \"(.*)\" in the Email Address textbox$")
    public void enterInTheEmailAddressTextbox(String email) {
        CheckOutService.enterEmailAddress(email);
    }

    @And("^the client selects \"(.*)\" in the Country section$")
    public void selectInTheCountrySection(String country) {
        CheckOutService.selectCountry(country);
    }

    @And("^the client enters \"(.*)\" in the Address textbox$")
    public void enterInTheAddressTextbox(String address) {
        CheckOutService.enterAddress(address);
    }

    @And("^the client enters \"(.*)\" in the city textbox$")
    public void enterInTheCityTextbox(String city) {
        CheckOutService.enterCity(city);
    }

    @And("^the client enters \"(.*)\" in the State section$")
    public void enterInTheStateCountrySection(String state) {
        CheckOutService.enterState(state);
    }

    @And("^the client enters \"(.*)\" in the Postcode or ZIP textbox$")
    public void enterInThePostcodeZIPTextbox(String postcode) {
        CheckOutService.enterPostcode(postcode);
    }

    @And("^the client selects (.*) in the payment gateway$")
    public void selectPaymentInThePaymentGateway(String paymentMethod) {
        CheckOutService.selectPayment(paymentMethod);
    }

    @And("the client clicks on Place Order button")
    public void clickOnPlaceOrderButton() {
        CheckOutService.clickPlaceOrderButton();
    }

    @Then("the client can check that the order has been received")
    public void checkThatTheOrderHasBeenReceived() {
        CheckOutService.checkOrderReceived();
    }

    @And("^the client enters \"(.*)\" in the Phone textbox$")
    public void enterInThePhoneTextbox(String phoneNumber) {
        CheckOutService.enterPhoneNumber(phoneNumber);
    }

    @And("^the client enters \"(.*)\" in the Last Name textbox$")
    public void enterInTheLastNameTextbox(String lastName) {
        CheckOutService.enterLastName(lastName);
    }

    @And("^the client enters \"(.*)\" in the First Name textbox$")
    public void enterFirstNameTextbox(String firstName) {
        CheckOutService.enterFirstName(firstName);
    }

    @And("the client clicks on Proceed to Check out button")
    public void clickOnProceedToCheckOutButton() {
        BasketService.clickProceedCheckOutButton();
    }

    @And("the client clicks on Item link with price")
    public void clickOnItemLinkWithPrice() {
        SuperiorBarNavigationBarService.clickItemLink();
    }

    @When("the client clicks on the Shop menu")
    public void clickOnTheShopMenu() {
        SuperiorBarNavigationBarService.clickShopMenu();
    }

    @And("the client clicks on the Home menu")
    public void clickOnTheHomeMenu() {
        SuperiorBarNavigationBarService.clickHomeMenu();
    }

    @Then("the client shouldn't be signed in to his account")
    public void checkClientShouldntBeSigned() {
        CommonService.checkClientShouldntBeSigned();
    }

}