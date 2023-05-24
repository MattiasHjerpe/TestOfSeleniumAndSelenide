package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebpageOpener {
    static WebDriver driver;
    public static void main(String[] args) {
        startUp();
    }

    public static void startUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Add argument to maximize the browser window

        // Create a new instance of the ChromeDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open a webpage
        driver.get("https://www.ltu.se");

        // Selenium
        selenium();
    }

    public static void selenium(){
        //By ID


        //By name


        //By class name


        //By tag name


        //By link text


        //By partial link text


        //By XPath


        //By CSS selector


    }

    public static void selenide(){
        //By ID


        //By name


        //By class name


        //By tag name


        //By link text


        //By partial link text


        //By XPath


        //By CSS selector


    }
}
