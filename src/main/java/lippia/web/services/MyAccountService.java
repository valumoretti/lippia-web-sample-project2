package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;


import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountService {

    public static void verifyMyAccountDashboard() {
        Assert.assertTrue(WebActionManager.isVisible(DASHBOARD_LINK));
    }

    public static void clickSignOut() {
        Assert.assertTrue(
                WebActionManager.isVisible(HELLO_LABEL),
                "Expected login confirmation message is not visible."
        );
        WebActionManager.click(SIGN_OUT_LINK);
    }

    public static void clickOnAccountDetails() {
        WebActionManager.click(ACCOUNT_DETAILS_LINK);
    }

    public static void checkAccountDetails() {
        Assert.assertTrue(
                WebActionManager.isVisible(PASSWORD_CHANGE_LABEL),
                "The 'Password Change' section is not visible."
        );
    }

    public static void clickOnLogoutButton() {
        WebActionManager.click(LOGOUT_BUTTON);
    }

}
