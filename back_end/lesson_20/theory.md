

# Реализация endpoint-а для удаления урока из курса

* По правилам REST можно endpoint назвать так:

`DELETE /api/courses/{course-id}/lessons/{lesson-id}`



# Реализация endpoint-а для обновления урока (через курс)

`PUT /api/courses/{course-id}/lessons/{lesson-id}`


# Реализация endpoint-a для добавления студента в курс

`POST /api/courses/{course-id}/students`

```json
{
  "userId" : 4 
}
```

# Owner-связи

* Сохранение возможно только через Owner-а связи (владельца связи)
  * `JoinColumn` - OWNER
  * `JoinTable` - OWNER
  * `mappedBy` - не OWNER

# Получение всех студентов курса

`GET /api/courses/{course-id}/students`


