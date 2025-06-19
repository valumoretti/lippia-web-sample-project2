package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.LoginConstants.LOGIN_BUTTON;
import static lippia.web.constants.MyAccountConstants.HELLO_LABEL;


public class CommonService {

    public static void navigateTo() {
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void scrollIntoView(String locator) {
        WebElement scrollLocator = WebActionManager.getElement(locator);
        DriverManager.getDriverInstance().executeScript("arguments[0].scrollIntoView({block: 'center'});", scrollLocator);

    }

    public static void pressBackButton() {
        DriverManager.getDriverInstance().navigate().back();
    }

    public static void checkClientShouldntBeSigned() {
        Assert.assertTrue(
                WebActionManager.isVisible(LOGIN_BUTTON),
                "Expected login button is not visible"
        );
        Assert.assertFalse(
                WebActionManager.isPresent(HELLO_LABEL),
                "Login confirmation message is still visible; user may still be logged in."
        );
    }
}
