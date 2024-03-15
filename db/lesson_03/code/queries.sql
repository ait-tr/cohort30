 CREATE TABLE farmer
  (
    id serial PRIMARY KEY,
    height int,
    age int,
    name varchar,
    number_of_children int,
    country varchar
  );

INSERT INTO
  farmer (name, height, age, number_of_children, country)
VALUES
  ('Johanes', 180, 47, 5, 'Germany'),
  ('Pierre', 175, 40, 2, 'France'),
  ('Gerard', 184, 60, 4, 'Germany'),
  ('Marek', 168, 51, 0, 'Poland'),
  ('Hans', 177, 30, 1, 'Germany');

SELECT * FROM farmer WHERE age < 40;

-- % - wildcard заменяет несколько 
SELECT * FROM farmer WHERE name LIKE '%s';
-- _ - wildcard заменяет один символ

-- explain - можно получить метаинформацию о запросе
EXPLAIN SELECT * FROM farmer WHERE name LIKE 'Han_';

SELECT * FROM farmer WHERE name ILIKE 'han_';

SELECT name FROM farmer WHERE country IN ('France', 'Poland');

-- insert into farmer (height, name, number_of_children) values 
-- (160, 'Vlad', 1);
SELECT * FROM farmer WHERE age IS NULL;

SELECT * FROM farmer WHERE age IS NOT NULL;

SELECT * FROM farmer WHERE height NOT BETWEEN 177 AND 180;

SELECT COUNT(*) FROM farmer WHERE height BETWEEN 177 AND 180;

SELECT AVG(height) AS avarage_height FROM farmer;

SELECT MIN(age) AS max_age FROM farmer;

-- средний рост по странам
SELECT
  country,
  AVG(height) AS average_height
FROM
  farmer
GROUP BY
  country;

-- самые молодые по странам
  SELECT
  country,
  MIN(age) AS min_age
FROM
  farmer
GROUP BY
  country;

-- страны у которых феремеров больше двух, с указанием количества
  SELECT
  country,
  COUNT(id)
FROM
  farmer
GROUP BY
  country
HAVING COUNT(id) >= 2;


-- CREATE TABLE product (
--     id serial,
--     name text,
--     price numeric CHECK (price > 0)
-- );

-- из-за того что -15 отрицательное код упадет с ошибкой
insert into product (name, price) values 
('toy', 10),
('rotten cabbage', -15);

-- ограничению можно задать имя с помощью ключевого слова CONSTRAINT

-- CREATE TABLE product (
--     id serial,
--     name text,
--     price numeric CONSTRAINT positive_price CHECK (price > 0)
-- );


insert into product (name, price) values 
('toy', 10),
('rotten cabbage', -15);

-- Ошибки связанные с ограничениями

-- CREATE TABLE product (
--     id serial,
--     name text,
--     price numeric,
--     CHECK (price > 0),
--     discounted_price numeric,
--     CHECK (discounted_price > 0),
--     CONSTRAINT valid_discount CHECK (price > discounted_price)
-- );

-- INSERT INTO product (name, price, discounted_price) 
-- VALUES ('iphone', 400, 390);

UPDATE product SET discounted_price = 500 WHERE id = 2;


-- CREATE TABLE product (
--     id serial NOT NULL,
--     name text NOT NULL,
--     price numeric
-- );

INSERT INTO product (price) VALUES (20);


-- CREATE TABLE dress (
--     id serial NOT NULL,
--     title text NOT NULL,
--     price numeric,
--   	CONSTRAINT dress_must_be_unique UNIQUE(title)
-- );

-- здесь будет ошибка
INSERT INTO dress (title, price) VALUES 
('little black', 400),
('yellow stripes', 120),
('little black', 180);



-- CREATE TABLE
--   truck (
--     id serial PRIMARY KEY,
--     farmer_id integer REFERENCES farmer (id),
--     brand varchar
--   );
 

-- здесь ошибка, потому что нет фермера под номером 8 
INSERT INTO truck (farmer_id, brand) VALUES
(8, 'Mercedes');

-- дали кастомное название ограничению
CREATE TABLE
  truck (
    id serial PRIMARY KEY,
    farmer_id integer,
    brand varchar,
    CONSTRAINT truck_fk FOREIGN KEY(farmer_id) REFERENCES farmer(id)
  );

-- разберем каскадное удаление 

-- CREATE TABLE
--   truck (
--     id serial PRIMARY KEY,
--     farmer_id integer REFERENCES farmer (id) ON DELETE CASCADE,
--     brand varchar
--   );

-- INSERT INTO
--   truck (farmer_id, brand)
-- values
--   (2, 'WildCat'),
--   (3, 'Mercedes'),
--   (3, 'Belarus');
  
DELETE FROM farmer WHERE id = 3;
-- удалили фермера, его трактора удалились вместе с ним