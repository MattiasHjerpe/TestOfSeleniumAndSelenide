package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageOpener {
    static WebDriver driver;
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://www.ltu.se");

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
