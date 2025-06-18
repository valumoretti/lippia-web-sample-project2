package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    @And("^the client clicks on a (.*) product category link$")
    public void clickProductCategoryLink(String categoryLink) {
        ShopService.clickProductCategoryLink(categoryLink);
    }

    @Then("^only products from that (.*) category should be displayed$")
    public void checkCategoryProducts(String categoryName) {
        ShopService.checkCategoryProducts(categoryName);
    }
}
