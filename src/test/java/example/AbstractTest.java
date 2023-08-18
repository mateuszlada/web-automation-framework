package example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static constants.Properties.BASE_URL;

public abstract class AbstractTest {
    @BeforeAll
    public static void abstractSetUp() {
        open(BASE_URL);
    }

    @AfterAll
    public static void abstractAfterAll() {
        closeWebDriver();
    }
}