## REST API

* Свод правил и рекомендации для оформления правильного API для наших приложений
* `API` (Application Programming Interface) - это набор методов, который позволяет каким-либо образом взаимодействовать с чем-либо

* Примеры `API`:
  * Публичные методы класса
  * Набор классов/интерфейсов/аннотаций из какой-либо библиотеки
  * Все доступные HTTP-обработчики какого-либо сервера

## Правила и рекомендации

* Использование HTTP-методов (`GET` для получения, `POST` для добавления, `PUT` для обновления, `DELETE` для удаления) вместо указания названия операции в URL
  * Не по REST `POST /users/delete`
  * По REST: `DELETE /users/3` - удаление пользователя с id = 3
* URL именуем как "ресурсы", "вложенные папки":
  * Если хотим получить всех друзей пользователя с id = 3, то запрос будет такой:
    * `GET /users/3/friends`
  * Если хотим получить все заказы, сделанные в компании с id 5, то запрос будет такой:
    * `GET /companies/5/orders`
* Использование статусов ответа
  * `200` - OK
  * `201` - Created (ответ на POST-запрос)
  * `404` - Не найдено (ответ на некоторые GET-запросы)
  * `400` - Bad Request (плохой запрос, клиент отправил данные, которые сервер не может обработать)

## Еще немного про JDBC в Spring

* `JdbcTemplate` - специальный класс, который позволяет удобно работать с базами данных:
  * Отправлять запросы
  * Получать результаты
* `RowMapper` - специальный интерфейс, который описывает "функцию", преобразующую результирующую строку из БД в java объект
  * Можно реализовать в виде лямбда-выражения

* Здесь мы как раз описали лямбда-выражение как функцию с двумя парамерами (результирующая строка и ее номер в общем результате)
```
private static final RowMapper<User> USER_ROW_MAPPER = (row, rowNumber) -> {
        // логика преобразования row в нужный Java-объект
};
```

## Аннотации

* `@GetMapping("/users/{user-id}")` - метод, помеченный такой конструкцией, будет обрабатывать все запросы, где после `users` будет что-то указано
* Это что-то он поместит в специальную переменную, помеченную `@PathVariable`
* `@RequestMapping` - можно повестить на контроллер, чтобы ко всем обработчикам добавился нужный префикс
* `@RestController` - аннотация, которая позволяет не указывать `ResponseBody`

## Шаги для написания своего API

* Сделать так, чтобы все endpoints начинались с API и названия сущности, с которой вы работаете (`@RequestMapping("/api/users")`)
* Убрать все лишние `ResponseBody`, и заменить `@Controller` на `@RestController`
* Реализовать и задокументировать необходимые методы

## Хороший стиль

* При удалении, обновлении и добавлении всегда нужно возвращать ту сущность, с которой вы произвели эту операцию
* Это позволит Frontend-у отразить актуальную информацию в приложении
