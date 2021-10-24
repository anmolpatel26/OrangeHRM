package com.first.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anmol\\IdeaProjects\\first-selenium-project\\lib\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL="https://opensource-demo.orangehrmlive.com/";
        driver.get(baseURL);

        WebElement mobileemailelement= driver.findElement(By.name("txtUsername"));
        mobileemailelement.sendKeys("Admin");

        WebElement newpassword= driver.findElement(By.name("txtPassword"));
        newpassword.sendKeys("admin123");

        WebElement login= driver.findElement(By.name("Submit"));
        login.click();





    }

    }
