-------------------------------------------------- -----------------------------------

# Basics of relational databases, lesson 3

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
- Authors and articles
- Products and orders
- your example...

## join operator
Let's say we have two tables: "Orders" and "Customers". The "Orders" table contains information about orders, and the "Customers" table contains information about customers. Let's say we want to get a list of all orders along with the names of the customers who made those orders. We can use the JOIN operator to join these two tables on their common column "CustomerID".

SELECT Orders.OrderID, Orders.OrderDate, Customers.CustomerName
FROM Orders
JOIN Customers ON Orders.CustomerID = Customers.CustomerID;

The result will be a list of all orders along with the names of the customers who made those orders. Each result row will contain the order ID, order date, and customer name.

Does this create a new table?
Answer: ...

Presentations:
- Lesson 1
  https://docs.google.com/presentation/d/1N9EdfzetGheLoXJEh1VgvzKGvnyiKsP4/edit#slide=id.p29

- Lesson 2
  https://docs.google.com/presentation/d/1fzZHuYstuUQWpUSYEOySYOht7xgIiF3_/edit#slide=id.g2bb3f954aca_0_170

## SQL statements

#### `=` equality
#### `<` less
#### `>` more
#### `<=` less than or equal to
#### `>=` greater than or equal to
#### `<>` is not equal
#### `!=` does not equal

#### `LIKE` checks whether a value matches a certain pattern (case sensitive)

#### `ILIKE` checks whether a value matches a certain pattern (case insensitive)

#### `AND` logical `and`

#### `OR` logical `or`

#### `IN` checks if a value is within a range of values (equivalent to multiple conditions)

#### `BETWEEN` checks if a value is within a range of values

#### `IS NULL` checks whether the value is NULL

#### `NOT` in combination with other operators allows you to formulate negative conditions `NOT LIKE`, `NOT IN`, `NOT BETWEEN`

## Aggregation - obtaining calculated data (results, statistics, analytics)

### Basic aggregation operators
- COUNT() calculation of number of rows
- AVG() calculation of avg/arith. meaning
- MAX() calculation of max. values
- MIN() calculation of min. values
- SUM() calculation of the amount

### GROUP BY
Displays data grouped by a specific value, for example by country.
```
   SELECT
   country,
   MIN(age) AS min_age
FROM
   farmer
GROUP BY
   country;
```
### HAVING
If you need to specify clarification after group by:
```sql
   SELECT
   country,
   COUNT(id)
FROM
   farmer
GROUP BY
   country
HAVING COUNT(id) >= 2;
```

## Constraints

Data types are a way to limit the type of data that can be stored in a table. However, for many applications the limit they provide is too coarse. For example, a column containing the price of a product should probably only accept positive values. But there is no standard data type that only accepts positive numbers. Another problem is that you may need to constrain a column's data relative to other columns or rows. For example, in a table containing product information, there should be only one row for each product number.

To this end, SQL allows you to define constraints on columns and tables. Constraints give you as much control over the data in your tables as you want. If a user tries to store data in a column that violates limitation, an error occurs. This applies even if the value is derived from a default value definition.

###CHECK

Check constraint is the most common type of constraint. It allows you to specify that the value in a certain column must satisfy some condition.
In other words, with check we can `check' whether a value satisfies a condition.

In this example, we will create a table where the price can only be positive.

```sql
CREATE TABLE product (
     id serial,
     name text,
     price numeric CHECK (price > 0)
);
```

You can also give the constraint a separate name. This clears up error messages and allows you to refer to the constraint when you need to change it. Syntax:

```sql
CREATE TABLE product (
     id serial,
     name text,
     price numeric CONSTRAINT positive_price CHECK (price > 0)
);
```

Within a check constraint, you can reference multiple fields:

```sql
CREATE TABLE product (
     id serial,
     name text,
     price numeric CHECK (price > 0),
     discounted_price numeric CHECK (discounted_price > 0),
     CHECK (price > discounted_price)
);
```

Example of alternative syntax:

```sql
CREATE TABLE product (
     id serial,
     name text,
     price numeric
     CHECK (price > 0),
     discounted_price numeric,
     CHECK (discounted_price > 0),
     CONSTRAINT valid_discount CHECK (price > discounted_price)
);
```

It should be noted that a check constraint is satisfied if the check expression evaluates to `true` or `NULL`. Because most expressions will evaluate to `NULL` if any operand is null, they will not prevent null values from appearing in restricted columns. To ensure that a column does not contain null values, you can use a not-null constraint.

### NOT NULL

Indicates that the column cannot contain a null value.

```sql
CREATE TABLE product (
     serial integer NOT NULL,
     name text NOT NULL,
     price numeric
);
```

It is possible to specify multiple constraints for a column; they simply need to be listed one after the other.

```sql
CREATE TABLE product (
     serial integer NOT NULL,
     name text NOT NULL,
     price numeric NOT NULL CHECK (price > 0)
);
```

### UNIQUE

A unique constraint ensures that the data contained in a column or group of columns is unique among all rows in the table. Syntax:

```sql
CREATE TABLE product (
     id integer UNIQUE,
     name text,
     price numeric
);
```

You can specify several properties at once:

```sql
CREATE TABLE example (
     a integer,
     b integer,
     c integer,
     UNIQUE (a, c)
);
```

If you want to name the constraint, then the syntax will be the same as usual:

```sql
CREATE TABLE product (
     id serial,
     name text CONSTRAINT must_be_different UNIQUE,
     price numeric
)
```

In this case, if we want to add two lines with the same names, the error will contain the specified constraint name:

```sql
duplicate key value violates unique constraint "must_be_different"
```

### PRIMARY KEY

A primary key constraint specifies that a column or group of columns can be used as a unique identifier for rows in a table. This requires that the values be unique and not null. So the following two table definitions accept the same data:

```sql
CREATE TABLE products (
     product_no integer PRIMARY KEY,
     name text,
     price numeric
);
```

If several columns are primary keys, the syntax will be the same as in the case of unique:

```sql
CREATE TABLE example (
     a integer,
     b integer,
     c integer,
     PRIMARY KEY (a, c)
);
```

### FOREIGN KEY

A foreign key constraint specifies that the values in a column (or group of columns) must match the values appearing in some row of another table. We say that this maintains referential integrity between two related tables.

Let's say you have a products table, which we've already used several times:

```sql
CREATE TABLE products (
     product_no integer PRIMARY KEY,
     name text,
     price numeric
);
```

Let's also assume that you have a table that stores orders for these products. We want the orders table to only contain orders for actual products. So we define a foreign key constraint on the orders table that references the products table:

```sql
CREATE TABLE orders (
     order_id integer PRIMARY KEY,
     product_no integer REFERENCES products (product_no),
     quantity integer
);
```

It is no longer possible to create orders with a non-NULL product_no that was not previously in the product table.

We say that in this situation the orders table is the referenced table and the products table is the referenced table. Similarly, there are referring and referencing columns.

## ON DELETE CASCADE

ON DELETE CASCADE is an option that can be used when defining a foreign key constraint. If ON DELETE CASCAD is specified

-------------------------------------------------------------------------------------

# Основы реляционных БД, занятие 3

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
- Авторы и статьи
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

## Операторы языка SQL

#### `=` равенство
#### `<` меньше
#### `>` больше
#### `<=` меньше или равно
#### `>=` больше или равно
#### `<>` не равно
#### `!=` не равно

#### `LIKE` проверяет соответствует ли значение определенному патерну(чувстивтельно к регистру)

#### `ILIKE` проверяет соответствует ли значение определенному патерну(без учета регистра)

#### `AND` логическое `и`

#### `OR` логическое `или`

#### `IN` проверяет находится ли значение внутури диапазона значений (равнозначно нескольким условиям)

#### `BETWEEN` проверяет находится ли значение внтури диапазона значений

#### `IS NULL` проверяет является ли значение NULL-ом

#### `NOT` в комбинации с другими операторам позволяет формулировать отрицательные условия `NOT LIKE`, `NOT IN`, `NOT BETWEEN`

## Aggregation - получение вычисленных данных (итоги, статистика, аналитика)

### Базовые операторы агрегации
- COUNT() расчет ко-ва строк
- AVG() расчет сред/ариф. знач.
- MAX() расчет макс. значения
- MIN() расчет мин. значения
- SUM() расчет суммы

### GROUP BY
Выводит данные сгруппированные по опредленному значению, например по стране.
```
  SELECT
  country,
  MIN(age) AS min_age
FROM
  farmer
GROUP BY
  country;
```
### HAVING
Если требуется задать уточнение после group by:
```sql
  SELECT
  country,
  COUNT(id)
FROM
  farmer
GROUP BY
  country
HAVING COUNT(id) >= 2;
```

## Ограничения (Constraints)

Типы данных — это способ ограничить тип данных, которые могут храниться в таблице. Однако для многих приложений ограничение, которое они обеспечивают, слишком грубое. Например, столбец, содержащий цену продукта, вероятно, должен принимать только положительные значения. Но не существует стандартного типа данных, который принимает только положительные числа. Другая проблема заключается в том, что вам может потребоваться ограничить данные столбца относительно других столбцов или строк. Например, в таблице, содержащей информацию о продукте, для каждого номера продукта должна быть только одна строка.

С этой целью SQL позволяет вам определять ограничения для столбцов и таблиц. Ограничения дают вам столько контроля над данными в ваших таблицах, сколько вы пожелаете. Если пользователь пытается сохранить данные в столбце, который нарушает ограничение, возникает ошибка. Это применимо, даже если значение получено из определения значения по умолчанию.

### CHECK

Check ограничение — это наиболее общий тип ограничения. Он позволяет указать, что значение в определенном столбце должно удовлетворять какому-то условию.
Иными словами, с помощью check мы можем `проверить` удовлетовряет ли значение условию.

В этом примере мы создадим таблицу, где цена может быть только положительной.

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CHECK (price > 0)
);
```

Вы также можете дать ограничению отдельное имя. Это проясняет сообщения об ошибках и позволяет вам обращаться к ограничению, когда вам нужно его изменить. Синтаксис:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CONSTRAINT positive_price CHECK (price > 0)
);
```

Внутри ограничения check можно ссылаться на несколько полей:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric CHECK (price > 0),
    discounted_price numeric CHECK (discounted_price > 0),
    CHECK (price > discounted_price)
);
```

Пример альтернативного синтаксиса:

```sql
CREATE TABLE product (
    id serial,
    name text,
    price numeric,
    CHECK (price > 0),
    discounted_price numeric,
    CHECK (discounted_price > 0),
    CONSTRAINT valid_discount CHECK (price > discounted_price)
);
```

Следует отметить, что проверочное ограничение считается удовлетворенным, если проверочное выражение имеет значение `true` или `NULL`. Поскольку большинство выражений будут иметь значение `NULL`, если какой-либо операнд имеет нулевое значение, они не предотвратят появление нулевых значений в ограниченных столбцах. Чтобы гарантировать, что столбец не содержит нулевых значений, можно использовать ограничение not-null.

### NOT NULL

Показывает, что в столбце не может быть значения null.

```sql
CREATE TABLE product (
    serial integer NOT NULL,
    name text NOT NULL,
    price numeric
);
```

Возможно указать несколько ограничений для столбца, их просто следует перечислить одно после другого.

```sql
CREATE TABLE product (
    serial integer NOT NULL,
    name text NOT NULL,
    price numeric NOT NULL CHECK (price > 0)
);
```

### UNIQUE

Ограничение уникальности гарантирует, что данные, содержащиеся в столбце или группе столбцов, уникальны среди всех строк таблицы. Синтаксис:

```sql
CREATE TABLE product (
    id integer UNIQUE,
    name text,
    price numeric
);
```

Можно указать несколько свойств сразу:

```sql
CREATE TABLE example (
    a integer,
    b integer,
    c integer,
    UNIQUE (a, c)
);
```

Если есть желания поименовать ограничение - то синтаксис будет таким же, как обычно:

```sql
CREATE TABLE product (
    id serial,
    name text CONSTRAINT must_be_different UNIQUE,
    price numeric
)
```

В этом случае, если мы захотим добавить две строки с одинаковыми именами ошибка будет содержать указанное имя ограничения:

```sql
duplicate key value violates unique constraint "must_be_different"
```

### PRIMARY KEY

Ограничение первичного ключа указывает, что столбец или группа столбцов могут использоваться в качестве уникального идентификатора строк в таблице. Для этого необходимо, чтобы значения были уникальными и не были нулевыми. Итак, следующие два определения таблицы принимают одни и те же данные:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Если несколько столбцов являются первичными ключами - синтаксис будет такой же, как в случае с unique:

```sql
CREATE TABLE example (
    a integer,
    b integer,
    c integer,
    PRIMARY KEY (a, c)
);
```

### FOREIGN KEY

Ограничение внешнего ключа указывает, что значения в столбце (или группе столбцов) должны соответствовать значениям, появляющимся в некоторой строке другой таблицы. Мы говорим, что это поддерживает ссылочную целостность между двумя связанными таблицами.

Допустим, у вас есть таблица продуктов, которую мы уже использовали несколько раз:

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);
```

Предположим также, что у вас есть таблица, в которой хранятся заказы на эти продукты. Мы хотим, чтобы таблица заказов содержала только заказы на действительно существующие товары. Поэтому мы определяем ограничение внешнего ключа в таблице заказов, которое ссылается на таблицу продуктов:

```sql
CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    product_no integer REFERENCES products (product_no),
    quantity integer
);
```

Теперь невозможно создавать заказы с non-NULL product_no, которого бы не было ранее в таблице продуктов.

Мы говорим, что в этой ситуации таблица заказов является ссылаюшейся таблицей, а таблица продуктов — та на которую ссылаются. Аналогичным образом существуют ссылающиеся и ссылочные столбцы.

## ON DELETE CASCADE

ON DELETE CASCADE — это опция, которую можно использовать при определении ограничения внешнего ключа. Если указано ON DELETE CASCADE, Postgres автоматически удаляет любую строку в дочерней таблице, которая ссылается на удаленную строку из родительской таблицы.

```sql
CREATE TABLE products (
    product_no integer PRIMARY KEY,
    name text,
    price numeric
);

CREATE TABLE orders (
    order_id integer PRIMARY KEY,
    shipping_address text,
    ...
);

CREATE TABLE order_items (
    product_no integer REFERENCES products ON DELETE RESTRICT,
    order_id integer REFERENCES orders ON DELETE CASCADE,
    quantity integer,
    PRIMARY KEY (product_no, order_id)
);
```

Еще один пример:

```sql
INSERT INTO
  employees (name)
VALUES
  ('Alice'),
  ('Bob'),
  ('Carol'),
  ('David');

INSERT INTO
  departments (employee_id, department_name)
VALUES
  (1, 'Sales'),
  (2, 'Marketing'),
  (3, 'Accounting'),
  (1, 'Marketing');

DELETE FROM employees WHERE id = 1;
```

## Псевдонимы (alias) в SQL / Оператор AS

```sql
SELECT
        ProductName,
    Price AS Price_eur,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * 1.1 AS Price_usd
FROM Products
```

```sql
SELECT *,
    Price * .95 AS Price_down
FROM Products
```
## Index
Индекс — это отдельная структура данных, которая ускоряет извлечение данных из таблицы за счет дополнительных операций записи и хранения для ее обслуживания.

Используйте оператор CREATE INDEX для создания индекса.

```sql
CREATE INDEX farmer_index ON farmer (height);
```