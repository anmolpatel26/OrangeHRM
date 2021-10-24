package com.first.seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import java.util.Arrays;
public class OrangeHRM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anmol\\IdeaProjects\\first-selenium-project\\lib\\webdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         LoginTestCase loginTestCase = new LoginTestCase(driver);
         loginTestCase.loginTestCaseWhenBothIdNull();
         loginTestCase.loginTestCaseWhenPassIsNull();
         loginTestCase.loginTestCaseWhenPassIncorrect();
         loginTestCase.loginsuccesful();
         AdminTestCase adminTestCase =new AdminTestCase(driver);
         adminTestCase.adminUserDataFound();
         adminTestCase.adminUserDataNotFound ();


    }
}
