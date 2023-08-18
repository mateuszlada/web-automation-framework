package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
    private final SelenideElement pageTitle = $(byClassName("title"));
    private final ElementsCollection items = $$(byClassName("inventory_item_name"));

    public String getPageTitle(){
        return pageTitle.getText();
    }

    public int getNumberOfItems(){
        return items.size();
    }
}
