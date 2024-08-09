package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
    protected static WebDriver driver;
    public static void setDriver(WebDriver wd) {
        driver = wd;
    }

    @FindBy(xpath = "//i[@class='fa fa-facebook']/..")
    WebElement btnFacebookHeader;

}
