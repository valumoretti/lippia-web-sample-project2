package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.CheckOutConstants.*;

public class CheckOutService {

    public static void checkBillingDetailsForm() {
        boolean isVisible = WebActionManager.isVisible(BILLING_DETAILS_FORM);
        Assert.assertTrue(isVisible, "Billing details form is not visible");
    }

    public static void checkCouponOption() {
        boolean isVisible = WebActionManager.isVisible(COUPON_LINK);
        Assert.assertTrue(isVisible, "Coupon link is not visible");
    }

    public static void checkTotalAndSubtotal() {
        String subtotalText = WebActionManager.getText("//tr[td[contains(text(),'Subtotal')]]/td[2]");
        String totalText = WebActionManager.getText("//tr[td[contains(text(),'Total')]]/td[2]");

        double subtotal = Double.parseDouble(subtotalText.replace("₹", "").trim());
        double total = Double.parseDouble(totalText.replace("₹", "").trim());

        Assert.assertTrue(total > subtotal, "The total amount is not greater than the subtotal. Subtotal: " + subtotal + ", Total: " + total);
    }

    public static void checkPaymentMethods() {
        Assert.assertTrue(WebActionManager.isVisible(DIRECT_BANK_TRANSFER_LABEL), "Direct Bank Transfer not visible");
        Assert.assertTrue(WebActionManager.isVisible(CHECK_PAYMENT_LABEL), "Check Payments not visible");
        Assert.assertTrue(WebActionManager.isVisible(CASH_ON_DELIVERY_LABEL), "Cash on Delivery not visible");
        Assert.assertTrue(WebActionManager.isVisible(PAYPAL_LABEL), "PayPal Express Checkout not visible");
    }

    public static void enterFirstNameTextbox() {

    }
}
