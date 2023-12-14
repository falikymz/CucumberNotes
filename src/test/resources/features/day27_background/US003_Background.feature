#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

#  Eger feature file da kullanacagimiz scenario larda ortak adimlar var ise
#  Feature: keywordundan sonra Background keywordu ile ortak adimlari belirtebiliriz
#  @BeforeMethod mantığı gibi çalışır

@US003
Feature: US003

  Background:
    Given Kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When Arama kutusunda iphone aratir
    And Sayfayi kapatir

  @samsung
  Scenario: TC02 arama kutusunda samsung aratilir
    When Arama kutusunda samsung aratir
    And Sayfayi kapatir

    @nokia
  Scenario: TC03 arama kutusunda nokia aratilir
    When Arama kutusunda nokia aratir
    And Sayfayi kapatir