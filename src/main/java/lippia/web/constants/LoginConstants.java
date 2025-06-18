package lippia.web.constants;

public class LoginConstants {

    public static final String USERNAME_INPUT = "xpath://input[@id='username']";
    public static final String PASSWORD_INPUT = "xpath://input[@id='password']";
    public static final String LOGIN_BUTTON = "xpath://input[contains(@class,'woocommerce-Button') and @name='login']";
    public static final String LOGIN_ERROR_MESSAGE = "xpath://li[contains(text(), 'Password is required')]";
    public static final String PASSWORD_INCORRECT_MESSAGE = "xpath://ul[contains(@class, 'woocommerce-error')]/li[contains(., 'is incorrect')]";
}
