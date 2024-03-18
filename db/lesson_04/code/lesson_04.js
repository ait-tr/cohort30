use("school_db");

// создали новую collection
// она называется users

// Добавили пользователя с именем Алишер
// db.users.insertOne({ name: "Alisher"});

// Добавили пользователя с именем Александр, возраст 35
// db.users.insertOne({name: "Alexandr", age: 35});

// Пример вложенности: поле адрес - это объект
// db.users.insertOne({
//   name: "Davit",
//   age: 34,
//   adress: { city: "Berlin" }
// });

// Массивы - добавление нескольких пользователей
// db.users.insertMany([
//   {name: "Egor", age: 25},
//   {name: "Ded Igor", age: 76}
// ]);
use("school_db");

// db.users.insertOne(
//   {
//     name: "John",
//     age: 20,
//     hobbys: ["music", 'serfing', 'sex', 'snowboard']
//   }
// );

// получить всех пользователей
// db.users.find();

// limit - ограничивает
// вывести первые три значения
// db.users.find().limit(3);

// Если хотим вывести упорядоченно
// sort - в алф порядке a...z
// db.users.find().sort({name: 1})
// в порядке от z...a
// db.users.find().sort({name: -1});

// сортировка по имени и потом по возрасту
// db.users.find().sort({name: -1, age: 1});

// как мы можем вывести и пропустить первые значения
// мы можем пропустить первых двух - вывели остальных
// db.users.find().skip(2);

// Но как найти всех пользователей по значениям?
// передадим соответсвующий параметр в find
// найдем человека с возрастом 34
// db.users.insertOne({name: "Anna", age: 34});
// db.users.find({age: 34});

// найдем первого попавшегося, удовлетворяющего условию
// db.users.findOne({age: 34});

// Операторы

// Больше $gt - greater then
// Получим всех старше 25
// У кого не был указан не попали в этот диапазон
// db.users.find({age: {$gt: 25}});

// Меньше $lt - less then
// db.users.find({age: {$lt: 25}});

// Меньше $lte - less or equal then - меньше или равно
// db.users.find({age: {$lte: 25}});

// Больше или равно $gte
// db.users.find({age: {$gte: 25}});

// Равно $eq
// всех у кого имя Егор
db.users.find({ name: { $eq: "Egor" } });

// Неравно $ne
// все у кого имя не егор
// db.users.find({name: {$ne: "Egor"}});

// все, у кого возраст не равен чему-то
// у кого не задано значение - тоже подойдут
// db.users.find({age: {$ne: 34}});

// Мы можем вибирать те поля, которые нужны
// вторым параметрам передаем в метод find
// db.users.find({age: 34}, {name: 1});

// Тоже самое, но без id
// db.users.find({age: 34}, {name: 1, _id: 0});

// выведем всех пользователей с возрастом 34
// у них покажутся - все поля кроме id
// db.users.find({age: 34}, {_id: 0});

// Оператор $in - входит в
// выведем всех с именами джон или анна
// db.users.find({name: {$in: ["John", "Anna"]}});

// Оператор $nin - not in - не входит в "черный лист"
// все у кого имя не джон и не анна
// db.users.find({name: {$nin: ["John", "Anna"]}});

// Логическое и - $and
// найдем человека с возрастом 34 и именем != анна
// db.users.find({$and: [{age: 34}, {name:{$ne: "Anna"}}]});

// Чаще всего можем обойтись без and
// db.users.find({age: 34, name: {$ne: "Anna"}});

// Логическое или
// db.user.find({$or: [{age: 76}, {name: "Ded Igor"}]});

// Отрицание
// все у кого возраст не больше семидесяти
// db.users.find({age: {$not: {$gt: 70}}});

// Exist - проверка наличия поля - $exist
// все у кого есть поле age
// db.users.find({age: {$exists: true}});
//  все у кого есть поле age - только их имена
// db.users.find({age: {$exists: true}}, {name: 1, _id:0 });

// db.users.insertMany([
//   {name: "Fred", salary: 2000, costs: 1500},
//   {name: "Kristina", salary: 1300, costs: 2500}
// ]);

// Вывести всех, кто живет по средствам: salary > costs
// $expr
// db.users.find({$expr: {$gt: ["$salary", "$costs"]}});

// Вывести тех, кто не живет по средствам: salary < costs
// db.users.find({$expr: {$lt: ["$salary", "$costs"]}});

//
// db.users.insertMany([
//   {name: "John Snow", hobbys: ["swords", "bows", "wolfs", "red-head"], age: 20},
//   {name: "Han Solo", hobbys: ["space", "blasters"], age: 36}
// ]);

// выбрать людей с хотя одним из указанных хобби: "space", "snowboard"
// db.users.find({hobbys: {$in: ["space", "snowboard"]}});

// Все  кто не интересуется "space", "snowboard"
db.users.find({ hobbys: { $nin: ["space", "snowboard"] } });
