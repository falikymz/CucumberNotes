@US004
  Feature: US004 Amazon Testi
    Background:
      Given Kullanici "https://amazon.com" sayfasina gider

    Scenario: TC01 Arama kutusunda nokia aratilir
      And Arama kutusunda "nokia" aratir
      And Sayfayi kapatir

    Scenario: TC02 Arama kutusunda java aratilir
      And Arama kutusunda "java" aratir
      And Sayfayi kapatir

    Scenario: TC03 Arama kutusunda selenium aratilir
      And Arama kutusunda "selenium" aratir
      And Sayfayi kapatir






# Feature: file i daha dinamik hale getirebilmek için gitmek istediğimiz url i ya da aratmak
# istediğimiz ifadeyi ""(çift tırnak) içinde belirtebiliriz ,çünkü tırnak içinde yazdığımız değer artık
#  stepDefinition classında ki method artık bir parametreye dönüşür