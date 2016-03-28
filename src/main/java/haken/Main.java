package haken;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.thoughtworks.com");

        WebElement element = webDriver.findElement(By.tagName("h1"));

        System.out.println(element.getAttribute("class"));
        System.out.println(element.getText());
//        webDriver.quit();
    }
}
