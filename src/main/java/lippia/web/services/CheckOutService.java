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

//revisar esto, quizas estos son los xpath que me estan fallando! los de aca arriba

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

    public static void enterFirstName(String firstName) {
        WebActionManager.setInput(FIRST_NAME_INPUT, firstName);
    }

    public static void enterLastName(String lastName) {
        WebActionManager.setInput(LAST_NAME_INPUT, lastName);
    }

    public static void enterEmailAddress(String email) {
        WebActionManager.setInput(EMAIL_INPUT, email);
    }

    public static void enterPhoneNumber(String phoneNumber) {
        WebActionManager.setInput(PHONE_NUMBER_INPUT, phoneNumber);
    }

    public static void selectCountry(String country) {
        WebActionManager.click("xpath://div[@id='s2id_billing_country']/a");
        WebActionManager.setInput("xpath://input[contains(@class,'select2-input')]", country);
        WebActionManager.click("xpath://input[contains(@class,'select2-input')]");
    }

    public static void enterAddress(String address) {
        WebActionManager.setInput(ADDRESS_INPUT, address);
    }

    public static void enterState(String state) {
        WebActionManager.setDropdownByVisibleText(STATE_DROPDOWN, state);
    }

    public static void enterPostcode(String postcode) {
        WebActionManager.setInput(POSTCODE_INPUT, postcode);
    }

    public static void selectPayment(String paymentMethod) {
        switch (paymentMethod.trim().toLowerCase()) {
            case "direct bank transfer":
                WebActionManager.click(BANK_TRANSFER_RADIO);
                break;
            case "check payments":
                WebActionManager.click(CHEQUE_RADIO);
                break;
            case "cash on delivery":
                WebActionManager.click(CASH_RADIO);
                break;
            case "paypal express checkout":
                WebActionManager.click(PAYPAL_RADIO);
                break;
            default:
                throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
        }
    }

    public static void clickPlaceOrderButton() {
        WebActionManager.click(PLACE_ORDER_BUTTON);
    }

    public static void checkOrderReceived() {
        Assert.assertTrue(
                WebActionManager.isVisible(ORDER_RECEIVED_LABEL), "The order confirmation message is not visible."
        );
    }
}
