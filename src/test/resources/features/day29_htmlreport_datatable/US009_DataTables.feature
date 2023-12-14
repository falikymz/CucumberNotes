@US009
Feature: US009 Google Testi

  Scenario: TC01 Google sayfasinda arama yapilir
    Given Kullanici "https://google.com" sayfasina gider
    When  Kullanici verilen bilgiler ile arama yapar
      | volkswagen |
      | honda      |
      | audi       |
    And  Sayfayi kapatir


  Scenario: TC02 Google sayfasinda arama yapilir
    Given Kullanici "https://google.com" sayfasina gider
    When  Kullanici verilen bilgiler ile arama yapar ikinci yol
      | volkswagen |
      | honda      |
      | audi       |
    And  Sayfayi kapatir