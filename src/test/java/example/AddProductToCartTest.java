package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HeaderPage;
import pages.LoginPage;
import pages.ProductsPage;

import static constants.Properties.PASSWORD;
import static constants.Properties.USERNAME;

public class AddProductToCartTest extends AbstractTest {
    @Test
    void when_addProductToCart_then_ProductIsDisplayedInCart() {
        ProductsPage productsPage = new LoginPage().login(USERNAME, PASSWORD);
        productsPage.addToCartItemByIndex(0);

        HeaderPage headerPage = new HeaderPage();
        Assertions.assertEquals(headerPage.getNumberOfItemsInCart(), 1);

        CartPage cartPage = headerPage.openCart();
        Assertions.assertEquals(cartPage.getPageTitle(), "Your Cart");
        Assertions.assertEquals(cartPage.getNumberOfItems(), 1);
    }
}
