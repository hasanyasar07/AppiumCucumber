package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPages {
    public AileButcemPages(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }


    public void loginMethodu() throws InterruptedException {
        Thread.sleep(5000);
        for (int i=0;i<6;i++){

            ReusableMethods.screenScroolMethod(968,1081,1000,139,1081,0);

        }

    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement eMailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButton;

    @FindBy(xpath = "//*[@text='Bütçem']")
    public MobileElement loginCheck;

    @FindBy(xpath = "//*[@text='Hesabım']")
    public MobileElement hesabim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement adi;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyadi;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehir;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yas;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement alan;


    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydet;

    public void hesabimBoxesClearMethod(){
        adi.clear();
        soyadi.clear();
        sehir.clear();
        yas.clear();
        alan.clear();
    }

    public void kullaniciBilgileriDegistirmeMethodu(String name,String surname, String city,int age,String job,int x,int y,int bekle,int y2) throws InterruptedException {
    hesabimBoxesClearMethod();
        hesabimBoxesClearMethod();
        adi.sendKeys(name);
        soyadi.sendKeys(surname);
        sehir.sendKeys(city);
        // cinsiyet seçme
        ReusableMethods.tiklamaMethodu(x,y,bekle);
        ReusableMethods.tiklamaMethodu(x,y2,bekle);
        yas.sendKeys(age+"");
        alan.sendKeys(job);
        kaydet.click();

    }

    public void kullaniciBilgileriAssertion(String name,String surname, String city,int age,String job){
        Assert.assertTrue(adi.getText().contains(name));
        Assert.assertTrue(soyadi.getText().contains(surname));
        Assert.assertTrue(sehir.getText().contains(city));
        Assert.assertTrue(yas.getText().contains(age+""));
        Assert.assertTrue(alan.getText().contains(job));

    }






}
