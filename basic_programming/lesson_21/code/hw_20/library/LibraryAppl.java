package hw_20.library;

import hw_20.library.models.Book;
import hw_20.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {

        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L));
        library.addBook(new Book("1984", "George Orwell", 1985,2000000000002L));

        Book bookFinded =  library.findBook(2000000000001L);
        System.out.println(bookFinded);

        System.out.println(library.findBook(2000000000001L));

        System.out.println(library.findBookTitle("War and Peace"));
        System.out.println();

        Book[] books; // создаем массив типа Book

        books = new Book[4];
        // создаем конкретные объекты класса Book
        books[0] = new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L);
        books[1] = new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        // добавили книги в библиотеку

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }
        System.out.println(library.getSize());
        System.out.println("Find books of Lev Tolstoi");
        Book[] booksF; // массив для результатов поиска
        booksF = library.findBookAuthor("Lev Tolstoi", books);
        for (int i = 0; i < booksF.length; i++) {
            System.out.println(booksF[i]);
        }
        // удаление книги из библиотеки
        System.out.println("Removed book:");
        System.out.println(library.removeBook(2000000000000L, books));

        System.out.println("Library size: "  + library.getSize());
        // печать массива книг
        for (int i = 0; i < library.getSize(); i++) {
            System.out.println(books[i]);
        }

    }
}
