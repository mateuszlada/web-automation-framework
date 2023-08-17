package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {
    private SelenideElement searchField = $(byName("q"));

    public void searchFor(String text) {
        searchField.val(text).pressEnter();
    }
}
