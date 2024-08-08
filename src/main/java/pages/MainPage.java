package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



}
