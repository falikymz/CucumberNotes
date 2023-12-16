@US002
Feature:US002 BlueRentalCar Test
  Scenario: TC01 Verilen email ve password ile login olunur
    Given Kullanici blueRentalCar sayfasina gider
    When  login butonuna tiklar
    And Email ve password bilgileri ile login olur
    And Sayfayi kapatir

