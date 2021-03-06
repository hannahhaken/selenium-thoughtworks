package haken;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        // Create a chrome driver to drive the browser
        WebDriver driver = new ChromeDriver();

        // Open Thoughtworks page
        driver.get("http://www.thoughtworks.com");

        // Find the search field and type "Darren Haken"
        driver.findElement(By.id("search-bar-input")).sendKeys("Darren Haken");

        // Find search button and click on it
        driver.findElement(By.className("icon-search")).click();

        // Get the title of the search results page and article title
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.className("search-result__title")));

//        WebElement element = driver.findElement(By.tagName("h1"));

//        System.out.println(element.getAttribute("class"));
//        System.out.println(element.getText());
//        driver.quit();
    }
}
