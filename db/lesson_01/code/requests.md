**Примеры**

```sql
-- вывести всех клиентов
SELECT *
FROM Customers

SELECT
		Country, -- проекция (полей)
    City
FROM Customers
```

```sql
-- вывести страны клиентов (только уникальные значения - без дублей)
SELECT DISTINCT
	Country -- проекция
FROM Customers
```

**Задача. Вывести данные о поставщиках**

(проекция: `название_компании`, `страна`)

```sql
SELECT
		SupplierName, -- проекция
    Country
FROM Suppliers
```

## Фильтрация в SQL / Оператор `WHERE`

**Пример. Вывести клиентов из `Germany`**

```sql
SELECT *
FROM Customers
WHERE
	Country='Germany'
```

**Задача. Вывести город и почтовый индекс клиентов из `France`**

```sql
SELECT
		City,
    PostalCode -- проекция
FROM Customers
WHERE
	Country='France' -- фильтрация
```

## Операторы сравнения

- `=` равно
- `!=` `<>` не равно
- `>`больше
- `<`меньше
- `>=` больше или равно
- `<=` меньше или равно

## Логические операторы (приоритет - сверху вниз)

- `NOT` логическое отрицание (унарный)
- `AND` логическое И (бинарный)
- `OR` логическое ИЛИ (бинарный)

**Пример. Вывести клиентов из `Germany` (`Berlin`)**

```sql
SELECT *
FROM Customers

WHERE
		Country='Germany'
    AND
    City='Berlin'
```

**Пример. Вывести клиентов не из `Germany`**

```sql
SELECT *
FROM Customers

WHERE
	NOT Country = 'Germany'
  -- Country != 'Germany'
  -- Country <> 'Germany'
```

**Задача. Вывести товары с ценой от `50` до `100` EUR**

```sql
SELECT *
FROM Products

WHERE
	Price >= 50
	AND
	Price <= 100
```

**Задача. Вывести клиентов из `Germany` и `France`**

```sql
SELECT *
FROM Customers

WHERE
		Country='Germany'
    OR
    Country='France'
```

**Задача. Вывести клиентов, кроме тех, что из `UK` и `USA`**

```sql
SELECT *
FROM Customers

WHERE
	NOT Country='UK'
	AND
	NOT Country='USA'
```

**Задача. Вывести номера телефонов поставщиков из `UK` и `Brazil`**

```sql
SELECT
	Phone
FROM Suppliers

WHERE
		Country = 'UK'
    OR
    Country = 'Brazil'
```

## Оператор `IN`

- проверка принадлежности к списку значений

```sql
SELECT *
FROM Customers
WHERE
	Country='Germany'
	OR
	Country='France'
--

SELECT *
FROM Customers
WHERE
	Country IN ('Germany', 'France')
```

```sql
SELECT *
FROM Customers

WHERE
	NOT Country='UK'
	AND
	NOT Country='USA'

--
SELECT *
FROM Customers
WHERE
	NOT Country IN ('UK', 'USA')
-- Country NOT IN ('UK', 'USA')
```

**Задача. Вывести название и стоимость товаров из категорий `1` и `3` со стоимостью до `50` EUR**

```sql
SELECT
		ProductName,
    Price
FROM Products
WHERE
		Price <= 50
    AND
    CategoryID IN (1, 3)
--

SELECT
		ProductName,
    Price
FROM Products
WHERE
		Price <= 50
    AND
    (CategoryID = 1 OR CategoryID = 3)
```

**Задачи. Вывести товары с ценой от `80` до `190` EUR не из категории `5`**

```sql
SELECT *
FROM Products

WHERE
		Price >= 80 AND Price <= 190
    AND
    NOT CategoryID=5
```

## Оператор диапазона `BETWEEN`

**Пример**

```sql
SELECT *
FROM Products
WHERE
		Price BETWEEN 80 AND 190
    AND
    NOT CategoryID=5
```

**Задача. Вывести товары с ценой от `10` до `50` EUR из категорий `1, 2, 3`**

```sql
SELECT *
FROM Products

WHERE
		Price BETWEEN 10 AND 50
    AND
    CategoryID IN (1, 2, 3)
```

## Сортировка в SQL / Оператор `ORDER BY`

**Пример**

```sql
SELECT *
FROM Products
ORDER BY Price DESC
	-- DESC - по убыванию
	-- ASC - по возрастанию (по умолчанию)
```

**Задача. Вывести товары из `5` категории по возрастанию цены**

```sql
SELECT *
FROM Products

WHERE
	CategoryID=5

ORDER BY Price ASC
```

## Лимитирование вывода / Оператор `LIMIT`

- Как правило, применяется для:
    - постраничного (порционного) вывода (напр., товаров в каталоге)
    - вывода блока рекомендаций

**Пример. Вывести три самых дорогих товара**

```sql
SELECT *
FROM Products
ORDER BY Price DESC

LIMIT 3 OFFSET 0 -- стр. 1
-- LIMIT 3 OFFSET 3 -- стр. 2
-- LIMIT 3 OFFSET 6 -- стр. 3
```

```sql
-- пример формулы смещения (OFFSET)
PAGE = 1
LIMIT = 3
OFFSET = LIMIT * (PAGE - 1)
```

**Задача. Вывести название и стоимость одного самого дорогого товара из категории `1`**

```sql
SELECT
		ProductName, -- проекция
   	Price        -- полей
FROM Products

WHERE
	CategoryID=1  -- фильтрация

ORDER BY Price DESC -- сортировка
LIMIT 1 -- лимитирование
```

**Задача. Вывести товар, который находится на третьем месте среди самых дорогих**

```sql
SELECT *
FROM Products
ORDER BY Price DESC
LIMIT 1 OFFSET 2
```

**Пример оформления Д/З**

```sql
-- файл homework.sql
--
-- Задача 1. Вывести ...
SELECT ...

-- Задача 2. Вывести ...
SELECT ...
```

## Псевдонимы в SQL / Оператор `AS`

**Примеры**

```sql
SELECT
		ProductName,
    Price AS Price_eur,
    Price * 1.05 AS Price_usd
FROM Products
```

```sql
SELECT *,
	Price * 1.05 AS Price_usd
FROM Products
```

```sql
SELECT *,
	Price * .95 AS Price_down
FROM Products
```

**Задача. Вывести названия товаров, а также их стоимость:**

- полную
- со скидкой в `25%`
- с наценкой в `15%`

```sql
SELECT
		ProductName,
    Price AS Price_full,
    Price * .75 AS Price_low,
    Price * 1.15 AS Price_up
FROM Products
```