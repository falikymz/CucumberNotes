@US001
Feature: US001 Amazon Home Page Test
  Scenario: TC01 Arama kutusunda iphone aratilir
    Given Kullanici amazon sayfasina gider
    When  Arama kutusunda iphone aratir
    And Sayfayi kapatir

  Scenario: TC01 Arama kutusunda samsung aratilir
    Given Kullanici amazon sayfasina gider
    When  Arama kutusunda samsung aratir
    And Sayfayi kapatir