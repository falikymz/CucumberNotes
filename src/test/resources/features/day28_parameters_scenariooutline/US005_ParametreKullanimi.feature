@US005
Feature: US005 Google Testi

  Scenario: TC01 Google sayfasında arama kutusunda araç aratılır
    Given Kullanici "https://google.com" sayfasina gider
    When Google arama kutusunda "ford" aratir
    Then Sayfa basliginin "ford" icerdigini test eder
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC02 Google sayfasında arama kutusunda araç aratılır
    Given Kullanici "https://google.com" sayfasina gider
    When Google arama kutusunda "honda" aratir
    Then Sayfa basliginin "honda" icerdigini test eder
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir

  Scenario: TC03 Google sayfasında arama kutusunda araç aratılır
    Given Kullanici "https://google.com" sayfasina gider
    When Google arama kutusunda "audi" aratir
    Then Sayfa basliginin "audi" icerdigini test eder
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir