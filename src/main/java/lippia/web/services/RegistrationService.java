package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.RegistrationConstants.*;

public class RegistrationService {

    public static void enterEmailAddress(String email) {
        WebActionManager.setInput(EMAIL_REGISTRATION_INPUT, email);
    }

    public static void leavePasswordEmpty() {
        WebActionManager.setInput(PASSWORD_REGISTRATION_INPUT, "");
    }

    public static void clickRegisterButton() {
        WebActionManager.click(REGISTER_BUTTON);
    }

    public static void checkRegistrationFail() {
        Assert.assertTrue(
                WebActionManager.isVisible(REGISTRATION_ERROR_MESSAGE),
                "Expected registration error message is not visible."
        );
    }
}
