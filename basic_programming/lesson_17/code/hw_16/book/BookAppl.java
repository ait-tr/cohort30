package hw_16.book;

import hw_16.book.Book;

public class BookAppl {
    public static void main(String[] args) {
        // Создание нескольких экземпляров класса Book
        Book book1 = new Book(9781234567890L, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book(9789876543210L, "To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book(9780123456789L, "1984", 1949);
        // Вывод информации о каждой книге
        book1.display();
        book2.display();
        book3.display();
    }
}

