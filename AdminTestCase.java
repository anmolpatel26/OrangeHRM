package com.first.seleniumproject;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminTestCase {
    WebDriver driver;
    public AdminTestCase(WebDriver a){
        driver = a;
    }
    public void adminUserDataFound(){
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();

        WebElement username1=driver.findElement(By.name("searchSystemUser[userName]"));
        username1.sendKeys("Anthony.Nolan");

        WebElement userrole=driver.findElement(By.name("searchSystemUser[userType]"));
        Select dayselect = new Select(userrole);
        dayselect.selectByVisibleText("ESS");

        WebElement Employeename=driver.findElement(By.name("searchSystemUser[employeeName][empName]"));
        Employeename.sendKeys("Anthony.Nolan");

        WebElement Status=driver.findElement(By.name("searchSystemUser[status]"));
        Select dayselect1 = new Select(Status);
        dayselect1.selectByVisibleText("Enabled");

        WebElement search = driver.findElement(By.id("searchBtn"));
        search.click();

    }
    public void adminUserDataNotFound(){
        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admin.click();

        WebElement username1=driver.findElement(By.name("searchSystemUser[userName]"));
        username1.sendKeys("Anthony.Nolan");

        WebElement userrole=driver.findElement(By.name("searchSystemUser[userType]"));
        Select dayselect = new Select(userrole);
        dayselect.selectByVisibleText("CSS");

        WebElement Employeename=driver.findElement(By.name("searchSystemUser[employeeName][empName]"));
        Employeename.sendKeys("Aqnthony.Nolan");

        WebElement Status=driver.findElement(By.name("searchSystemUser[status]"));
        Select dayselect1 = new Select(Status);
        dayselect1.selectByVisibleText("Enabled");

        WebElement search = driver.findElement(By.id("searchBtn"));
        search.click();


    }
}
