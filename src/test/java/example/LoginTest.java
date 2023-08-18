package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProductsPage;

import static constants.Properties.PASSWORD;
import static constants.Properties.USERNAME;

public class LoginTest extends AbstractTest {
    @Test
    void when_loginToPage_then_OpensProductsPage() {
        ProductsPage productsPage = new LoginPage().login(USERNAME, PASSWORD);

        Assertions.assertEquals(productsPage.getPageTitle(), "Products");
    }
}
