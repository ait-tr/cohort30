### Один-к-одному (One-to-One)

```sql
CREATE TABLE employees (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE contact_info (
  employee_id integer REFERENCES employees(id) UNIQUE,
  email text,
  phone_number varchar(9)
);
```

### Один-ко-многим (One-to-Many)

```sql
CREATE TABLE orders (
  order_number integer,
  customer_id integer REFERENCES customers(id),
);

CREATE TABLE customers (
  id integer PRIMARY KEY,
  name text
);
```

### Многие-ко-многим (Many-to-Many)

```sql
CREATE TABLE songs (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE artists (
  id integer PRIMARY KEY,
  name varchar(100)
);

CREATE TABLE songs_artists (
  artist_id integer REFERENCES artists(id),
  song_id integer REFERENCES songs(id),
  PRIMARY KEY (artist_id, song_id)
);
```

## Пример JOIN
```sql
SELECT
  *
FROM
  product
  JOIN category ON category.id = product.category_id;
```
