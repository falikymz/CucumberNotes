#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli

#TEST DATA
#url : https://www.bluerentalcars.com/
#Managers:
#| ayhancan@bluerentalcars.com   | ayhan    |
#| beyhancan@bluerentalcars.com  | beyhan   |
#| sam.walker@bluerentalcars.com | sami     |
#| john_doe@gmail.com            | johndoe  |
#| johnson@bluerentalcars.com    | johnson  |
@US007
Feature: US-07 BlueRentalCar login islemi

  Scenario Outline: TC-01 kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given Kullanici "https://www.bluerentalcars.com/" sayfasina gider
    When login butonuna tiklar
    And Kullanici "<email>" ve "<password>" bilgilerini girer
    And Kullanici 3 saniye bekler
    Then Login oldugunu dogrular
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir
    Examples:
      | email                         | password |
      | ayhancan@bluerentalcars.com   | ayhan    |
      | beyhancan@bluerentalcars.com  | beyhan   |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |