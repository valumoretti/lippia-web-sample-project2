package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import org.testng.Assert;

import static lippia.web.constants.HomeConstants.*;


public class HomeService {

    public static void navigateTo() {
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void checkSliders(int qSliders) {
            Assert.assertTrue(WebActionManager.getElements(HomeConstants.CONTAINER_SLIDERS).size() == qSliders);
        }

    public static void checkArrivals(int qArrivals) {
        Assert.assertTrue(WebActionManager.getElements(HomeConstants.CONTAINER_ARRIVALS).size() == qArrivals);
    }

    public static void clickShopMenu() {
        WebActionManager.click( SHOP_MENU_BUTTON );
    }

    public static void clickHomeMenu() {
        WebActionManager.click( HOME_MENU_BUTTON );
    }

    public static void clickArrivalImage(String imageName) {
        switch (imageName) {
            case "Selenium Ruby":
                WebActionManager.click( SELENIUM_RUBY_IMAGE );
                break;
            case "Thinking in HTML":
                WebActionManager.click( THINKING_IN_HTML_IMAGE );
                break;
            case "Mastering JavaScript":
                WebActionManager.click( MASTERING_JAVASCRIPT_IMAGE );
                break;
            default:
                throw new IllegalArgumentException("Unrecognized image: " + imageName);
        }

    }

    public static void verifyPage(String titleName) {

        switch (titleName) {
            case "Selenium Ruby":
                String title1 = WebActionManager.getText( HomeConstants.SELENIUM_RUBY_TITLE );
                Assert.assertEquals("Selenium Ruby", title1);
                break;
            case "Thinking in HTML":
                String title2 = WebActionManager.getText( HomeConstants.THINKING_IN_HTML_TITLE );
                Assert.assertEquals("Thinking in HTML", title2);
                break;
            case "Mastering JavaScript":
                String title3 = WebActionManager.getText( HomeConstants.MASTERING_JAVASCRIPT_TITLE );
                Assert.assertEquals("Mastering JavaScript", title3);
                break;
            default:
                throw new IllegalArgumentException("Unrecognized title: " + titleName);

        }
        Assert.assertTrue(WebActionManager.isEnabled( HomeConstants.ADD_TO_BASKET_BUTTON ));
        //si no anda isEnabled entonces usar isVisible dependiendo si el boton esta roto o no
    }
}

