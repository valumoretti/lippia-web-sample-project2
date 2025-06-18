package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;

import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static lippia.web.constants.LoginConstants.*;

public class LoginService {

    public static void enterUsername(String username) {
        WebActionManager.setInput(LoginConstants.USERNAME_INPUT, username);
    }

    public static void enterPassword(String password) {
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT, password);
    }

    public static void clickLoginButton() {
        WebActionManager.waitClickable(LOGIN_BUTTON);
        CommonService.scrollIntoView(LOGIN_BUTTON);
        WebActionManager.click(LOGIN_BUTTON);
    }

    public static void checkLoginErrorMessage(String errorMessage) {
        String actualMessage = WebActionManager.getText(LOGIN_ERROR_MESSAGE);
        Assert.assertEquals(actualMessage, errorMessage, "The error message does not match.");
    }

    public static void enterCaseChangedUsername(String usernameCaseChanged) {
        WebActionManager.setInput(USERNAME_INPUT, usernameCaseChanged);
    }

    public static void enterCaseChangedPassword(String passwordCaseChanged) {
        WebActionManager.setInput(PASSWORD_INPUT, passwordCaseChanged);
    }

    public static void checkLoginFail() {
        Assert.assertTrue(
                WebActionManager.isVisible(PASSWORD_INCORRECT_MESSAGE),
                "Expected error message 'is incorrect' is not visible."
        );
    }
}