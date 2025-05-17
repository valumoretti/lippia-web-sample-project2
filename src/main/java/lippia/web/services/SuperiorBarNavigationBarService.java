package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class SuperiorBarNavigationBarService extends ActionManager {

    public static void clickMyAccountMenu() {
        WebActionManager.click( MY_ACCOUNT_MENU_BUTTON );
    }

    public static void clickShopMenu() {
        WebActionManager.click( SHOP_MENU_BUTTON );
    }

    public static void clickHomeMenu() {
        WebActionManager.click( HOME_MENU_BUTTON );
    }
}
