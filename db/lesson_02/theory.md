# Basics of relational databases, lesson 2

## SQL: creating a DBMS user

```sql
CREATE USER test_user WITH PASSWORD 'qwerty';
```
The user is created in the DBMS!

## SQL: creating a database

```sql
CREATE DATABASE test_db OWNER test_user
```

Any database must be created before you can connect to it.
The user specified as owner will have maximum access rights to this database.

## SQL: user rights in the database

```sql
GRANT ALL PRIVILEGES ON DATABASE test_db TO test_user;
```

By default, only the owner and super-administrator of the DBMS have access to the database. All other users need to add access explicitly.

## SQL: delete database

```sql
DROP DATABASE test_db;
```

A database can be deleted by its owner, a DBMS super-administrator, or a user who has been explicitly granted the right to do so.

## SQL: creating a table

```sql
CREATE TABLE students (
id serial PRIMARY KEY, name varchar(80), age integer
);
```

# Data Manipulation Language

**DML** is a subset of the SQL language designed to create, modify, and delete data in tables within a database. This includes all commands starting with `SELECT`, `INSERT`, `UPDATE` and `DELETE`.
(CRUD is an abbreviation for CREATE READ UPDATE DELETE)
In general, SQL DMLs are very similar among different databases, but sometimes there are major differences, so it's always a good idea to check your specific database's documentation if you have problems.

## SQL: adding rows to a table

```sql
INSERT INTO students (name, age) VALUES
('Anna', 25),
('Maria', 23),
('Roman', 28);
```

Please note that the id field exists in the table, but its value is not required. The serial data type allows it to be filled in automatically.

## SQL: data retrieval

```sql
SELECT * FROM students;
SELECT name, age FROM students;
SELECT * FROM students WHERE age < 18;
SELECT * FROM students ORDER BY age ASC;
SELECT AVG(age) AS 'Middle age' FROM students;
```

Using `SELECT` you can not just pull out data, but also filter, sort and carry out simple aggregations.

## SQL: changing data

```sql
UPDATE students SET age = 26 WHERE name = 'Anna';
```

Using `UPDATE` you can change any data in the table.
Using `WHERE` is optional, although highly recommended. Without `WHERE`, all existing rows in the table will be updated.

## SQL: delete data

```sql
DELETE FROM students WHERE id = 1;
```
Most often, deletion occurs by `id`, but you can delete by any other field:

```sql
DELETE FROM students WHERE name = 'Anna';
```
It is possible to use DELETE without WHERE at all, in which case all data in the table will be deleted.


# Linking tables, relationships between entities

## Primary and Foreign keys
**Primary key** (primary key) in databases is a unique identifier for each record in a table. It is used to uniquely identify each row of a table and ensures that the data in that table is unique.
Primary key characteristics:
- uniqueness
- immutability
- not null - cannot be empty

A **Foreign key** in databases is a field or set of fields in a table that is related to a primary key or unique key in another table. It is used to create relationships between tables and ensures data integrity in the database.
Foreign key characteristics:
- relationship between tables
- ensures that the foreign key's values must exist in a corresponding primary key or unique key column in the other table it points to
  - ensures communication and integrity of data in the database.
    Example:
    CREATE TABLE ORDERS (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
    );

## Ratio 1 : 1
- Persons (people) and their passport data
- Country and its capital
- give your example...

## Ratio 1 : N
- Company and employees
- Countries and cities
- ... (your own example)

## N : N ratio
A many-to-many (M:N) relationship in databases means that each record in one table can be associated with multiple records in another table, and vice versa. Implementing such a relationship requires the use of an intermediate table that connects the records of both tables.
- Students and courses
- Authors and books
- Products and orders
- your example...

## join operator
Let's say we have two tables: "Orders" and "Customers". The "Orders" table contains information about orders, and the "Customers" table contains information about customers. Let's say we want to get a list of all orders along with the names of the customers who made those orders. We can use the JOIN operator to join these two tables on their common column "CustomerID".
SELECT Orders.OrderID, Orders.OrderDate, Customers.CustomerName
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
The result will be a list of all orders along with the names of the customers who made those orders. Each result line will contain the order ID, date of order and client's name.

Does this create a new table?
Answer: ...

Presentations:
- Lesson 1
  https://docs.google.com/presentation/d/1N9EdfzetGheLoXJEh1VgvzKGvnyiKsP4/edit#slide=id.p29

- Lesson 2
  https://docs.google.com/presentation/d/1fzZHuYstuUQWpUSYEOySYOht7xgIiF3_/edit#slide=id.g2bb3f954aca_0_170

-------------------------------------------------------------------------------------

# Основы реляционных БД, занятие 2

## SQL: создание пользователя СУБД

```sql
CREATE USER test_user WITH PASSWORD 'qwerty';
```
Пользователь создаётся именно в СУБД!

## SQL: создание базы данных

```sql
CREATE DATABASE test_db OWNER test_user
```

Любая база должна быть создана, прежде чем к ней можно будет подключиться.
Пользователь, указанный как owner, будет иметь максимальные права доступа к этой базе данных.

## SQL: права пользователя в БД

```sql
GRANT ALL PRIVILEGES ON DATABASE test_db TO test_user;
```

По умолчанию доступ к базе имеет только owner и супер-администратор СУБД. Всем остальным пользователям доступ нужно добавлять явным образом.

## SQL: удаление базы данных

```sql
DROP DATABASE test_db;
```

Удалить базу данных может её владелец, супер-администратор СУБД или пользователь, которому явным образом даны на это права.

## SQL: создание таблицы

```sql
CREATE TABLE students (
id serial PRIMARY KEY, name varchar(80), age integer
);
```

# Data Manipulation Language

**DML** — подмножество языка SQL, предназначенное для создания, изменения и удаления данных в таблицах внутри базы данных. К нему относятся все команды, начинающиеся с `SELECT`, `INSERT`, `UPDATE` и `DELETE`.
(CRUD аббревиатура CREATE READ UPDATE DELETE)
В целом SQL DML очень похожи среди разных баз данных, но иногда бывают серьезные отличия, поэтому всегда полезно сверяться с документацией по конкретной БД в случае проблем.

## SQL: добавление строк в таблицу

```sql
INSERT INTO students (name, age) VALUES
('Anna', 25),
('Maria', 23),
('Roman', 28);
```

Обратите внимание, что поле id существует в таблице, но указывать его значение не обязательно. Тип данных serial позволяет ему заполняться автоматически.

## SQL: извлечение данных

```sql
SELECT * FROM students;
SELECT name, age FROM students;
SELECT * FROM students WHERE age < 18;
SELECT * FROM students ORDER BY age ASC;
SELECT AVG(age) AS 'Средний возраст' FROM students;
```

С помощью `SELECT` можно не просто вытаскивать данные, но и проводить фильтрацию, сортировать и проводить несложные агрегации.

## SQL: изменение данных

```sql
UPDATE students SET age = 26 WHERE name = 'Anna';
```

С помощью `UPDATE` можно изменять любые данные в таблице.
Использование `WHERE` не обязательно, хотя и крайне рекомендуется. Без `WHERE` будут обновлены все существующие строчки в таблице.

## SQL: удаление данных

```sql
DELETE FROM students WHERE id = 1;
```
Чаще всего удаление происходит по `id`, но можно удалять и по любому другому полю:

```sql
DELETE FROM students WHERE name = 'Anna';
```
Возможно использование DELETE вообще без WHERE, в таком случае будут удалены вообще все данные в таблице.


# Cвязывание таблиц, отношение между сущностями

## Primary и Foreign keys
**Primary key** (первичный ключ) в базах данных - это уникальный идентификатор каждой записи в таблице. Он используется для однозначного определения каждой строки таблицы и обеспечивает уникальность данных в этой таблице.
Характеристики primary key:
- уникальность
- неизменяемость
- not null - не может быть пустым

**Foreign key** (внешний ключ) в базах данных - это поле или набор полей в таблице, которые связаны с первичным ключом или уникальным ключом в другой таблице. Он используется для создания связей между таблицами и обеспечивает целостность данных в базе данных.
Характеристики foreign key:
- связь между таблицами
- гарантирует, что значения внешнего ключа должны существовать в соответствующем столбце первичного ключа или уникального ключа в другой таблице, на которую он указывает
  - обеспечивает связь и целостность данных в базе данных.
  Пример:
  CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
  );

## Отношение 1 : 1 
- Персоны (люди) и их паспортные данные
- Страна и ее столица
- приведите свой пример...

## Отношение 1 : N
- Компания и сотрудники
- Страны и города
- ... (свой пример)

## Отношение N : N
Отношение "многие ко многим" (M:N) в базах данных означает, что каждая запись в одной таблице может быть связана с несколькими записями в другой таблице, и наоборот. Для реализации такого отношения требуется использование промежуточной таблицы, которая соединяет записи обеих таблиц.
- Студенты и курсы
- Авторы и книги
- Товары и заказы
- свой пример ...

## Оператор join
Предположим, у нас есть две таблицы: "Orders" и "Customers". Таблица "Orders" содержит информацию о заказах, а таблица "Customers" содержит информацию о клиентах. Допустим, мы хотим получить список всех заказов вместе с именами клиентов, сделавших эти заказы. Мы можем использовать оператор JOIN для объединения этих двух таблиц по их общему столбцу "CustomerID".
SELECT Orders.OrderID, Orders.OrderDate, Customers.CustomerName
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
Результатом будет список всех заказов вместе с именами клиентов, сделавших эти заказы. Каждая строка результата будет содержать ID заказа, дату заказа и имя клиента.

Создается ли при этом новая таблица?
Ответ: ...

Презентации:
- Занятие 1
https://docs.google.com/presentation/d/1N9EdfzetGheLoXJEh1VgvzKGvnyiKsP4/edit#slide=id.p29

- Занятие 2
https://docs.google.com/presentation/d/1fzZHuYstuUQWpUSYEOySYOht7xgIiF3_/edit#slide=id.g2bb3f954aca_0_170