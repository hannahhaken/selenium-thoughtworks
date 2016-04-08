import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class ArticleSearchTest {

    /*
        3 stages inside a test (AAA)
        Arrange
        Act
        Assert
     */

    @Test
    public void shouldHaveCorrectPageTitle() {
        // Create a chrome driver to drive the browser
        WebDriver driver = new ChromeDriver();

        // Open Thoughtworks page
        driver.get("http://www.thoughtworks.com");

        // Find the search field and type "Darren Haken"
        driver.findElement(By.id("search-bar-input")).sendKeys("Darren Haken");

        // Find search button and click on it
        driver.findElement(By.className("icon-search")).click();

        // Get the title of the search results page and article title
//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.className("search-result__title")));

        driver.quit();

        assertEquals("Search | ThoughtWorks", driver.getTitle());
    }

    @Test
    public void shouldHaveTechnologyRadarBannerOnTheHomePage() {

    }
}
