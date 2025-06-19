package lippia.web.constants;

public class ShopConstants {

    public static final String ANDROID_CATEGORY_LINK = "xpath://a[contains(@href, '/product-category/android')]";
    public static final String HTML_CATEGORY_LINK = "xpath://a[contains(@href, '/product-category/html')]";
    public static final String JAVASCRIPT_CATEGORY_LINK = "xpath://a[contains(@href, '/product-category/javascript')]";
    public static final String SELENIUM_CATEGORY_LINK = "xpath://a[contains(@href, '/product-category/selenium')]";
    public static final String ANDROID_BREADCRUMB_NAV = "xpath://nav[contains(@class, 'woocommerce-breadcrumb') and contains(text(), 'Android')]";
    public static final String HTML_BREADCRUMB_NAV = "xpath://nav[contains(@class, 'woocommerce-breadcrumb') and contains(text(), 'HTML')]";
    public static final String JAVASCRIPT_BREADCRUMB_NAV = "xpath://nav[contains(@class, 'woocommerce-breadcrumb') and contains(text(), 'JavaScript')]";
    public static final String SELENIUM_BREADCRUMB_NAV = "xpath://nav[contains(@class, 'woocommerce-breadcrumb') and contains(text(), 'selenium')]";
    public static final String PRODUCTS_LIST = "xpath://ul[contains(@class,'products')]/li[contains(@class,'product')]";
    public static final String ADD_TO_BASKET_BUTTON_FROM_SHOP = "xpath://a[contains(@href, 'add-to-cart=169')]\n";
    public static final String PRICE_BOOK_LABEL = "xpath://span[@class='woocommerce-Price-amount amount' and contains(., '450.00')]";
    public static final String PRICE_ITEM_LABEL = "xpath://span[@class='amount' and normalize-space(.)='₹450.00']\n";

}
