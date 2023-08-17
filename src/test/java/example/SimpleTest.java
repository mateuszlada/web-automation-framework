package example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.GooglePage;
import pages.SearchResultsPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTest extends AbstractTest {
    @Test
    void simpleTest() {
        open("https://duckduckgo.com");
        new GooglePage().searchFor("selenide java");

        SearchResultsPage results = new SearchResultsPage();
        results.checkResultsSizeIsAtLeast(1);
        results.checkResultHasTest(0, "Selenide: concise UI tests in Java");
    }
}
