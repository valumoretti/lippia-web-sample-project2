package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.CheckOutService;
import lippia.web.services.ShopService;
import org.testng.Assert;

public class ShopSteps extends PageSteps {

    @And("^the client clicks on a (.*) product category link$")
    public void clickProductCategoryLink(String categoryLink) {
        ShopService.clickProductCategoryLink(categoryLink);
    }

    @Then("^only products from that (.*) category should be displayed$")
    public void checkCategoryProducts(String categoryName) {
        ShopService.checkCategoryProducts(categoryName);
    }

    @And("the client clicks the Add to basket button which adds a book")
    public void clickAddToBasketButtonWhichAddsABook() {
        ShopService.clickAddToBasketButtonFromShop();
    }

    @Then("^the client can check tax rate for indian should be '(.*)'%$")
    public void checkTaxRateForIndian(int expectedRatePercentage) {
        CheckOutService.checkTaxRateForIndian(expectedRatePercentage);
    }
}
