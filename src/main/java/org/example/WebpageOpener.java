package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class WebpageOpener {
    static WebDriver driver;
    static String email = "";
    static String password = "";
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

        //json
        jsonCredentials();

        // Selenium
        selenium();
    }

    public static void jsonCredentials(){
        try {
            // Locate the json file
            File jsonFile = new File("C:\\temp\\ltu.json");
            ObjectMapper objectMapper = new ObjectMapper();
            // Read the json file
            JsonNode jsonNode = objectMapper.readTree(jsonFile);

            // Get the email and password from the json file
            email = jsonNode.get("ltuCredentials").get("email").asText();
            password = jsonNode.get("ltuCredentials").get("password").asText();
        } catch (IOException e) {
            System.out.println(e);
        }
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
