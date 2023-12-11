@test
Feature:  Kulanici aile butcem ile ilgili gorevleri tamamlar

  Background: Kullanicilar siteye giris yapmak icin bu adimlari kullanirlar
    *  Kullanici driver kurulumlarini yaparak cihaz baglantisini kurar
    *  ilk ekran ayarlarini yapin ve "Giriş Yap" ardindan login sayfasina ulasin
    *  "mail" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
    *  uygulamaya 1000 kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario: kullanici ilgili test case ile verilen gorevlerini yerine getirir
  *  sol kisimdaki 5000 menuden hesabim bolumune 103 125 1000 gidin
  *  hesabim sayfasindaki bilgileri degistirerek "Hasan" "YAŞAR" "ANTALYA" 500 1226 2000 1340 37 "Tester" degisikleri dogrulayin
  *  kullanici uygulamayi kapatir

    Scenario Outline: Kullanici iligili test case ile verilen gorevlerini yerine getirir
      *  sol kisimdaki 5000 menuden hesabim bolumune 103 125 1000 gidin
      *  hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" <x> <y> <bekle> <y2> <yas> "<meslek>" degisikleri dogrulayin
      *  kullanici uygulamayi kapatir
      Examples:
        | isim | soyisim | sehir | x | y | bekle | y2 | yas | meslek |
        |Hasan |YAŞAR    |ANTALYA|500|1226|2000  |1340|37   |Tester  |
        |Ahmet |Bulut    |MALATYA|500|1226|2000  |1340|51   |Öğretmen|
        |Murat |Babayiğit|ANKARA|500|1226|2000  |1340|43   |Tester|
        |Salih |Öz    |EDİRNE|500|1226|2000  |1340|60   |MUHENDİS|

