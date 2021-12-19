package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDeleter {
    private final WebDriver driver;

    private final By delete = By.id("btnDelete");
    private final By ok = By.id("dialogDeleteBtn");
    private final By checkboxSelectAll = By.id("ohrmList_chkSelectAll");

    public UserDeleter(WebDriver webDriver) {
        this.driver = webDriver;
    }


    public void deleteUsers()
    {
        driver.findElement(checkboxSelectAll).click();
        driver.findElement(delete).click();
        driver.findElement(ok).click();
    }

}
