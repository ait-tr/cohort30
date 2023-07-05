package hw_20.library.models;

// добавление, удаление, поиск книги

public class Library {
    private Book[] books; // массив типа Book, куда попадут все книги в библиотеке
    private int size; // количество книг в библиотеке

    // метод класса, который задает размер библиотеки, т.е. длину массива Book
    public Library (int capacity) {
        books = new Book[capacity];
    }

    // метод добавление книги
    public boolean addBook(Book book) {
        if ((size == books.length) || findBook(book.getIsbn()) != null){
    return false; // не можем добавить книгу, так как нем места или такая книга уже есть
        }
        books[size] = book; // помещаем книгу в массив
        size++;
        return true;
    }

    // метод поиска книги по ISBN
    public Book findBook (long isbn){
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if(books[i].getIsbn() == isbn){ // проверяем совпадение ISBN
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    // метод поиска книги по названию
    public Book findBookTitle (String author) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (author.equals(books[i].getTitle())) { // проверяем совпадение строк в поле author
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    // метод поиска книг по автору
    public Book findBookAuthor (String author) {
        for (int i = 0; i < size; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                return books[i]; // возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    // метод возвращает размер библиотеки
    public int getSize(){
        return size;
    }

}
