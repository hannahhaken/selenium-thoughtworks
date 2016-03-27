package haken;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://www.thoughtworks.com");

        String pageTitle = webDriver.getTitle();

        webDriver.close();
    }
}
