package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;
import utils.Driver;

import java.time.Duration;

public class OBiletBrowserPage {
    public OBiletBrowserPage(){
        PageFactory.initElements(new AppiumFieldDecorator(BrowserDriver.getBrowserDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//button[@data-event-label='Menu Opened']")
    public WebElement menuButton;

    @FindBy (xpath = "//a[@class='language']")
    public WebElement languageBar;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement turkishLanguage;

    @FindBy (xpath = "//a[@class='currency']")
    public WebElement currencyBar;

    @FindBy (xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement turkishLira;

    @FindBy(xpath = "//button[text()=' Otobüs Bileti Bul']")
    public WebElement findTicket;
}
