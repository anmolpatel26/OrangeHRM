package com.first.seleniumproject;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTestCase {
    String baseURL="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    WebDriver driver;

    public LoginTestCase(WebDriver a){
        driver = a;
    }

    public void loginTestCaseWhenBothIdNull(){
        driver.get(baseURL);
        WebElement username=driver.findElement(By.name("txtUsername"));
        username.sendKeys("");
        WebElement firstname=driver.findElement(By.name("txtPassword"));
        firstname.sendKeys("");
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();
        String expectedMessage = "Username cannot be empty";
        WebElement webElement = driver.findElement(By.id("spanMessage"));
        String actualMessage = webElement.getText();
        Assert.assertEquals(actualMessage, expectedMessage );
    }
    public void loginTestCaseWhenPassIsNull(){
        System.out.println(baseURL);
        WebElement username=driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement firstname=driver.findElement(By.name("txtPassword"));
        firstname.sendKeys("admin1234");
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();
        String expectedMessage = "Password cannot be empty";
        WebElement webElement = driver.findElement(By.id("spanMessage"));
        String actualMessage = webElement.getText();
        System.out.println(actualMessage);
    }
    public void loginTestCaseWhenPassIncorrect(){
        System.out.println(baseURL);
        WebElement username=driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement firstname=driver.findElement(By.name("txtPassword"));
        firstname.sendKeys("admin1234");
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();
        String expectedMessage = "Invalid credentials";
        WebElement webElement = driver.findElement(By.id("spanMessage"));
        String actualMessage = webElement.getText();
        System.out.println(actualMessage);
    }
    public void loginsuccesful(){
        System.out.println(baseURL);
        WebElement username=driver.findElement(By.name("txtUsername"));
        username.sendKeys("Admin");
        WebElement firstname=driver.findElement(By.name("txtPassword"));
        firstname.sendKeys("admin123");
        WebElement login = driver.findElement(By.name("Submit"));
        login.click();
    }
    }
