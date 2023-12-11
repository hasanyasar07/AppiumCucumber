package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPages;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class AileButcemStepDefinations {

    AileButcemPages aileButcemPages=new AileButcemPages();
    @Given("Kullanici driver kurulumlarini yaparak cihaz baglantisini kurar")
    public void Kullanici_driver_kurulumlarini_yaparak_cihaz_baglantisini_kurar() {
        Driver.getAndroidDriver();

    }

    @Given("ilk ekran ayarlarini yapin ve {string} ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String girisYap) throws InterruptedException {
        // 968,1081
        //139,1081
        aileButcemPages.loginMethodu();
        ReusableMethods.scrollWithUiScrollable(girisYap);

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String password) {
        aileButcemPages.eMailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPages.passwordBox.sendKeys(ConfigReader.getProperty(password));
        aileButcemPages.girisYapButton.click();

    }
    @Given("uygulamaya {int} kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin(int bekle) throws InterruptedException {
        Thread.sleep(bekle);
        Assert.assertTrue(aileButcemPages.loginCheck.isDisplayed());

    }
    @Given("sol kisimdaki {int} menuden hesabim bolumune {int} {int} {int} gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(int dogrulama,int x,int y,int bekle) throws InterruptedException {
        Thread.sleep(dogrulama);
        ReusableMethods.tiklamaMethodu(x,y,bekle);
        aileButcemPages.hesabim.click();


    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {int} {int} {int} {int} {int} {string} degisikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String adi,String soyadi,String sehir,int x,int y,int bekle,int y2,int yas,String alan) throws InterruptedException {

       aileButcemPages.kullaniciBilgileriDegistirmeMethodu(adi,soyadi,sehir,yas,alan,x,y,bekle,y2);
       aileButcemPages.kullaniciBilgileriAssertion(adi,soyadi,sehir,yas,alan);
    }


    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {

    }

}
