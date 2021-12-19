package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserFinder {
    private final WebDriver driver;
    private final By searchUser = By.id("searchSystemUser_userName");
    private final By searchBtn = By.id("searchBtn");

    public UserFinder(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebElement find(String user) {
        WebElement element;
        driver.findElement(searchUser).sendKeys(user);
        driver.findElement(searchBtn).click();
        try
        {
            element = driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]", user)));
        }
        catch (Exception e)
        {
            element = null;
        }

        return element;
    }
}
