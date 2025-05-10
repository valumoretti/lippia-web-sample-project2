package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.isPresent;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomeService {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShopButton() {
        click(HomeConstants.BUTTON_SHOP_XPATH);
    }

    public static void verificarShopPage() {
        Assert.assertTrue(isPresent(HomeConstants.ORDERBY_XPATH));
    }

    public static void checkSliders(int qSliders) {
        Assert.assertTrue(WebActionManager.getElements(HomeConstants.CONTAINER_SLIDERS).size() == qSliders);
    }

    public static void checkArrivals(int qArrivals) {
        Assert.assertTrue(WebActionManager.getElements(HomeConstants.CONTAINER_ARRIVALS).size() == qArrivals);
    }
}
