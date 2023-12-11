package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.OBiletBrowserPage;
import utils.BrowserDriver;

public class BrowserClass {

    @Given("Kullanici browserDriver ayarlari yaparak browseri acar")
    public void kullanici_browser_driver_ayarlari_yaparak_browseri_acar() {
        BrowserDriver.getBrowserDriver();

    }
    @Given("Kullanici google a gider")
    public void kullanici_google_a_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.google.com");

    }


    OBiletBrowserPage oBiletBrowserPage=new OBiletBrowserPage();
    @Given("{string} sayfasina gidilir")
    public void https_www_obilet_com_en_sayfasina_gidilir(String url) {
        BrowserDriver.getBrowserDriver();
        BrowserDriver.getBrowserDriver().get(url);

    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
    oBiletBrowserPage.menuButton.click();
    oBiletBrowserPage.languageBar.click();
    oBiletBrowserPage.turkishLanguage.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {
    oBiletBrowserPage.menuButton.click();
    oBiletBrowserPage.currencyBar.click();
    oBiletBrowserPage.turkishLira.click();



    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
        oBiletBrowserPage.findTicket.click();
        

    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulan")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulan() {

    }

}
