package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement usernameField = $(byId("user-name"));
    private final SelenideElement passwordField = $(byId("password"));
    private final SelenideElement loginButton = $(byId("login-button"));


    public ProductsPage login(String username, String password) {
        usernameField.val(username);
        passwordField.val(password);
        loginButton.click();

        return new ProductsPage();
    }
}
