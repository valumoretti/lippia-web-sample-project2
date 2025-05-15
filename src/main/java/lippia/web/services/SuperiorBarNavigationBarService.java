package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.SuperiorNavigationBarConstants.MY_ACCOUNT_MENU_BUTTON;

public class SuperiorBarNavigationBarService extends ActionManager {

    public static void clickMyAccountMenu() {
        WebActionManager.click( MY_ACCOUNT_MENU_BUTTON );
    }

}
