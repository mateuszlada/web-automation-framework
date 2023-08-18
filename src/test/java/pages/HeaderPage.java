package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {
    private final SelenideElement cartLink = $(byClassName("shopping_cart_link"));
    private final SelenideElement cartItemsLabel = $(byClassName("shopping_cart_badge"));

    public int getNumberOfItemsInCart() {
        return Integer.valueOf(cartItemsLabel.getText());
    }

    public CartPage openCart() {
        cartLink.click();
        return new CartPage();
    }
}
