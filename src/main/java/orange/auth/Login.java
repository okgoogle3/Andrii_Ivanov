package orange.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
    private WebDriver driver;
    private By password = By.name("txtPassword");
    private By submit = By.name("Submit");
    private By userName = By.name("txtUsername");


    public Login(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void signIn(String username1, String password1) {
        driver.findElement(userName).sendKeys(username1);
        driver.findElement(password).sendKeys(password1);
        driver.findElement(submit).click();
    }
}