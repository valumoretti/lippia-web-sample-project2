package lippia.web.constants;

public class BasketConstants {

    public static final String PROCEED_CHECKOUT_BUTTON = "xpath://a[@href='https://practice.automationtesting.in/checkout/']";
    public static final String BASKET_SUBTOTAL_AMOUNT_LABEL = "xpath://tr[th[contains(text(), 'Subtotal')]]/td/span[@class='woocommerce-Price-amount amount']";
    public static final String BASKET_TAX_AMOUNT_LABEL = "xpath://tr[th[contains(text(), 'Tax')]]/td/span[@class='woocommerce-Price-amount amount']\n";
    public static final String BASKET_TOTAL_AMOUNT_LABEL = "xpath:(//span[@class='woocommerce-Price-amount amount'])[last()]";

}
