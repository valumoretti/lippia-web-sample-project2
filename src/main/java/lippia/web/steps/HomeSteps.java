package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.sun.tools.javac.comp.Check;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.BasketService;
import lippia.web.services.CheckOutService;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {

    @Then("^the client can check that has only '(.*)' sliders$")
    public void checkSliders(int qSliders) {
        HomeService.checkSliders(qSliders);
    }

    @Then("^the client can check that has only '(.*)' arrivals$")
    public void checkArrivals(int qArrivals) {
        HomeService.checkArrivals(qArrivals);
    }

    @And("^the client clicks on (.*) image in the Arrivals section$")
    public void clickOnOneImageInTheArrivalsSection(String imageName) {
        HomeService.clickArrivalImage(imageName);
    }

    @Then("^the client can verify that it navigates to a page where the book (.*) can be added to the basket$")
    public void verifyThatItNavigatesToAPage(String titleName) {
        HomeService.verifyPage(titleName);
    }

    @And("the client clicks the Add To Basket button")
    public void clickAddToBasketButton() {
        HomeService.clickBasketButton();
    }

    @And("the client clicks on Item link with price")
    public void clickOnItemLinkWithPrice() {
        SuperiorBarNavigationBarService.clickItemLink();
    }

    @And("the client clicks on Proceed to Check out button")
    public void clickOnProceedToCheckOutButton() {
        BasketService.clickProceedCheckOutButton();
    }

    @Then("the client can see the Billing Details form")
    public void checkTheBillingDetailsForm() {
        CheckOutService.checkBillingDetailsForm();
    }

    @And("the client can apply a coupon code")
    public void checkCouponService() {
        CheckOutService.checkCouponOption();
    }

    @And("the client can see order details where total is greater than subtotal")
    public void checkOrderDetails() {
        CheckOutService.checkTotalAndSubtotal();
    }

    @And("the client can opt any payment like direct bank transfer, check, cash or PayPal")
    public void checkPaymentMethods() {
        CheckOutService.checkPaymentMethods();
    }

    @And("^the client enters \"(.*)\" in the First Name textbox$")
    public void enterFirstNameTextbox(String firstName) {
        CheckOutService.enterFirstName(firstName);
    }

    @And("^the client enters \"(.*)\" in the Last Name textbox$")
    public void enterInTheLastNameTextbox(String lastName) {
        CheckOutService.enterLastName(lastName);
    }

    @And("^the client enters \"(.*)\" in the Email Address textbox$")
    public void enterInTheEmailAddressTextbox(String email) {
        CheckOutService.enterEmailAddress(email);
    }

    @And("^the client enters \"(.*)\" in the Phone textbox$")
    public void enterInThePhoneTextbox(String phoneNumber) {
        CheckOutService.enterPhoneNumber(phoneNumber);
    }

    @And("^the client selects \"(.*)\" in the Country section$")
    public void selectInTheCountrySection(String country) {
        CheckOutService.selectCountry(country);
    }

    @And("^the client enters \"(.*)\" in the Address textbox$")
    public void enterInTheAddressTextbox(String address) {
        CheckOutService.enterAddress(address);
    }

    @And("^the client enters \"(.*)\" in the State textbox$")
    public void enterInTheStateCountryTextbox(String state) {
        CheckOutService.enterState(state);
    }

    @And("^the client enters \"(.*)\" in the Postcode or ZIP textbox$")
    public void enterInThePostcodeZIPTextbox(String postcode) {
        CheckOutService.enterPostcode(postcode);
    }

    @And("the client selects (.*) in the payment gateway")
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
}
