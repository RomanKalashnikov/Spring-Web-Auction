# Spring-Web-Auction
Веб приложение Аукцион.<br>
======================================
Написано для знакоства с такими технологиями и библиотеками как :<br>
------------
* Spring Boot<br>
* Hibernate<br>
* Lombok<br>
* Mapstruct<br>
* sl4j<br>
* jUnit<br>
* h2<br>
<br>
Приложение принимает HTTP-запросы контроллером в формате .json, в теле которого содержатся  поля и значения, далее "маппит" данные <br>
в необходимый приложению  формат и передаёт их БД. В качестве БД используется "h2" создаваемая каждый раз при старте приложения в оперативной памяти.<br>
 
 ***После развёртывания, приложение принимает get и post запросы , например через программу "Postman".***
 Например:<br>
 Для создания пользователя необходимо отправить POST запрос по адресу "localhost:8080/users" и телом 
 где указазываются его Имя, адрес и возраст.<br>
 {<br>
    "name" : "West",<br>
    "address" : "Moskow",<br>
    "age" : 23<br>
}<br>
Для создания предмета лота необходимо отправить POST запрос по адресу "localhost:8080/items" и телом 
где указываются id User'a, название предмета, обьявленная цена, дата начала торгов и длительность (в днях) торгов<br>
{
    "sellerId": 1,
    "name" : "asdawd",
    "initPrice" : 100,
    "biddingStartTime" : "2020-07-01 12:12:20",
    "biddingPeriod" : 5
   
}
Для произведения ставки предмета лота необходимо отправить POST запрос по адресу "localhost:8080/bets" и телом 
где указывается сумма ставки и id Item'a<br>
{
    "amount" : 200,
    "itemId" : 2
}
Для получения всего списка  User'ов необходимо отправить GET запрос по адресу "localhost:8080/users"  <br>

Приложение находится в стадии разработки для дальнейшего изучения Spring и jUnit.<br>