package com.first.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTrial {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anmol\\IdeaProjects\\first-selenium-project\\lib\\webdrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "https://www.google.com/search?client=firefox-b-d&q=google";
        driver.get(baseURL);
    }
}
