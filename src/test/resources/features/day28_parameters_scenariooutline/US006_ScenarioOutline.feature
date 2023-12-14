@US006
Feature: US006 Google Testi

  Scenario Outline: TC01 Google sayfasında arama kutusunda araç aratılır
    Given Kullanici "https://google.com" sayfasina gider
    When Google arama kutusunda "<araclar>" aratir
    Then Sayfa basliginin "<araclar>" icerdigini test eder
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir
    Examples:
      | araclar     |
      | Honda       |
      | audi        |
      | mercedes    |
      | lamborghini |

