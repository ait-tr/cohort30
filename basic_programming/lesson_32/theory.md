# Generics in Java
1. Um ein Array von Objekten zu sortieren, müssen Sie eine Regel zum Vergleichen von Objekten definieren.
   Das heißt, es muss eine Methode geben, die bestimmt, welches der beiden Objekte bedingt größer, kleiner oder gleich ist.

   Sie können Objekte nur anhand des Inhalts eines der Felder oder durch Bildung eines logischen Ausdrucks anhand mehrerer Felder vergleichen.
   Die Felder haben entweder einen numerischen Typ, in diesem Fall wird der Vergleich durch eine mathematische Methode durchgeführt, oder einen String-Typ, in diesem Fall erfolgt der Vergleich
   geschieht alphabetisch durch Gleichheit (lexikografisch-grafische Methode).

2. Java verfügt über eine Comparable<T>-Schnittstelle mit einer einzelnen abstrakten Methode int CompareTo(T e).
   Wir waren uns einig, dass, wenn die Methode „compareTo“ eine positive Zahl zurückgibt, das aktuelle Objekt (dies) bedingt ist
   mehr als ein Methodenargument. Wenn eine negative Zahl zurückgegeben wird, dann bedingt weniger.
   Wenn Null, dann sind dieses und das empfangene Argument gemäß den in der Methode angegebenen Vergleichskriterien gleich.

   Um eine Klasse sortierbar zu machen, muss sie Implements Comparable<T> hinzufügen und die Methode int CompareTo(T e) implementieren.

3. Java verfügt über eine Comparator<T>-Schnittstelle mit einer einzelnen abstrakten Methode int Compare(T e1, T e2).
   Das Funktionsprinzip ist das gleiche wie in der Comparable-Schnittstelle, nur vergleichen wir hier nicht dieses und das Argument (e),
   und zwei Argumente (e1 und e2).

4. Mit den Schnittstellen Comparable und Comparator können Sie Arrays von Objekten sortieren.
   Wenn alle Elemente des Arrays vergleichbar sind, wird beim Sortieren die Entscheidung getroffen, zwei Elemente des Arrays zu vertauschen oder nicht
   werden basierend auf dem Ergebnis der CompareTo-Methode akzeptiert.
   Wenn zur Sortierung zusätzlich zum Array selbst ein Objekt vom Typ Comparator übergeben wird,
   Anschließend wird die Entscheidung, die Elemente des Arrays neu anzuordnen, auf der Grundlage des Ergebnisses der Vergleichsmethode getroffen.

_________________________________________________________

# Сортировка массива объектов. Интерфейсы Comparable<T> и Comparator<T>. Лямбда выражения

1. Для сортировки массива объектов, надо определить правило сравнения объектов.
   Т. е. должен быть метод, который определяет какой из двух объектов условно больше, меньше или объекты равны.

    Сравнивать объекты можно только по содержимому одного из полей или строя логическое выражение, по нескольким полям.
    Поля имеют либо числовой тип, тогда сравнение происходит математическим методом, либо строковый, тогда сравнение 
    происходит через equals по алфавиту (лексико-графическим методом).

2. В Java существует интерфейс Comparable<T> с единственным абстрактным методом int compareTo(T e).
   Договорились, что если метод compareTo возвращает положительное число, то текущий объект (this) условно
   больше аргумента метода. Если возвращает отрицательное число, то условно меньше.
   Если ноль, то this и принимаемый аргумент одинаковы согласно указанному в методе критерию сравнения.

    Чтобы класс стал сортируемым, ему надо добавить implements Comparable<T> и реализовать метод int compareTo(T e).   

3. В Java существует интерфейс Comparator<T> с единственным абстрактным методом int compare(T e1, T e2).
   Принцип работы такой же как и в интерфейсе Comparable, только здесь сраниваем не this и аргумент (е),
   а два аргумента (е1 и е2).

4. Используя интерфейсы Comparable и Comparator, можно сортировать массивы объектов.
   Если все элементы массива Comparable, то при сортировке, решение менять или не менять местами два элемента массива
   принимаем на основе результата работы метода compareTo.
   Если для сортировки, кроме самого массива, передан объект типа Comparator,
   то решение о перестановке элементов массива, принимаем на основе результата работы метода compare.

