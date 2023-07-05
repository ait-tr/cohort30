package hw_20.library;

import hw_20.library.models.Book;
import hw_20.library.models.Library;

public class LibraryAppl {
    public static void main(String[] args) {

        Library library = new Library(1000);
        library.addBook(new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L));
        library.addBook(new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L));
        library.addBook(new Book("1984", "George Orwell", 1985,2000000000002L));

        System.out.println(library.getSize());

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
        
        // Поиск книг автора Lev Tolstoi
        Book[] booksF; // создаем массив типа Book
        System.out.println("Find books of Lev Tolstoi");


    }
}
