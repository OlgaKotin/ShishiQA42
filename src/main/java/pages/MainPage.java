package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'События')]")
    WebElement eventsTopMenuItem;
    @FindBy(xpath = "//a[contains(text(),'Фото')]")
    WebElement photoTopMenuItem;
    @FindBy(xpath = "//a[contains(text(),'Видео')]")
    WebElement videoTopMenuItem;
    @FindBy(xpath = "//a[contains(text(),'О нас')]")
    WebElement aboutTopMenuItem;
    @FindBy(xpath = "//a[contains(text(),'Контакты')]")
    WebElement contactsTopMenuItem;

    public MainPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://t.shishi.co.il/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20), this);
    }

}
