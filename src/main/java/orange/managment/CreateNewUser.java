package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class CreateNewUser {
    private final WebDriver driver;

    private final By add = By.id("btnAdd");
    private final By employeeName = By.id("systemUser_employeeName_empName");
    private final By username = By.id("systemUser_userName");
    private final By password = By.id("systemUser_password");
    private final By confPassword = By.id("systemUser_confirmPassword");
    private final By save = By.id("btnSave");

    public CreateNewUser(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void creatingUser(String user){
        driver.findElement(add).click();
        driver.findElement(employeeName).sendKeys("Cassidy Hope");
        driver.findElement(username).sendKeys(user);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(password).sendKeys("Aa123456789011");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(confPassword).sendKeys("Aa123456789011");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(save).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
