# Сравнение, логические операторы, оператор if ... else 

## Сравнение
Операции сравнения: 
*  это > больше , x > y - логическое выражение
*  это < меньше , x < y
*  это == равно, x == y
*  это >=  больше или равно
*  это <=  меньше или равно
*  это != НЕ равно (<> - это в других языках)
- все это логические выражения. Логическое выражение 
принимает значение: ЛОЖЬ (false) и ПРАВДА (true)

## Логические операторы:
* Логическое отрицание, оно же NOT или инверсия. 
Обозначается символом “!” перед операндом. Применяется к одному операнду.
* Логическое И, оно же AND или конъюнкция. Обозначается символом “&” между двумя операндами, 
к которым применяется. Пример: x > 0 & x <10 
* Логическое ИЛИ в Java, оно же — OR, оно же — дизъюнкция. Обозначается символом “|” между 
двумя операндами. Пример: x < 0 | x >10  этом выражении ложь, когда x = 2, 3, ... 9   
* Исключающее или, XOR, строгая дизъюнкция. Обозначается символом “^” между двумя операндами. 
* Условное ИЛИ, обозначаемое как ||, проверяет первый операнд (условие).
* Условное И, обозначаемое как &&, проверяет первый операнд (условие).
* Условное ИЛИ, условное И полезно тогда, когда правое условие зависит от левого.

Результат операции сравнения  и логических операторов всегда имеет тип **boolean**,
то есть может быть либо ИСТИНА (true), либо ЛОЖЬ (false).
Третьего НЕ ДАНО!

Самым универсальный способ организовать выполнение какой-то части кода, 
в зависимости от условия, является использования оператора if-else. 
Этот оператор имеет полную форму, или сокращенную (без else)

**Общий вид:**
`if (условие){
команда_1;
команда_2;
...
} else {
команда_1;
команда_2;
...
}`

Сокращенный вид (упрощение оператора):
`if (условие) {
команда_1;
команда_2;
...
}`

Хорошая статья (полезный рессурс):
https://skillbox.ru/media/base/logicheskie_operatory_v_java/ 