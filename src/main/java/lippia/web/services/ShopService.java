package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

import static lippia.web.constants.ShopConstants.*;

public class ShopService {

    public static void clickProductCategoryLink(String categoryLink) {
        switch (categoryLink) {
            case "Android":
                WebActionManager.click( ANDROID_CATEGORY_LINK );
                break;
            case "HTML":
                WebActionManager.click( HTML_CATEGORY_LINK );
                break;
            case "JavaScript":
                WebActionManager.click( JAVASCRIPT_CATEGORY_LINK );
                break;
            case "Selenium":
                WebActionManager.click( SELENIUM_CATEGORY_LINK );
                break;
            default:
                throw new IllegalArgumentException("Unrecognized product category: " + categoryLink);
        }
    }

    public static void checkCategoryProducts(String categoryName) {
        switch (categoryName) {
            case "Android":
                String androidBreadText = WebActionManager.getText(ANDROID_BREADCRUMB_NAV);
                Assert.assertTrue(androidBreadText.contains(categoryName));
                validateProductCategory("android");
                break;
            case "HTML":
                String htmlBreadText = WebActionManager.getText(HTML_BREADCRUMB_NAV);
                Assert.assertTrue(htmlBreadText.contains(categoryName));
                validateProductCategory("html");
                break;
            case "JavaScript":
                String javaSBreadText = WebActionManager.getText(JAVASCRIPT_BREADCRUMB_NAV);
                Assert.assertTrue(javaSBreadText.contains(categoryName));
                validateProductCategory("javascript");
                break;
            case "Selenium":
                String seleniumBreadText = WebActionManager.getText(SELENIUM_BREADCRUMB_NAV);
                Assert.assertTrue(seleniumBreadText.contains(categoryName));
                validateProductCategory("selenium");
                break;
            default:
        }
    }

    private static void validateProductCategory(String categoryClassSuffix) {
        List<WebElement> products = WebActionManager.getElements(ShopConstants.PRODUCTS_LIST);
        int productCount = products.size();
        Assert.assertTrue("No visible products", productCount > 0);

        String expectedClass = "product_cat-" + categoryClassSuffix;
        int validCount = 0;

        for (WebElement product : products) {
            String classAttr = product.getAttribute("class");
            if (classAttr.contains(expectedClass)) {
                validCount++;
            }
        }

        Assert.assertEquals("Not all products have the expected class '" + expectedClass + "'",
                productCount,
                validCount);
    }
}