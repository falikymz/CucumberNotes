@US012
  Feature: US012 BlueRentalCar sayfasında excel dosyası ile login işlemi
    Scenario: TC01 Exceldeki email ve password bilgiler ile login olunur
      Given Kullanici blueRentalCar sayfasina gider
      When login butonuna tiklar
      And exceldeki "admin_info" sayfasındaki  kullanici bilgileri ile login olur
      And Sayfayi kapatir