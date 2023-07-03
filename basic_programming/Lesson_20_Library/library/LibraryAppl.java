package practice.library;

import practice.library.model.Book;
import practice.library.model.Library;

public class LibraryAppl {
    public static void main(String[] args) {
        // create Library
        Library library = new Library(10);
        // add book
        library.addBook(new Book(2000000000000l, "Book0", 1988));
        library.addBook(new Book(3000000000000l, "Book1", "Author1", 1998));
        // check size of Library
        System.out.println(library.getSize());
        // add 3 books more
        library.addBook(new Book(4000000000000l, "Book2", "Author1", 1995));
        library.addBook(new Book(5000000000000l, "Book3", "Author2", 1990));
        library.addBook(new Book(6000000000000l, "Book4", 1981));
        // check size of Library
        System.out.println(library.getSize());
        System.out.println(library.addBook(new Book(6000000000000l, "Book44", 1987)));
        System.out.println(library.getSize());
        // print all books
        library.printBooks();
        // find book
        Book book = library.findBook(5000000000000l);
        System.out.println(book);
        book = library.findBook(9000000000000l);
        System.out.println(book);
        // remove book
        book = library.removeBook(3000000000000l);
        // check size of Library
        System.out.println(library.getSize());
        // clear variable
        book = null;
        library.printBooks();
    }
}
