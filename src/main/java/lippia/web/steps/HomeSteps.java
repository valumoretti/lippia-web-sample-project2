package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.CheckOutService;
import lippia.web.services.HomeService;

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

}
