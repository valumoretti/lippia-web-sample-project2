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
        String subtotalText = WebActionManager.getText(CHECKOUT_SUBTOTAL_AMOUNT_LABEL);
        String totalText = WebActionManager.getText(CHECKOUT_TOTAL_AMOUNT_LABEL);

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
        WebActionManager.click(COUNTRY_DROPDOWN_1);
        WebActionManager.setInput(COUNTRY_DROPDOWN_2, country);
        WebActionManager.click(COUNTRY_DROPDOWN_2);

        String subtotalText = WebActionManager.getText(CHECKOUT_SUBTOTAL_AMOUNT_LABEL);
        String taxText = WebActionManager.getText(CHECKOUT_TAX_AMOUNT_LABEL);
        String totalText = WebActionManager.getText(CHECKOUT_TOTAL_AMOUNT_LABEL);

        double subtotal = Double.parseDouble(subtotalText.replace("₹", "").trim());
        double tax = Double.parseDouble(taxText.replace("₹", "").trim());
        double total = Double.parseDouble(totalText.replace("₹", "").trim());

        double expectedTax = subtotal * 0.05;
        Assert.assertEquals(
                tax,
                expectedTax,
                0.01,
                "Tax is not 5% of the subtotal. Expected: " + expectedTax + ", but got: " + tax
        );
        double expectedTotal = subtotal + tax;
        Assert.assertEquals(
                total,
                expectedTotal,
                0.01,
                "Subtotal + Tax does not equal Total. Subtotal: " + subtotal + ", Tax: " + tax + ", Total: " + total
        );

    }

    public static void enterAddress(String address) {
        WebActionManager.setInput(ADDRESS_INPUT, address);
    }

    public static void enterCity(String city) {
        WebActionManager.setInput(CITY_INPUT, city);
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
        Assert.assertTrue(
                WebActionManager.isVisible(BANK_DETAILS_LABEL), "'Our Bank details' section is not visible."
        );
        Assert.assertTrue(
                WebActionManager.isVisible(ORDER_DETAILS_LABEL), "'Order details' section is not visible."
        );
        Assert.assertTrue(
                WebActionManager.isVisible(CUSTOMER_DETAILS_LABEL), "'Customer details' section is not visible."
        );
        Assert.assertTrue(
                WebActionManager.isVisible(BILLING_ADDRESS_LABEL), "'Billing address' section is not visible."
        );

    }

    public static void checkTaxRateForIndian(int expectedRatePercentage) {
        String subtotalText = WebActionManager.getText(CHECKOUT_SUBTOTAL_AMOUNT_LABEL);
        String taxText = WebActionManager.getText(CHECKOUT_TAX_AMOUNT_LABEL);
        String totalText = WebActionManager.getText(CHECKOUT_TOTAL_AMOUNT_LABEL);

        double subtotal = Double.parseDouble(subtotalText.replace("₹", "").trim());
        double actualTax = Double.parseDouble(taxText.replace("₹", "").trim());
        double total = Double.parseDouble(totalText.replace("₹", "").trim());

        double expectedTax = subtotal * (expectedRatePercentage / 100.0);
        double expectedTotal = subtotal + actualTax;

        Assert.assertEquals(
                actualTax,
                expectedTax,
                0.01,
                "Tax is not " + expectedRatePercentage + "% of the subtotal. Expected: " + expectedTax + ", but got: " + actualTax
        );

        Assert.assertEquals(
                total,
                expectedTotal,
                0.01,
                "Subtotal + Tax does not equal Total. Subtotal: " + subtotal + ", Tax: " + actualTax + ", Total: " + total
        );
    }
}
