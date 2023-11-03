package practice;

public class Library {
    // Название библиотеки
    private String libraryName;

    // Адрес библиотеки
    private String address;

    // Количество книг в библиотеке
    private int bookCount;

    // Количество работников в библиотеке
    private int staffCount;

    // Общее количество библиотек
    private static int totalLibraries;

    // Конструктор
    public Library(String libraryName, String address, int bookCount, int staffCount) {
        this.libraryName = libraryName;
        this.address = address;
        this.bookCount = bookCount;
        this.staffCount = staffCount;
    }

    // Геттеры и сеттеры для полей
    // ...
}


