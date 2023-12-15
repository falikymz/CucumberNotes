@US011
  Feature: US011 Google Testi hooks
    Scenario: TC01 Google sayfasında arama kutusunda araç aratılır
      Given Kullanici "https://google.com" sayfasina gider
      When Google arama kutusunda "ford" aratir
      Then Sayfa basliginin "ford" icerdigini test eder
      And Kullanici 2 saniye bekler
      And Sayfayi kapatir

      @honda
    Scenario: TC02 Google sayfasında arama kutusunda araç aratılır
      Given Kullanici "https://google.com" sayfasina gider
      When Google arama kutusunda "honda" aratir
      Then Sayfa basliginin "hondaa" icerdigini test eder
      And Kullanici 2 saniye bekler
      And Sayfayi kapatir

        @audi
    Scenario: TC03 Google sayfasında arama kutusunda araç aratılır
      Given Kullanici "https://google.com" sayfasina gider
      When Google arama kutusunda "audi" aratir
      Then Sayfa basliginin "audi" icerdigini test eder
      And Kullanici 2 saniye bekler
      And Sayfayi kapatir