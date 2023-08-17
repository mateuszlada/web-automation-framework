package example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static constants.Properties.BASE_URL;

public class SimpleTest extends AbstractTest {
    @Test
    void simpleTest() {
        WebDriver driver = new ChromeDriver();

        driver.get(BASE_URL);
        //Accept cookies
        //driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        //Search testing jobs in Poland
        driver.findElement(By.id("new_form_job_search-keyword")).sendKeys("testing");
        driver.findElement(By.id("new_form_job_search-location")).click();

        driver.findElement(By.name("Find")).click();
        driver.quit();


    }
}
