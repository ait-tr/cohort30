# Basics of NON-relational databases

## Fundamental differences between MongoDB and RDBMS

1. Another language for executing queries (`NoSQL - QUERY API`)
2. Data model - **DOCUMENT** (document - assoc/array)
3. Dynamic data schema (without a schema, `schemaless`) - each document can have its own set of fields
4. Uses `JSON` and Binary `JSON` (`BSON`)
5. Allows you to store nested data structures

```jsx
// example
users = [
{username: 'hacker', email: '123@example.org', is_blocked: true},
{username: 'user1', email: 'hello@example.org', phone: '+0000000000'}
]
```

## Basic data structures

1. Scalar (scalar value)
2. Array (list of values)
3. Associate/array (key/value pairs)
4. Set (list of **unique** elements)

## Request categories

1. `CRUD` - simpler queries
2. Aggregation - obtaining calculated data

## MongoDB: CRUD

**Create**

- `insertOne()` add one document
  - one argument
    - associate/array (object)
- `insertMany()` add multiple documents
  - one argument
    - array of associations/arrays

**Read**

- `findOne()` find (select) one document
- `find()` find (select) several documents
  - arguments
    - `filter`
    - `projection`
- `countDocuments()` number of matches
  - arguments
    - `filter`

**Update**

- `updateOne()` change one document
- `updateMany()` change multiple documents
  - arguments
    - `filter`
    - `action`

**Delete**

- `deleteOne()` delete one document
- `deleteMany()` delete multiple documents
  - arguments
    - `filter`


## DB `music` service for online listening to music tracks (Separate example)

**Basic Entities**

- `users`
- `tracks`
- `playlists`

**Example. Adding users**

```jsx
db.users.insertMany([
     { _id: 1, fullname: 'Ivan Ivanov', country: 'Germany' },
     { _id: 2, fullname: 'Petr Ivanov', country: 'USA' },
     { _id: 3, fullname: 'Sidr Ivanov', country: 'Germany' },
     { _id: 4, fullname: 'hacker', country: 'USA' },
     { _id: 5, fullname: 'noname', country: 'France' }
])
```

**Example. Display all users**

```jsx
db.users.find()
```

**Example. Remove users from `USA`**

```jsx
db.users.find(
     { country: 'USA' } // filter
)

// with projection
db.users.find(
     { country: 'USA' }, // filter
     { fullname: 1, _id: 0 } // projection
)

// with projection
db.users.find(
     { country: 'USA' }, // filter
     { country: 0 } // projection
)
```

**Task. Output usernames from `Germany`**

```jsx
db.users.find(
     { country: 'Germany' }, // filter
     { fullname: 1, _id: 0 } // projection
)
```

**Task. Display user's country `1`**

```jsx
db.users.findOne(
     { _id: 1 },
     { country: 1, _id: 0 }
)
```

**Task. Add five tracks (`tracks`)**

```jsx
db.tracks.insertMany([
     { _id: 1, title: 'Track 1', duration_secs: 5 * 60, author_id: 1 },
     { _id: 2, title: 'Track 2', duration_secs: 4 * 60, author_id: 2 },
     { _id: 3, title: 'Track 3', duration_secs: 6 * 60, author_id: 3 },
     { _id: 4, title: 'Track 4', duration_secs: 7 * 60, author_id: 4 },
     { _id: 5, title: 'Track 5', duration_secs: 9 * 60, author_id: 5 }
])
```

**Task. Display the name and duration of the track `4`**

```jsx
db.tracks.findOne(
     { _id: 4 }, // filter
     { title: 1, duration_secs: 1, _id: 0 } // projection
)
```

**Task. Display the names of all tracks**

```jsx
db.tracks.find(
     {}, // filter
     { title: 1, _id: 0 }
)
```

**Task. Display user tracks `2` (except for the `author_id` field)**

```jsx
db.tracks.find(
     {author_id: 2},
     { author_id: 0, _id: 0 }
)
```

## Comparison operators

`$eq` equals (equal)

`$ne` is not equal

`$gt` greater than

`$gte` greater than or equal

`$lt` less than

`$lte` less than or equal

`$in` checks for membership in a list of values

`$nin` does not belong to the list of values

**Example. Display tracks with a duration of `5` min**

```jsx
db.tracks.find(
     { duration_secs: { $gte: 5 * 60 } }
)
```

**Task. Display tracks up to one hour in length (inclusive)**

(projection: `track_name`, `track_duration`)

```jsx
db.tracks.find(
     { duration_secs: { $lte: 60 * 60 } },
     { title: 1, duration_secs: 1, _id: 0 }
)
```

**Task. Display tracks with duration from `2` to `10` minutes**

```jsx
db.tracks.find(
     { duration_secs: { $gte: 2 * 60, $lte: 10 * 60 } }
)
```

## Additional operators
### `$exist` - checking the presence of a field.

Everyone who has an age field

```jsx
db.users.find({age: {$exists: true}});
```

### `$and` - logical and.

Let's find a person with age 34 and name != Anna:

```jsx
db.users.find({$and: [{age: 34}, {name:{$ne: "Anna"}}]});
```

### `$or` - logical or.

Let's find people who satisfy at least one condition:

```jsx
db.user.find({$or: [{age: 76}, {name: "Ded Igor"}]});
```

-------------------------------------------------------------------------------------

# Основы НЕреляционных БД

## Принципиальные отличия MongoDB от RDBMS

1. Другой язык для выполнения запросов (`NoSQL - QUERY API`)
2. Модель данных - **ДОКУМЕНТНАЯ** (документ - ассоц/массив)
3. Динамическая схема данных (без схемы, `schemaless`) - каждый документ может иметь свой набор полей
4. Использует `JSON` и Binary `JSON` (`BSON`)
5. Позволяет хранить вложенные структуры данных

```jsx
// пример
users = [
	{username: 'hacker', email: '123@example.org', is_blocked: true},
	{username: 'user1', email: 'hello@example.org', phone: '+0000000000'}
]
```

## Базовые структуры данных

1. Скаляр (скалярное значение)
2. Массив (список значений)
3. Ассоц/массив (пары ключ/значение)
4. Множество (список **уникальных** элементов)

## Категории запросов

1. `CRUD` - более простые запросы
2. Aggregation - получение вычисленных данных

## MongoDB: CRUD

**Create**

- `insertOne()` добавить один документ
  - один аргумент
    - ассоц/массив (объект)
- `insertMany()` добавить несколько документов
  - один аргумент
    - массив ассоц/массивов

**Read**

- `findOne()`  найти (выбрать) один документ
- `find()` найти (выбрать) несколько документов
  - аргументы
    - `filter`
    - `projection`
- `countDocuments()` ко-во совпадений
  - аргументы
    - `filter`

**Update**

- `updateOne()` изменить один документ
- `updateMany()` изменить несколько документов
  - аргументы
    - `filter`
    - `action`

**Delete**

- `deleteOne()` удалить один документ
- `deleteMany()` удалить несколько документов
  - аргументы
    - `filter`


## БД `music` сервис онлайн-прослушивания музыльных треков (Отдельный пример)

**Основые сущности**

- `users`
- `tracks`
- `playlists`

**Пример. Добавление юзеров**

```jsx
db.users.insertMany([
    { _id: 1, fullname: 'Ivan Ivanov', country: 'Germany' },
    { _id: 2, fullname: 'Petr Ivanov', country: 'USA' },
    { _id: 3, fullname: 'Sidr Ivanov', country: 'Germany' },
    { _id: 4, fullname: 'hacker', country: 'USA' },
    { _id: 5, fullname: 'noname', country: 'France' }
])
```

**Пример. Вывести всех юзеров**

```jsx
db.users.find()
```

**Пример. Вывести юзеров из `USA`**

```jsx
db.users.find(
    { country: 'USA' } // filter
)

// с проекцией
db.users.find(
    { country: 'USA' }, // filter
    { fullname: 1, _id: 0 } // projection
)

// с проекцией
db.users.find(
    { country: 'USA' }, // filter
    { country: 0 } // projection
)
```

**Задача. Вывести имена юзеров из `Germany`**

```jsx
db.users.find(
    { country: 'Germany' }, // filter
    { fullname: 1, _id: 0 } // projection
)
```

**Задача. Вывести страну юзера `1`**

```jsx
db.users.findOne(
    { _id: 1 },
    { country: 1, _id: 0 }
)
```

**Задача. Добавить пять треков (`tracks`)**

```jsx
db.tracks.insertMany([
    { _id: 1, title: 'Track 1', duration_secs: 5 * 60, author_id: 1 },
    { _id: 2, title: 'Track 2', duration_secs: 4 * 60, author_id: 2 },
    { _id: 3, title: 'Track 3', duration_secs: 6 * 60, author_id: 3 },
    { _id: 4, title: 'Track 4', duration_secs: 7 * 60, author_id: 4 },
    { _id: 5, title: 'Track 5', duration_secs: 9 * 60, author_id: 5 }
])
```

**Задача. Вывести название и продолжительность трека `4`**

```jsx
db.tracks.findOne(
    { _id: 4 }, // filter
    { title: 1, duration_secs: 1, _id: 0 } // projection
)
```

**Задача. Вывести названия всех треков**

```jsx
db.tracks.find(
    {}, // filter
    { title: 1, _id: 0 }
)
```

**Задача. Вывести треки юзера `2` (кроме поля `author_id`)**

```jsx
db.tracks.find(
    { author_id: 2 },
    { author_id: 0, _id: 0 }
)
```

## Операторы сравнения

`$eq` равно (equal)

`$ne` не равно (not equal)

`$gt` больше (greater than)

`$gte` больше или равно (greater than or equal)

`$lt` меньше (less than)

`$lte` меньше или равно (less than or equal)

`$in` проверка принадлежности к списку значений

`$nin` не принадлежит списку значений

**Пример. Вывести треки с продолжительностью от `5` мин**

```jsx
db.tracks.find(
    { duration_secs: { $gte: 5 * 60 } }
)
```

**Задача. Вывести треки продолжительностью до одного часа (включительно)**

(проекция: `название_трека`, `продолжительность_трека`)

```jsx
db.tracks.find(
    { duration_secs: { $lte: 60 * 60 } },
    { title: 1, duration_secs: 1, _id: 0 }
)
```

**Задача. Вывести треки продолжительностью от `2` до `10` мин**

```jsx
db.tracks.find(
    { duration_secs: { $gte: 2 * 60, $lte: 10 * 60 } }
)
```

## Дополнительные операторы
### `$exist` - проверка наличия поля.

Все у кого есть поле age

```jsx
db.users.find({age: {$exists: true}});
```

### `$and` - логическое и.

Найдем человека с возрастом 34 и именем != анна:

```jsx
db.users.find({$and: [{age: 34}, {name:{$ne: "Anna"}}]});
```

### `$or` - логическое или.

Найдем людей, удовлетворябщего хотя бы одному условию:

```jsx
db.user.find({$or: [{age: 76}, {name: "Ded Igor"}]});
```


