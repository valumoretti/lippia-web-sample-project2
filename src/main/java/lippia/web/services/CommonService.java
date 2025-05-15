package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebElement;

public class CommonService {

    public static void scrollIntoView(String locator) {
        WebElement scrollLocator = WebActionManager.getElement(locator);
        DriverManager.getDriverInstance().executeScript("arguments[0].scrollIntoView({block: 'center'});", scrollLocator);

    }
}
