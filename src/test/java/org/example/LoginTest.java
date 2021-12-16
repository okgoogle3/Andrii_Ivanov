package org.example;

import orange.auth.*;
import orange.managment.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static WebDriver driver;
    private static Login login;
    private static Transitor transitor;
    private static CreateNewUser newUser;
    private static UserFinder userFinder;
    private static UserDeleter userDeleter;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\halal\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        transitor = new Transitor(driver);
        newUser = new CreateNewUser(driver);
        userFinder = new UserFinder(driver);
        userDeleter = new UserDeleter(driver);

    }
    @AfterClass
    public static void close(){
        driver.close();
    }
    @Test
    public void testSignIn() throws InterruptedException {
        WebElement element;
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        login.signIn("Admin", "admin123");
        transitor.goToUser();
        newUser.creatingUser("halalah");
        transitor.goToUser();
        element = userFinder.find("halalah");
        if (element == null)
        {
            Assert.fail("This record doesn't exists");
        }
        userDeleter.deleteUser("halalah");

    }
}
