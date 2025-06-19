package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.BasketConstants.*;

public class BasketService {

    public static void clickProceedCheckOutButton() {
        String subtotalText = WebActionManager.getText(BASKET_SUBTOTAL_AMOUNT_LABEL);
        String taxText = WebActionManager.getText(BASKET_TAX_AMOUNT_LABEL);
        String totalText = WebActionManager.getText(BASKET_TOTAL_AMOUNT_LABEL);

        double subtotal = Double.parseDouble(subtotalText.replace("₹", "").trim());
        double tax = Double.parseDouble(taxText.replace("₹", "").trim());
        double total = Double.parseDouble(totalText.replace("₹", "").trim());

        Assert.assertEquals(
                subtotal + tax,
                total,
                0.01,
                "Subtotal + Tax does not equal Total. Subtotal: " + subtotal + ", Tax: " + tax + ", Total: " + total
        );

        WebActionManager.click(PROCEED_CHECKOUT_BUTTON);
    }

}
