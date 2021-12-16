package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserDeleter {
    private WebDriver driver;

    private By delete = By.id("btnDelete");
    private UserFinder finder;
    private By ok = By.id("dialogDeleteBtn");
    private By checkboxSelectAll = By.id("ohrmList_chkSelectAll");

    public UserDeleter(WebDriver webDriver) {
        this.driver = webDriver;
        this.finder = new UserFinder(webDriver);
    }


    public void deleteUser(String username)
    {
        finder.find(username);

        driver.findElement(checkboxSelectAll).click();
        driver.findElement(delete).click();
        driver.findElement(ok).click();

    }

}
