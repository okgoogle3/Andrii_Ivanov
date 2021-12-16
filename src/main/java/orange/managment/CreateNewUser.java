package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class CreateNewUser {
    private WebDriver driver;

    private By add = By.id("btnAdd");
    private By employeeName = By.id("systemUser_employeeName_empName");
    private By username = By.id("systemUser_userName");
    private By password = By.id("systemUser_password");
    private By confPassword = By.id("systemUser_confirmPassword");
    private By save = By.id("btnSave");

    public CreateNewUser(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void creatingUser(String user) throws InterruptedException {
        driver.findElement(add).click();
        driver.findElement(employeeName).sendKeys("Cassidy Hope");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys("Aa123456789011");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(confPassword).sendKeys("Aa123456789011");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(save).click();
    }
}
