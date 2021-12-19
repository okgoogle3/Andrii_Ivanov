package orange.managment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transitor {
    private final WebDriver driver;
    private final By admin = By.id("menu_admin_viewAdminModule");
    private final By userManagement = By.id("menu_admin_UserManagement");
    private final By users = By.id("menu_admin_viewSystemUsers");

    public Transitor(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void goToUser() {

        driver.findElement(admin).click();
        driver.findElement(userManagement).click();
        driver.findElement(users).click();
    }

}
