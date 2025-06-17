package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.MyAccountConstants;

public class MyAccountService {

    public static void verifyMyAccountDashboard() {
        Assert.assertTrue(WebActionManager.isVisible(MyAccountConstants.DASHBOARD_LINK));
    }
}
