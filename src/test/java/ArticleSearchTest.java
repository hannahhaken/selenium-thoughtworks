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

    @Test
    public void shouldHaveTechnologyRadarAsFirstTileOnHomepage() {
        /*
            On www.thoughtworks.com homepage there is a series of tiles.
             This test should confirm that the first tile (top left) is the technology radar.
             This is important as it's they want to promote this the most right now.
         */

    }

    @Test
    public void shouldBeAbleToSignUpForTheThoughtWorksNewsLetter() {
        /*
            On www.thoughtworks.com homepage on the footer there is a field to sign up for a newsletter.
             Confirm that you can sign up for the news letter.
             Hint 1: use a fake email address
             Hint 2: When you sign up for the news letter text appears below the textbox saying 'Thank you for signing up to our monthly perspectives newsletter.'
         */
    }

    @Test
    public void shouldNavigateToTheNewsSectionWhenClickingMoreNewsOnTheHomePage() {
        /*
            On www.thoughtworks.com homepage there is a news section with a button with the text 'More news'.
            If you click it verify that you are redirected to the news section
         */
    }

    @Test
    public void shouldBeAbleToCompleteTheContactUsFormOnTheContactUsPage() {
        /*
            On www.thoughtworks.com homepage there is a Contact Us button in the header of the page
            If you click it and navigate to the Contact Us Page you will be presented with a form.
            You need to fill in the form with some fake details and confirm the message was sent successfully
         */
    }
}
