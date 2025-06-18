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
}
