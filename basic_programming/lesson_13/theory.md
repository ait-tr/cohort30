# Arrays
1. Why do we need data arrays?

## Examples of arrays that you know from life:
- a array_list of employees
- array_list of cases / assignments
- telephone book
- ...

## Definition:
* An array is a container object that holds a fixed number of values of a **single type**.
* An array can contain data of **ONLY ONE type**.
* The type of what is stored in the array is the types of variables that we have in the language, there are no others.

**Main characteristics of the array:**
- **type** of data placed in it (int, double, String, boolean, long ...),
- name (as VariableName ),
- length (natural number, cannot be negative) = array size (number of cells, length)
  must be defined in **int type**.

**IMPORTANT!** - You cannot change the length of an array after it has been created.

In arrays, as elsewhere in Java, **elements are numbered from zero**.

2. Array Declaration Syntax
- Step 1:
    - definition/setting of **type of stored data** (data of ONE type is stored in the array),
    - dimension planning (one-dimensional, two-dimensional, etc.) and size (depends on the amount of data)

- Step 2: Declaring and Initiating an Array

  TYPE[] array_name = new TYPE[size];
  The symbol "=" is a value assignment operator (it used to be written like this := )

  **Examples:**
  int[] array_num = new int[5]; - defined an array of integers, array length = 5
  String[] array_name = new String[10]; - defined an array of strings, array length = 10
  double[] array_results = new double[100]; - defined an array of fractional numbers, array length = 100

3. Filling the array
   After the array creation procedure, it is filled with default values.
- for int all elements = 0
- for float, double all elements = 0.0
- for String all elements = "null"
- for char all elements = '\0'
- for boolean all elements = false

Direct (manual) array filling:

int[] myArray = new int[3];
myArray[0] = 5;
myArray[1] = -19;
myArray[2] = 155;
__________________

         String[] directions = new String[4];
         directions = {"left", "right", "up", "down"};
         direction[0] = "left"
         .....
         direction[3] = "down"
         direction[5] - error, attempt to access a non-existent array element, out of range - going beyond the array

__________________

         int[] marks = {2, 5, 4, 5, 3, 5, 4, 1}; // you can also set an array this way
         double temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}

4. Access to array elements:
   An array element is accessed by **array name** and **element index** in it:
   arrayName[n] is the nth element in the array named arrayName, numbering starts from 0

# For loop

## Syntax
`for( initial parameter value; logical expression (condition); increment step) {
operator 1;
operator 2;
...
}`

Typically, a for loop is used to **iterate through all the values in an array**.
Typically, i = 0, i < array length, i++

Is it possible to build any cycles with a for loop? - More likely no than yes.

Can i-- be? The answer is YES, in this case the cycle is reversed.

## Applying a For Loop

### Filling the array in accordance with the mathematical pattern
* arithmetic progression
*    geometric progression
* values of a given function, e.g. x squared => i * i

### Filling the array with random data:

* double a = Math.random(); - generates a random number between [0, 1) - brackets from math
  [ => 0 - maybe, ) => 1 - can't be

* double x = (Math.random() * (b-a) ) + a - generates a random number between [a, b) (a<b)
  a - maybe, b - can't be

* int n = (int)(Math.random() * (b - a + 1) + a) - generates a random **integer** number in the interval [a, b]
  a - maybe b - maybe

## Common tasks and operations with arrays:
- search for an array element;
- adding a new element (to the beginning, to the end, to the middle);
- editing an array element;
- deleting an array element;
- search for the maximum/minimum value;
- sorting in ascending/descending order;
- removal of duplicates;
- array shift;
- removal of empty (zero) elements.

Gradually we will go through all these points.

## Workshop

________________________________


# Массивы
1. Зачем нужны массивы данных?

Главная функция массивов - хранение информации

   ##Примеры массивов, которые вам известны из жизни:
- список сотрудников
- перечень дел/поручений
- телефонная книжка
- склад чего-нибудь с товарами
- алфавит
- словарь 
- энциклопедия
- список станций метро
- расписание
- названия улиц, адреса
- адресная книга
- список жильцов + номера квартир
- любой список

есть переменная и тип данных => как их сохранять????
int X = 1000
int Y = 2000 

превратить в массив из  2-х чисел
int X[0], X[1], ...


## Defeenition:
* An array is a container object that holds a fixed number of values of a **single type**.
* В массиве могут содержаться данные **ТОЛЬКО ОДНОГО типа**.
* Тип того, что хранится в массиве - это типы переменных, которые у нас есть в языке, других нет.


**Главные характеристики массива:**
- **тип** помещённых в него данных (int, double, String, boolean, long ...),
- имя (как имяПеременной ),
- длина (натуральное число, не может быть отрицательным) = размер массива (количество ячеек, длина) 
нужно определять в **типе int**.

**ВАЖНО!** - изменить длину массива после его создания нельзя.

В массивах, как и везде в Java, **элементы нумеруются с нуля**.

2. Синтаксис объявления массива
- Шаг 1:
    - определение/задание **типа хранимых данных** (в массиве хранятся данные ОДНОГО типа),
    - планирование размераности (одномерные, двумерные, и т.д.) и размера (зависит от количества данных)
  
- Шаг 2: объявление и инициация массива

  ТИП[] имя_массива = new ТИП[размер];
  Символ " = " - это оператор присвоения значения (раньше его писали вот так := )

  **Прмеры:**
  int[] array_num = new int[5]; - определили массив целых чисел, длина массива = 5
  String[] array_name = new String[10]; - определили массив строк, длина массива = 10
  double[] array_results = new double[100]; - определили массив дробных чисел, длина массива = 1


3. Заполнение массива
   После процедуры создания массива он наполнен **значениями по умолчанию**.
- для int все элементы = 0
- для float, double все элементы = 0.0
- для String все элементы = "null"
- для char все элементы = '\0'
- для boolean все элементы = false




Прямое (ручное) заполнение массива:

		int[] myArray = new int[3]; 
массив называется myArray, тип данных - int , длина массива = 3

		myArray[0] = 5;
		myArray[1] = -19;
		myArray[2] = 155;
__________________

        String[] directions = new String[4];

        directions = {"left", "right", "up", "down"};
        direction[0] = "left"
        direction[1] = "right"
        .....
        direction[3] = "down"

        direction[4] = "up-side-down" - ошибка, попытка обращения к несуществующему элементу массива
        direction[5] - ошибка, попытка обращения к несуществующему элементу массива, 
                        out of range - выход за пределы массива
__________________
        
        int[] marks = {2, 5, 48, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
        double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
            temperature.length - возвращает длину массива


4. Доступ к элементам массива:
   Доступ к элементу массива получают по **имени массива** и **индексу элемента** в нем:
   arrayName[n] - это n-й элемент в массиве с именем arrayName, нумерация начинается с 0

# For loop

## Синтаксис
`for( начальное значение параметра int i = 0; логическое выражение (i < n); шаг приращения i++ ) {
    оператор 1;
    оператор 2;
    ...
}`

Как правило, цикл for используют для **перебора всех значений массива**.
Как правило, i = 0, i < длины массива, i++

Можно ли циклом for построить любые циклы? - Скорее НЕТ, чем да.

Может ли быть i-- ? Ответ - ДА, в этом случае цикл идет в обратном порядке.

## Применение цикла For

### Заполнение массива в соответствии с математической закономерностью
*    арифметическая прогрессия
*    геометрическая прогрессия
*    значения заданной функции, например x в квадрате => i * i

### Заполнение массива случайными данными:

* double a = Math.random(); - генерирует случайное число в интервале от [0, 1) - скобки из математики
  [ =>  0 - может быть, ) => 1 - не может быть

* double x = (Math.random() * (b-a) ) + a  - генерирует случайное число в интервале от [a, b) (a<b)
  a - может быть, b - не может быть

* int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное **целое** число в интервале [a, b]
  a - может быть, b - может быть

## Стандартные задачи и операции с массивами:
- поиск элемента массива;
- добавление нового элемента (в начало, в конец, в середину);
- редактирование элемента массива;
- удаление элемента массива;
- поиск максимального/минимального значения;
- сортировка по возрастанию/убыванию;
- удаление дубликатов;
- сдвиг массива;
- удаление пустых (нулевых) элементов.

Постепенно мы пройдем все эти пункты.

## Практикум