1. What we learned in the last lesson:
- Client-server architecture and the place of the DBMS in it.
- Main functions of the DBMS:
  - ...
  - ...
  - ...
  - ...
  - ...
- CRUD concept and data aggregation:
  - CRUD
    - WITH - ...
      -R-...
      -U-...
      -D-...
  - aggregated data
    - ...
    - ...
    - ...

- SQL queries - practice:
  - select everything from the table

  - select by columns

  - select with condition

2. Are there any questions about homework?

3. Plan for today's lesson:
- connection to the database;
- creating tables, filling them with data;
- linking tables, relationships between entities - see theory.

4. Practice:

**Exercise 1.**
Server, user, database.
Step 1.
Open the PostgreSQL server console and create a local server:
- Name
- port
- user password qwerty007 or postgres
  Step 2.
  Connecting to the DBMS using the Beekeeper Studio client
  Step 3.
  We create a user.
  CREATE USER test_user WITH PASSWORD 'qwerty';
  Step 4. Create the test_db database
  CREATE DATABASE test_db OWNER test_user;
  Step 5.
  We grant the user the rights:
  GRANT ALL PRIVILEGES ON DATABASE test_db TO test_user;

**Task 2.**
Creating a table with 3 columns.
CREATE TABLE students (
id serial PRIMARY KEY, name varchar(80), age integer
);
Adding data to the table:
INSERT INTO students (name, age) VALUES
('Anna', 25),
('Maria', 23),
('Roman', 28);
Data extraction:
SELECT * FROM students;
SELECT name, age FROM students;
SELECT * FROM students WHERE age < 18;
SELECT * FROM students ORDER BY age ASC;
SELECT AVG(age) AS 'Middle age' FROM students;
Change data:
UPDATE students SET age = 26 WHERE name = 'Anna';
Deleting data:
DELETE FROM students WHERE id = 1;
DELETE FROM students WHERE name = 'Anna';

**Task 3.**
Creating and linking tables in https://drawsql.app/
1:1 - employee and his passport, country and its capital
1: N - company and employees, countries and cities
N: N - students and courses, authors and books, goods and orders

-----------------------------------------------------------

1. Что мы изучили на прошлом занятии:

- Клиент-серверная архитектура и место СУБД в ней:
  - какое ПО больше всего представлено сейчас на стороне клиента? 
Internet browser:  
    - Microsoft IE/Ege 
    - Google Chrome
    - Mozilla FireFox
    - Apple Safari 
    - Opera...
  
  - какие СУБД вам известны?
    - MySQL
    - Postgres SQL
    - Oracle DB
    - MS SQL
    - Mongo DB
    - ...
  
- Основные функции СУБД:
  - обеспечение безопасности данных 
  - резервное копирование
  - версионность и восстановление данных
  - производительность и кеш (временное хранилище)
  - наличие языка запросов-ответов (Structured QL)
  - ...

- Концепция CRUD и агрегация данных:
  - CRUD
    - С - create (создание)
    - R - read (чтение)
    - U - update (обновление)
    - D - delete (удаление)

  - агрегированные данные
    - статистические показатели, вычисляемые на основе имеющихся данных
    - максимумы или минимумы
    - отчеты квартальные, годовые и т.д.

- SQL запросы - практика:
  - выбрать все из таблицы
  SELECT * FROM ИМЯ_ТАБЛИЦЫ
  - выбрать по колонкам
  SELECT column1, column1
  - выбрать с условием
  SELECT column1, column1
  WHERE ...
  
2. Есть ли вопросы по домашнему заданию?

3. План на сегодняшнее занятие:
- подключение к БД;
- создание таблиц, заполнение их данными;
- связывание таблиц, отношение между сущностями - см. теорию.

4. Практика:

**Задание 1.**
Сервер, пользователь, база данных.
**Шаг 1.**
Открываем консоль сервера PostgreSQL, создаем локальный сервер:
- имя - его надо придумать
- порт - 5432 или 5431, если 5432 занят
- ПАРОЛЬ ПОЛЬЗОВАТЕЛЯ QWERTY007 ИЛИ POSTGRES (ТОЛЬКО В УЧЕБНЫХ ЦЕЛЯХ)

- Шаг 2.
Подключаемся к СУБД с помощью клиента Beekeeper Studio

Шаг 3.
Создаем пользователя.
CREATE USER test_user WITH PASSWORD 'qwerty';
Шаг 4. Создаем БД test_db
CREATE DATABASE test_db OWNER test_user;
Шаг 5.
Наделяем пользователя правами:
GRANT ALL PRIVILEGES ON DATABASE test_db TO test_user;

**Задание 2.** 
Создание таблицы с 3-мя колонками.
CREATE TABLE students (
id serial PRIMARY KEY, name varchar(80), age integer
);
Добавление данных в таблицу:
INSERT INTO students (name, age) VALUES
('Anna', 25),
('Maria', 23),
('Roman', 28);
Извлечение данных:
SELECT * FROM students;
SELECT name, age FROM students;
SELECT * FROM students WHERE age < 18;
SELECT * FROM students ORDER BY age ASC;
SELECT AVG(age) AS 'Средний возраст' FROM students;
Изменение данных:
UPDATE students SET age = 26 WHERE name = 'Anna';
Удаление данных:
DELETE FROM students WHERE id = 1;
DELETE FROM students WHERE name = 'Anna';

**Задание 3.**
Создание и связывание таблиц в https://drawsql.app/ 
1 : 1 - сотрудник и его паспорт, страна и ее столица
1 : N - компания и сотрудники, страны и города
N : N - студенты и курсы, авторы и книги, товары и заказы
