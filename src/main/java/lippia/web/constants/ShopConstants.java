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


}
