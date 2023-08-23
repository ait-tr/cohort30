# Exceptopns, Try ... catch, throw. FileIO

## Exceptopns, Try ... catch, throw.

An error in a method breaks it at the point of origin of the error, and destroys the entire function stack.
At the same time, Java creates and "throws" a special object characterizing the error.
All such objects inherit the **Throwable** class.

All Throwable descendants fall into two categories: **Error** and **Exception**.
Error - these are errors with which nothing can be done. For example, lack of memory.
The second category, Exception, is an exception caused by an incorrect program state.

There are two types of errors: **checked** (checked) and **unchecked** (unchecked).
The compiler "sees" the first type and forces the programmer to react to them somehow.
How to react to unchecked errors (and whether to react at all) is up to the developer to decide.

Error handling is done using the **try-catch-finally** construct.
In try blocks, we specify what to do if everything is fine. We handle errors in the catch block.
The finally block is executed anyway.

We can create our own errors and "throw" them with the throw keyword.
If we want to create a checked exception, then we can inherit from the Exception class.
If unchecked, then we inherit the RuntimeException class.

If we encounter a checked exception, but do not want to handle it in this method with
try-catch and decide to throw this exception to the calling method, you can use the key
the word throws in the method signature.
______________________

# Exceptions

Exception - exception, special situation (translated from English)

## Major reasons why an exception Occurs
* **Invalid user input - invalid user input (80-90% of cases)**
* Device failure - the device is broken, the power is turned off, etc.
* Loss of network connection - lost Internet, Ethernet, etc.
* Physical limitations (out of disk memory) - lack of memory RAM, hard drives
* Opening an unavailable file - opening an unavailable file
* * **Code errors - code errors of programmers**

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

The **try ... catch** construct is used when the program exits.
incorrectly, Program exit code is different from 0.

### Syntax
`try { // try
// Block of code to try

}
catch(Exception e) { // catch
// Block of code to handle errors
}`
#### Explanations
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Many exceptions and user errors can be handled by yourself using if , BUT WHY?
Java developers provide a standard toolkit for this -
this is the Throwable class (a descendant of the Object class) and its methods.

Examples:
1. Division by 0;
2. Out of bounds array;
3. Checking user input for correctness.

Good article with examples:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

try ... catch algorithm
1. If the program crashes (end code is not equal to 0), work with the user stops
2. then we look at diagnostics - what is printed at the time the program crashes, there are indications of line numbers
   in the code where errors occur
3. These lines should be "dressed" with a try ... catch construction

____________________________________________

## Files I/O

### The file structure contains:
- directories and subdirectories
- sequence of nested directories \directory_name\name_of_another_directory\
- this is called the path (path) to the file

- files: a named area of memory containing two parts in the name, separated by an exact:
    - file name
    - name extension, for example .txt, .doc or yuvsch .docx - these are MS Word program files, .jpg, .pdf, which says
      about the type of information stored in the file.

### Working with files from Java code
Opening the link
https://www.w3schools.com/java/java_files.asp
We take code examples and try to implement them ourselves.

Step 1. File creation
`import java.io.File; // Import the File class
File myObj = new File("filename.txt"); // Specify the filename`

Step 2. Writing information to a file
`FileWriter myWriter = new FileWriter("filename.txt");
myWriter.write("Files in Java might be tricky, but it is fun enough!");
myWriter.close();
`
Step 3. Reading information from a file
`File myObj = new File("filename.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);`
`myReader.close();`

____________________________________________

Abstract class **Writer**, contains methods for writing a single character

_____________________________________________

# Exceptopns, Try ... catch, throw. File IO

## Exceptopns, Try ... catch, throw.

Ошибка в методе, прерывает его работы в точке происхождения ошибки, и разрушает весь стек функций.
При этом Java создает и "пробрасывает" специальный объект характеризующий ошибку. 
Все такие объекты наследуют классу **Throwable**.

Все наследники Throwable делятся на две категории: **Error** и **Exception**. 
Error - это ошибки с которыми ничего сделать нельзя. Например, нехватка памяти.
Вторая категория, Exception - исключительные ситуации вызванные некорректным состоянием программы.

Ошибки бывают двух типов: **checked** (проверяемые) и **unchecked** (непроверяемые). 
Первый тип компилятор "видит" и заставляет программиста как-то на них отреагировать. 
Как реагировать на непроверяемые ошибки (и реагировать ли вообще), решает сам разработчик. 

Обработка ошибок осуществляется при помощи конструкции **try-catch-finally**. 
В блоки try мы указываем, что делать если все нормально. В блоке catch обрабатываем ошибки. 
Блок finally выполняется в любой случае.

Мы можем создавать свои ошибки и "бросать" их при помощи ключего слова throw. 
Если мы хотим создать проверяемое исключение, то можно наследовать классу Exception. 
Если непроверяемое, то наследуем классу RuntimeException.

Если мы столкнулись с проверяемым исключением, но не хотим его обрабатывать в данном методе при помощи 
try-catch, и решили пробросить это исключение в вызывающий метод, то можно воспользоваться ключевым 
словом throws в сигнатуре метода.
______________________

# Exceptions

Exception - исключение, особая ситуация (перевод с английского)

## Major reasons why an exception Occurs
* **Invalid user input - неправильный ввод пользователя (80-90% случаев)**
* Device failure - сломалось устройство, выключили питание и т.д.
* Loss of network connection - потеряли Интернет, Ethernet и т.д.
* Physical limitations (out of disk memory) - нехватка памяти ОЗУ, жестких дисков
* Opening an unavailable file - открытие недоступного файла
* * **Code errors - ошибки кода программистов**

### Differences between Error and Exception that is as follows:
* **Error:** An Error indicates a **serious problem** that a reasonable application
  should **not try to catch**.
* **Exception:** Exception indicates **conditions** that a reasonable application
  **might try to catch**.

Кострукция **try ... catch** используется в тот момент, когда программа завершает работу
некорректно, Code выхода из программы отличен от 0.

### Синтаксис
`try { // попытаться
//  Block of code to try

}
catch(Exception e) { // схватить
//  Block of code to handle errors
}`
#### Пояснения
The **try** statement allows you to define a block of code
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Многие исключения и ошибки пользователя можно обрабатывать самому с помощью if , НО ЗАЧЕМ?
Разарботчики Java предоставляют стандартный инструментарий для этого -
это класс Throwable (потомок класса Object) и его методы.

Примеры:
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность.

Хорошая статья с примерами:
https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

Алгоритм применения try ... catch
1. Ели программа падает (код окончания не равен 0) , работа с пользователем прекращается
2. то смотрим на дигностику - то, что печатается в момент падения программы, там есть указания на номера строк
   в коде, в которых происходят ошибки
3. На эти строки надо "одеть" конструкцию try ... catch

________________________________________

## Files I/O

### Файловая сруктура содержит:
- директории и вложенные директории
- последовательность вложенных директорий \имя_директории\имя_еще_одной_директории\
- это называется путь (path) к файлу

- файлы: именованная область памяти, содержащая в имени две части, разделенные точной:
    - имя файла
    - расширение имени, например .txt, .doc или ювщ .docx - это файлы программы MS Word, .jpg, .pdf, которое говорит
      о типе хранимой в файле информации.

### Работаем с файлами из Java-кода
Открываем ссылку
https://www.w3schools.com/java/java_files.asp
Берём примеры кода и пробуем реализовать у себя.

Шаг 1. Создание файла
`import java.io.File;  // Import the File class
File myObj = new File("filename.txt"); // Specify the filename`

Шаг 2. Запись информации в файл
`FileWriter myWriter = new FileWriter("filename.txt");
myWriter.write("Files in Java might be tricky, but it is fun enough!");
myWriter.close();
`
Шаг 3. Чтение информации из файла
`File myObj = new File("filename.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);`
`myReader.close();`

________________________________________

Абстрактный класс **Writer**, содержит методы, предназначенные для записи одного символа в поток. 
Класс **FileWriter** расширяет класс Writer, и имплементирует методы родительского класса для записи 
символа в файл.

Абстрактный класс **Reader**, содержит методы, предназначенные для чтения одного символа из потока. 
Класс **FileReader** расширяет класс Reader, и имплементирует методы родительского класса для чтения 
символа из файла.

Класс **BufferedReader** и **PrintWriter**, позволяют буфферизировать чтение и запись символов из/в поток. 
Т. е. содержат методы, предназначенные для чтения/записи сразу группы символов (String).

**System.in** - объект типа InputStream связанный с консолью как источником. 

Объект созданный как new BufferedReader(new InputStreamReader(System.in) позволяет считывать строки 
с консоли при помощи метода readLine.


