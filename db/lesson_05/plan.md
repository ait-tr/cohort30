# Lesson plan No. 5 03/20/2024

1. What we learned in the last lesson:
- installed Compass - a thin GUI client for accessing the cloud DBMS
  https://www.mongodb.com/products/tools/compass

- created a personal account in the Atlas cloud service, received a personal cloud DBMS MongoDB
  https://www.mongodb.com/

- connected to it using Compass and VS Code

- started working with records in the database.

2. Homework:

   Explore articles:
   https://skillbox.ru/media/code/mongodb-chto-eto-za-subd-plyusy-minusy-podvodnye-kamni/

   https://habr.com/ru/companies/latera/articles/280196/

Questions:
- what applications was MongoDB developed for?
  in 2005, gaming applications, payment systems, social networks (posts, comments)

- For which applications is it beneficial to use MongoDB or analogues?
  logging, social networks, telecom, Internet of things

- what are the main advantages of a document-oriented DBMS?
  flexibility, fast processing, scaling, speed of deployment and software writing, simplicity

- what is ACID and why is it needed? Is MongoDB ACID compliant?
    - ACID is a set of requirements that ensure data safety (!!!)
    - MongoDB does not meet the full set of these requirements

- What is MongoDB bad at? What's good with?
    - good - read and write, bad - with large data, no connections, data cannot be combined

- in what format is data stored in MongoDB?
    - BJSON

- what is the maximum document size?
    - 16Mb

- For which applications is it beneficial to use RDBMS?
    - banking applications, strict archives, accounting, medical applications, insurance, logistics, CMS for websites

3. Plan for today's lesson:

- perform operations with data in the MongoDB DBMS

-----------------------------------------------------------

# План занятия №5 20.03.2024

1. Что мы изучили на прошлом занятии:
- установили Compass - тонкий GUI-клиент для доступа к облачной СУБД
  https://www.mongodb.com/products/tools/compass

- создали личный аккаунт в облачном сервисе Atlas, получили личную облачную СУБД MongoDB
  https://www.mongodb.com/ 

- подключились к ней с помощью Compass и VS Code

- начали работать с записями в БД.


2. Домашнее задание:

   Изучить статьи:
   https://skillbox.ru/media/code/mongodb-chto-eto-za-subd-plyusy-minusy-podvodnye-kamni/

   https://habr.com/ru/companies/latera/articles/280196/

Вопросы:
- для каких приложений разрабатывалась MongoDB?
   в 2005, игровые приложения, платежные системы, социальные сети (посты, комменты)

- для каких приложений выгодно использовать MongoDB или аналоги?
   логирование, соц.сети, телеком, Интернет-вещей

- какие главные преимущества у документоориентированой СУБД?
  гибкость, быстрая обработка, масштабирование, скорость развертывания и написания ПО, простота

- что такое ACID и для чего это нужно? Соответствует ли MongoDB требованиям ACID?
  - ACID - это набор требований, которые обеспечивают сохранность данных(!!!)
  - MongoDB не соответствует полному набору этих требований

- с чем плохо справляется MongoDB? А с чем хорошо?
  - хорошо - чтение и запись, плохо - с большими данными, нет связей, нельзя объединять данные
  
- в каком формате хранятся данные в MongoDB?
  - BJSON
  
- каков максимальный размер документов?
  - 16Mb
  
- для каких приложений выгодно использовать RDBMS?
  - банковские приложения, строгие архивы, бухучет, медицинские приложения, страхование, логистика, CMS для сайтов

3. План на сегодняшнее занятие:
    
- выполняем операции с данными в СУБД MongoDB
