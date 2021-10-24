package com.first.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LearnSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anmol\\IdeaProjects\\first-selenium-project\\lib\\webdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String baseURL="https://www.facebook.com/reg/";
        driver.get(baseURL);

        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("anmol");

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("patel");

        WebElement mobileemailelement= driver.findElement(By.name("reg_email__"));
        mobileemailelement.sendKeys("8884089613");

        WebElement newpassword= driver.findElement(By.id("password_step_input"));
        newpassword.sendKeys("anmol1");

        WebElement day=driver.findElement(By.name("birthday_day"));
        Select dayselect = new Select(day);
        dayselect.selectByVisibleText("16");

        WebElement monthe = driver.findElement(By.name("birthday_month"));
        Select montheselect = new Select(monthe);
        montheselect.selectByVisibleText("Jan");

        WebElement year=driver.findElement(By.name("birthday_year"));
        Select yearSelect = new Select(year);
        yearSelect .selectByVisibleText("2006");

        WebElement male = driver.findElement(By.className("_58mt"));
        male.click();





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anmol\\IdeaProjects\\first-selenium-project\\lib\\webdrivers\\chromedriver.exe");
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("----incognito");
//        WebDriver driver=new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
//        System.out.println(driver.getTitle());
//
//      // enter username
//        WebElement username=driver.findElement(By.name("txtUsername"));
//        username.sendKeys("Admin");
//     // entre password
//        WebElement firstname=driver.findElement(By.name("txtPassword"));
//        firstname.sendKeys("Admin123");
//     //  login
//        WebElement login = driver.findElement(By.name("Submit"));
//        login.click();
//
//
//    //   check user status
//        WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
//        admin.click();
//
//        WebElement username1=driver.findElement(By.name("searchSystemUser[userName]"));
//        username1.sendKeys("Anthony.Nolan");
//
//        WebElement userrole=driver.findElement(By.name("searchSystemUser[userType]"));
//        Select dayselect = new Select(userrole);
//        dayselect.selectByVisibleText("ESS");
//
//        WebElement Employeename=driver.findElement(By.name("searchSystemUser[employeeName][empName]"));
//        Employeename.sendKeys("Anthony.Nolan");
//
//        WebElement Status=driver.findElement(By.name("searchSystemUser[status]"));
//        Select dayselect1 = new Select(Status);
//        dayselect1.selectByVisibleText("Disabled");
//
//        WebElement search = driver.findElement(By.id("searchBtn"));
//        search.click();
////        add item
//
////        WebElement additem= driver.findElement(By.id("btnAdd"));
////        additem.click();
////
////        WebElement userrole1=driver.findElement(By.id("systemUser_userType"));
////        Select dayselect2 = new Select(userrole);
////        dayselect2.selectByVisibleText("ESS");
////
////        WebElement name1=driver.findElement(By.name("systemUser[employeeName][empName]"));
////        name1.sendKeys("Sri E");
////
////        WebElement usernames=driver.findElement(By.name("systemUser[userName]"));
////        usernames.sendKeys("Anmolrr");
////
////        WebElement Status1=driver.findElement(By.name("searchSystemUser[status]"));
////        Select Status2 = new Select(Status1);
////        Status2.selectByVisibleText("Disabled");
////
////        WebElement password=driver.findElement(By.name("systemUser[password]"));
////        password.sendKeys("anmolpatel");
////
////        WebElement passwords=driver.findElement(By.name("systemUser[confirmPassword]"));
////        passwords.sendKeys("anmolpatel");
////
////        WebElement save= driver.findElement(By.id("btnSave"));
////        save.click();
//
////        dicrecotrey
//        WebElement dicretory = driver.findElement(By.id("menu_directory_viewDirectory"));
//        dicretory.click();
//        WebElement dirname=driver.findElement(By.name("searchDirectory[emp_name][empName]"));
//        dirname.sendKeys("Atoullo Boboev");
//        WebElement dirsearch=driver.findElement(By.name("searchDirectory[emp_name][empName]"));
//
//
//
//





    }
}
