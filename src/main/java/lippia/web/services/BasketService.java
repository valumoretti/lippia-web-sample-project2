package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.BasketConstants.PROCEED_CHECKOUT_BUTTON;

public class BasketService {

    public static void clickProceedCheckOutButton() {
        WebActionManager.click(PROCEED_CHECKOUT_BUTTON);
    }

}
