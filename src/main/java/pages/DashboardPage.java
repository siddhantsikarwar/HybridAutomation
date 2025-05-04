package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private final By breadcrumb_header = By.className("oxd-topbar-header-breadcrumb");
    private final By user_DropDown = By.className("oxd-userdropdown");


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHeaderVisible() {
        return driver.findElement(breadcrumb_header).isDisplayed();
    }

    public String getHeaderText() {
        if (isHeaderVisible()) {
            return driver.findElement(breadcrumb_header).getText();
        } else {
            throw new RuntimeException("Bread Crumb Header element is not visible on the page");
        }
    }

    public String getDashboardPageUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isUserDropDownVisible() {
        return driver.findElement(user_DropDown).isDisplayed();
    }

    public String getDashboardPageTitle() {
        return driver.getTitle();
    }
}
