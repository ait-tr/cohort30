# Класс Arrays и его методы

1. Статический метод Arrays.toString, принимает в качестве аргумента массив,
   и возвращает его стринговое представление.

2. Статический метод Arrays.sort позволяет сортировать массив. Метод sort перегружен для разных типов.
   Он позволяет сортировать массивы примитывных данных, массивы объектов, если объекты класса Comparable,
   и массивы любых объектов, если в качестве аргумента также передан Comparator для сравнения элементов массива.

3. Статический метод Arrays.binarySearch позволяет искать элемент в массиве, используя алгоритм бинарного поиска.
   При этом массив обязательно должен быть отсортирован.

4. Arrays.binarySearch должен использовать тот же компаратор, при помощи которого массив был отсортирован.

5. Бинарный поиск возвращает индекс искомого элемента в массиве.
   Если элемент не найден, то возвращается индекс ожидаемой позиции для этого элемента со знаком минус,
   уменьшенный на единицу (- expectedPosition - 1).

6. Это позволяет реализовать затем вставку элемента на необходимую позицию.
   Шаг 1. Увеличиваем размер массива на 1.
   Шаг 2. Берем "хвост" массива от найденной позиции вправо до конца массива и копируем его со сдвигом
   вправо на одну позицию.
   Шаг 3. На освобожденную позицию ставим вставляемый элемент.

**Внимание!!!**
Результаты бинарного поиска в неотсортированном массиве не подлежат интерпретации.

# ENUM 

Тип перечисления — это специальный тип данных, который позволяет переменной быть набором предопределенных констант. 
Переменная должна быть равна одному из предопределенных для нее значений. Поскольку они являются константами, 
имена полей перечисляемого типа пишутся большими буквами. 

В языке программирования Java тип перечисления определяется с помощью ключевого слова enum. 
Например, вы можете указать тип перечисления дней недели следующим образом:  

	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}

Все перечисления неявно расширяют java.lang.Enum.
Вот ссылка на официальный Oracle туториал по перечисляемым типам:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

**Область применения ENUM**
Задачи, в которых имеется конечный перечень значений, например:
- дни недели
- месяцы в году
- времена года
- роли пользователей в системе
- ...
Иначе пришлось бы заводить массив соответствующего типа под каждый такой список.