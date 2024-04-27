

## Альтернативный подход

![image](https://raw.githubusercontent.com/ait-tr/cohort25/main/back_end/lesson_06/img/1.png)

* Реализовать backend как API (Application Programming Interface) - набор методов, который предоставляется backend-ом
* Тогда каждый тип клиента может отдавать/принимать JSON и отображать это так, как ему нужно
* Сервер при этом не думает о том, как это выглядит, а только манипулирует данными

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john@gmail.com",
  "password": "qwerty007"
}
```

## Замечания

* Очень важно при получении запроса на сохранение сущности (например POST-запрос) в ответе вернуть эту же сущность.
* Тогда Frontend может иметь актуальную информацию о добавленной сущности (например, ее id, который присвоил backend). 

## Аннотации Spring

* `@ResponseBody` - обозначает, что метод возвращает не название страницы, а полноценный JSON-объект
* `@RequestBody` - обозначает, что метод принимает на вход не HTTP-форму, а полноценный JSON-объект

## Аннотации lombok

* ВАЖНО: проверьте `plugins` - плагины IDEA

* `@RequiredArgsConstructor` - автоматически создает конструктор для final-полей
* `@Getter` - автоматически создает геттеры на все поля
* `@Setter` - автоматически создает сеттеры на все поля
* `@AllArgsConstructor` - автоматически создает конструктор для всех полей
* `@NoArgsConstructor` - автоматически создает пустой конструктор

## Swagger

* Предназначен для документации вашего API
* Автоматически сканирует ваши контроллеры и генерирует сайт с документацией:
  * `http://localhost:8080/swagger-ui/index.html`
* Используя аннотации `@Tags`,`@Operation`,`@Schema` можно задокументировать контроллеры и DTO.

## H2 база данных

* H2 - это минимальная СУБД, как правило, используется только для тестирования, потому что не очень хорошо работает с большими данными
* Аналог MySQL, PostgreSQL, OracleDB
* Данные может хранить в оперативной памяти и в файле

## 03. Подключение базы данных в Spring Boot приложении

* Подключить зависимости в `pom.xml`:

```xml

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>2.2.222</version>
    <scope>runtime</scope>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

* Достаточно указать настройки в `application.properties`
* Spring Boot умеет сам подключаться по этим настройкам к базе
* Если мы хотим хранить данные в оперативной памяти (т.е. база будет очищаться после перезапуска приложения)

```
spring.datasource.url=jdbc:h2:mem:shop_db
```

* `jdbc` - протокол подключения к базам данных в Java
* `h2` - тип базы данных
* `mem` - показывает, что база будет размещаться в оперативной памяти
* `shop_db` - название базы данных
