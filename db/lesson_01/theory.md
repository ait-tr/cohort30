# Basics of relational databases

## Definition of DBMS and DB

**Database management system, DBMS**
— **specialized server-type software** that allows you to use and manage databases. The DBMS allows you to save, read and update data, search it and make complex selections based on a combination of several conditions/criteria.
DBMS (DBMS, Data Base Management Software) is application software (server application).

**Database**
Database (DB) is a structured set of data intended for automated processing.
It is a collection of data - a digital copy of entities (objects) of the real world.

**Important!**
Often the meaning of database and DBMS is confused; you can hear the phrase “PostgreSQL DB” when they meant “PostgreSQL DBMS”.

## Basic functions of the DBMS
1. Ensuring data security
2. Backup
3. Versioning and data recovery
4. Performance, cache (temporary storage)
5. Ensuring the convenience of the query/response language (SQL, PL, MS SQL...)

MySQL, PostgeSQL, Oracle DB, MS SQL

## Required minimum theoretical knowledge

**Data models (DB)**
Method of describing (storing, structuring) data:
* Relational (tabular) - e.g. MySQL
* Documentary - e.g. MongoDB
* Graph (graph theory) - e.g. OrientDB
* Flat - e.g. Redis

**Basic Data Structures**
* scalar (scalar value): 1 element -> 1 value
* arrays, lists - indexed values of the same type
* set - a set of unique elements
* collections - can include various types of data structures, such as lists, sets, dictionaries (associative arrays), queues, stacks
* map (associative array, dictionary): a collection of **key + value** pairs, the keys form a set, and the values form a list, collection

**Degrees of data abstraction**
* data (what is given): 150, ‘hello’, -200.5, so-called scalar values.
* information (factual): The product has a cost of 150 EUR per unit.
* information (conclusion): The product costs 150 EUR per unit - for our company this is very expensive.

**Data types: numeric**

- `serial` — integer with auto-increase, from 1 to 2147483647
- `smallint`, `int2` - integer, from -32768 to +32767;
- `integer`, `int`, `int4` - integer, from -2147483648 to +2147483647
- `bigint`, `int8` - integer, from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807
- `double precision`, `float8` - floating point, from 1E-307 to 1E+308

**Data types: string**

- `character(n)`, `char(n)` - represents a string of a fixed number of characters. The parameter specifies the number of characters in the line;
- `character varying(n)`, `varchar(n)` - represents a string of a fixed number of characters. The parameter specifies the number of characters in the line;
- `text` - represents text of arbitrary length.

char(n) and varchar(n) are both data types for storing string values, where n is the maximum length of the string. However, they have several differences:
1. Fixed length vs. variable length:
   char(n): This data type stores fixed-length strings, where each string will occupy exactly n characters, even if the actual length of the string is less. If the string is shorter than n, then it is padded with spaces to the length of n.
   varchar(n): This data type stores variable-length strings, where the actual length of the string can be less than n, but cannot exceed n. Memory is used only to store the actual characters of the string, not to pad it with spaces.
   2.Memory usage:
   char(n): Uses a fixed amount of memory for each string, even if the actual length of the string is less than n. This can lead to excessive memory usage, especially if most of the lines are short.
   varchar(n): Uses only as much memory as is needed to store the actual characters of the string, plus additional bytes to store the length of the string. This is more memory efficient, especially for variable length strings.
3. Access speed:
   char(n): Typically provides faster data access because each string has a fixed length, making it easier to access strings.
   varchar(n): Can be a little slower in some cases as it requires extra time to process the variable length.

**Data types: time and dates**

- `timestamp` - stores the date and time, with or without time zone. For dates, the lowest value is 4713 BC. e., the highest value is 294276 AD. e.
- `date` - represents a date from 4713 BC. e. before 5874897 AD
- `time` - stores the time of day, without a date, taking into account the time zone or without. Accepts values from 00:00:00 to 24:00:00

**Data types: other**

- `boolean` — Boolean value, true or false
- `jsonb` - free-format data in JSON format
  {
  'name':'value',
  ...
  }

## Data Definition Language, Data Control Language

**DDL** is a subset of the SQL language designed to create, modify, and delete databases and tables in them. This includes all commands starting with CREATE, ALTER and DROP.

**DCL** - set of SQL language designed to manage access rights to databases and tables in them. It allows you to allow or deny users the ability to create, modify, or delete databases or tables. This includes all commands starting with GRANT and REVOKE.

## CRUD and data aggregation

C - create
R-read
U-update
D - delete

Online store:
- product creation = create
- search for goods in stock = read
- revaluation = update
- purchase refusal = update
- reservation (purchase) = create
- shipment = update
- withdrawal from sale after a year = delete

Aggregated data:
- average cost
- number of purchases per period
- average rating based on reviews
- statistical indicators...

-------------------------------------------------------------------------

# Основы реляционных БД

## Определение СУБД и БД

**Система управления базами данных, СУБД** 
— **специализированное ПО серверного типа**, позволяющее пользоваться и управлять базами данных. СУБД позволяет сохранять, читать и обновлять данные, выполнять поиск по ним и делать сложные выборки по совокупности нескольких условий/критериев.
СУБД (DBMS, Data Base Management Software) - это прикладное ПО (серверное приложение).

**База данных**
БД (DB) - структурированный набор данных, предназначенный для автоматизированной обработки.
Представляет собой совокупность данных - цифровая копия сущностей (объектов) реального мира.

**Важно!**
Часто значение БД и СУБД путают, можно услышать фразу “БД PostgreSQL”, когда имелось ввиду “СУБД PostgreSQL”.

## Основные функции СУБД
1. Обеспечение безопасности данных
2. Резервное копирование
3. Версионность и восстановление данных
4. Производительность, кэш (временное хранилище)
5. Обеспечение удобства языка запросов/ответов (SQL, PL, MS SQL...)

MySQL, PostgeSQL, Oracle DB, MS SQL

## Необходимый минимум теоретических знаний

**Модели данных (БД)**
Способ описания (хранения, структурирования) данных:
* Реляционная (табличная) - напр., MySQL
* Документная - напр., MongoDB
* Графовая (теория графов) - напр., OrientDB
* Плоская - напр., Redis

**Базовые структуры данных**
* скаляр (скалярное значение): 1 элемент -> 1 значение
* массивы, списки - индексированные значения одного типа
* множество - набор уникальных элементов
* коллекции - могут включать в себя различные типы структур данных, такие как списки, множества, словари (ассоциативные массивы), очереди, стеки
* карта (ассоциативный массив, словарь): коллекция пар **ключ + значение**, ключи образуют множество, а значения - список, коллекцию

**Степени абстракции данных**
* данные (то, что дано): 150, ‘hello’, -200.5, так называемые скалярные величины. 
* информация (фактология): Товар имеет стоимость 150 EUR за единицу.
* сведения (заключение): Товар имеет стоимость 150 EUR за единицу - для нашей компании это очень дорого.

**Типы данных: числовые**

- `serial` — целое с автоувеличением, от 1 до 2147483647
- `smallint`, `int2` — целое, от -32768 до +32767;
- `integer`, `int`, `int4` — целое, от -2147483648 до +2147483647
- `bigint`, `int8` — целое, от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
- `double precision`, `float8` — с плавающей точкой, от 1E-307 до 1E+308

**Типы данных: строковые**

- `character(n)`, `char(n)` — представляет строку из фиксированного количества символов. С помощью параметра задается количество символов в строке;
- `character varying(n)`, `varchar(n)` - представляет строку из фиксированного количества символов. С помощью параметра задается количество символов в строке;
- `text` — представляет текст произвольной длины.

char(n) и varchar(n) - это оба типы данных для хранения строковых значений, где n - это максимальная длина строки. Однако они имеют несколько различий:
1. Фиксированная длина vs. переменная длина:
char(n): Этот тип данных хранит строки фиксированной длины, где каждая строка будет занимать точно n символов, даже если фактическая длина строки меньше. Если строка короче n, то она дополняется пробелами до длины n.
varchar(n): Этот тип данных хранит строки переменной длины, где фактическая длина строки может быть меньше n, но не может превышать n. Память используется только для хранения фактических символов строки, а не для дополнения пробелами.
2. Использование памяти:
char(n): Использует фиксированное количество памяти для каждой строки, даже если фактическая длина строки меньше n. Это может привести к избыточному использованию памяти, особенно если большинство строк короткие.
varchar(n): Использует только столько памяти, сколько необходимо для хранения фактических символов строки, плюс дополнительные байты для хранения длины строки. Это более эффективно использование памяти, особенно для строк переменной длины. 
3. Скорость доступа:
char(n): Обычно обеспечивает более быстрый доступ к данным, поскольку каждая строка имеет фиксированную длину, что упрощает процесс доступа к строкам.
varchar(n): В некоторых случаях может быть немного медленнее, так как требует дополнительного времени на обработку переменной длины.

**Типы данных: время и даты**

- `timestamp` — хранит дату и время, с учётом часового пояса или без. Для дат самое нижнее значение 4713 год до н. э., самое верхнее значение 294276 год н. э.
- `date` — представляет дату от 4713 год до н. э. до 5874897 года н.э
- `time` — хранит время суток, без даты, с учётом часового пояса или без. Принимает значения от 00:00:00 до 24:00:00

**Типы данных: прочие**

- `boolean` — булево значение, true или false
- `jsonb` — данные произвольного формата в формате JSON
{
'name':'value',
...
}

## Data Definition Language, Data Control Language

**DDL** — подмножество языка SQL, предназначенное для создания, изменения и удаления баз данных и таблиц в них. К нему относятся все команды, начинающиеся с CREATE, ALTER и DROP.

**DCL** — подмножество языка SQL, предназначенное для управления правами доступа к базам данным и таблицам в них. С помощью него можно разрешить и запрещать пользователям создавать, изменять и удалять базы данных или таблицы. К нему относятся все команды, начинающиеся на GRANT и REVOKE.

## CRUD и агрегация данных

С - create
R - read
U - update
D - delete

Интернет-магазин:
- создание товара = create
- поиск товара на складе = read
- переоценка = update
- отказ от покупки = update
- резервирование (покупка) = create
- отгрузка = update
- снятие с продажи через год = delete

Агрегированные данные:
- средняя стоимость
- кол-во покупок за период
- средняя оценка по отзывам
- статистические показатели... 
