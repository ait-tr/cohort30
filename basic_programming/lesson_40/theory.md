# Java Time API

Java Time API is a set of classes and interfaces for working with date, time, calendar

## Application, use
Classes LocalDate, LocalTime, LocalDateTime are designed to create objects associated with the date,
time, date-time, respectively.
Objects of these classes are immutable.
These classes do not have public constructors.
Objects of these classes are created through static methods.
For example, the now() method creates an object associated with the current date or time.
With the of method, you can create an object associated with a specific date or time.

The LocalDate, LocalTime, LocalDateTime objects have many getters that allow you to get
date or time information.
For example, the getDayOfYear method will return the ordinal number of the day in the year.
And the getDayOfWeek method will return the DayOfWeek enum associated with the day of the week.

Objects LocalDate, LocalTime, LocalDateTime are comparable (Comparable).
In addition, using the isBefore, isAfter methods, you can find out the date comes before or after the argument.

The plus and minus methods and their variants allow you to add or subtract time intervals from dates.
Using enum ChronoUnit, you can determine what time intervals are in question.
For example, ChronoUnit.HOURS is hours and ChronoUnit.MINUTES is minutes. And so on.

ChronoUnit objects have methods. For example ChronoUnit.YEARS.between() takes two dates and returns
total number of years between them.

## Convert dates to strings and back
To convert dates to and from String, you must define a format according to ISO 8601.
DateTimeFormatter is a class responsible for formats. It has predefined formats in the form of constants.
Or, using the static method DateTimeFormatter.ofPattern(), you can create a format from a pattern.

The parse() method for date and time objects can create an object from a string in accordance with the specified format.
The format() method, on the contrary, converts the object to a string according to the given format.

## Useful links
Here is a link to the official Oracle tutorial on
<a href="https://docs.oracle.com/javase/tutorial/datetime/index.html"> Java Time API</a> and
link to
<a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html"> DateTimeFormatter</a>

____________________________________________________

# Java Time API

Java Time API, это набор классов и интерфейсов для работы с датой, временем, календарем

## Применение, использование
Классы LocalDate, LocalTime, LocalDateTime предназначены для создания объектов связанных с датой,
временем, датой-временем, соответсвенно. 
Объекты этих классов являются неизменными (immutable). 
У этих классов нет публичных конструкторов. 
Объекты этих классов создаются через статические методы. 
Например, метод now() создает объект связанный с текущей датой или временем. 
При помощи метода of можно создать объект связанный с конкретной датой или временем.

У объектов LocalDate, LocalTime, LocalDateTime есть множество геттеров, позволяющих получить 
информацию о дате или времени. 
Например, метод getDayOfYear вернет порядковый номер дня в году. 
А метод getDayOfWeek вернет enum DayOfWeek связанный с днем недели.

Объекты LocalDate, LocalTime, LocalDateTime сравниваемы (Comparable). 
Кроме того, при помощи методов isBefore, isAfter можно узнать дата идет до или после аргумента.

Методы plus, minus и их варианты позволяют прибавлять или вычитать из дат временные промежутки. 
При помощи enum ChronoUnit можно определять о каких временных промежутках идет речь. 
Например, ChronoUnit.HOURS - это часы, а ChronoUnit.MINUTES - минуты. И т. п.

У объектов ChronoUnit есть методы. Например ChronoUnit.YEARS.between() принимает две даты и возвращает 
полное колличество лет между ними.

## Преобразование дат в строки и обратно
Для преобразований дат в String и обратно необходимо определять формат в соответствии с ISO 8601. 
DateTimeFormatter это класс отвечающий за форматы. Он имеет предопределенные форматы в виде констант. 
Или при помощи статического метода DateTimeFormatter.ofPattern() можно создать формат по шаблону.

Метод parse() у объектов даты, времени может создать объект из стринга в соответствии с указанным форматом.
Метод format() наоборот, преобразует объект в стринг в соответствии с заданным форматом.

## Полезные ссылки
Вот ссылка на официальный Oracle туториал по 
<a href="https://docs.oracle.com/javase/tutorial/datetime/index.html"> Java Time API </a> и 
ссылка на
<a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html"> DateTimeFormatter </a>
