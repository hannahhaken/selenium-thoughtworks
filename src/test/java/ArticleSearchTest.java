import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class ArticleSearchTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Create a chrome driver to drive the browser
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    /*
        3 stages inside a test (AAA)
        Arrange
        Act
        Assert
     */
    @Test
    public void shouldHaveCorrectPageTitle() {
        // Open Thoughtworks page
        driver.get("http://www.thoughtworks.com");

        assertEquals("Agile Development and Experience Design | ThoughtWorks", driver.getTitle());
    }

    @Test
    public void shouldHaveArticleRelatedToSearchTerm() {
        driver.get("http://www.thoughtworks.com");

        // Find the search field and type "Darren Haken"
        driver.findElement(By.id("search-bar-input")).sendKeys("Darren Haken");

        // Find search button and click on it
        driver.findElement(By.className("icon-search")).click();

        // Get the title of the search results page and article title
        WebElement searchResult = driver.findElement(By.className("search-result__title"));

        assertEquals("Moving to the Phoenix Server Pattern Part 3: Evolving a Recovery ...", searchResult.getText());
    }
}
