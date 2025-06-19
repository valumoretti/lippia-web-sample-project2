package lippia.web.constants;

public class CheckOutConstants {

    public static final String BILLING_DETAILS_FORM = "xpath://div[@class='woocommerce-billing-fields']";
    public static final String COUPON_LINK = "xpath://a[@class='showcoupon']";
    public static final String DIRECT_BANK_TRANSFER_LABEL = "xpath://label[contains(text(),'Direct Bank Transfer')]";
    public static final String CHECK_PAYMENT_LABEL = "xpath://label[contains(text(),'Check Payments')]";
    public static final String CASH_ON_DELIVERY_LABEL = "xpath://label[contains(text(),'Cash on Delivery')]";
    public static final String PAYPAL_LABEL = "xpath://label[contains(text(),'PayPal Express Checkout')]";
    public static final String FIRST_NAME_INPUT = "xpath://input[@id='billing_first_name']";
    public static final String LAST_NAME_INPUT = "xpath://input[@id='billing_last_name']";
    public static final String EMAIL_INPUT = "xpath://input[@id='billing_email']";
    public static final String PHONE_NUMBER_INPUT = "xpath://input[@id='billing_phone']";
    public static final String COUNTRY_DROPDOWN_1 = "xpath://div[@id='s2id_billing_country']/a";
    public static final String COUNTRY_DROPDOWN_2 = "xpath://input[contains(@class,'select2-input')]";
    public static final String ADDRESS_INPUT = "xpath://input[@id='billing_address_1']";
    public static final String CITY_INPUT = "xpath://input[@id='billing_city']";
    public static final String STATE_DROPDOWN = "xpath://div[@id='s2id_billing_state']";
    public static final String POSTCODE_INPUT = "xpath://input[@id='billing_postcode']";
    public static final String BANK_TRANSFER_RADIO = "xpath://input[@id='payment_method_bacs' and @type='radio']";
    public static final String CHEQUE_RADIO = "xpath://input[@id='payment_method_cheque' and @type='radio']";
    public static final String CASH_RADIO = "xpath://input[@id='payment_method_cod' and @type='radio']";
    public static final String PAYPAL_RADIO = "xpath://input[@id='payment_method_ppec_paypal' and @type='radio']";
    public static final String PLACE_ORDER_BUTTON = "xpath://input[@id='place_order']";
    public static final String ORDER_RECEIVED_LABEL = "xpath://p[contains(text(),'Thank you. Your order has been received')]";
    public static final String CHECKOUT_SUBTOTAL_AMOUNT_LABEL = "xpath://tr[@class='cart-subtotal']/td/span[@class='woocommerce-Price-amount amount']\n";
    public static final String CHECKOUT_TAX_AMOUNT_LABEL = "xpath://tr[contains(@class, 'tax-rate-roaming-tax')]/td/span[@class='woocommerce-Price-amount amount']\n";
    public static final String CHECKOUT_TOTAL_AMOUNT_LABEL = "xpath://tr[@class='order-total']//span[@class='woocommerce-Price-amount amount']\n";
    public static final String BANK_DETAILS_LABEL = "xpath://h2[text()='Our Bank Details']";
    public static final String ORDER_DETAILS_LABEL = "xpath://h2[text()='Order Details']";
    public static final String CUSTOMER_DETAILS_LABEL = "xpath://h2[text()='Customer Details']";
    public static final String BILLING_ADDRESS_LABEL = "xpath://h3[text()='Billing Address']";
}
