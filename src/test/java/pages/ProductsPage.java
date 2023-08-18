package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {
    private final SelenideElement pageTitle = $(byClassName("title"));
    private final ElementsCollection addToCartButtons = $$(byXpath("//button[contains(@class, 'btn_inventory')]"));

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void addToCartItemByIndex(int index) {
        addToCartButtons.get(index).click();
    }

}
