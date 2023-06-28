package hw_17.book;

import hw_17.book.model.Book;
import hw_17.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book(1234567890L,"Es", "Stephen King", 2016);
        Book book2 = new Book(1342567890L,"Lonely Heart",2009);
        Book book3 = new Book("Die menschliche Seele: Kitab ar-Ruh", "Ibn Qayyim al-Gawziyya", 2020);
        Book book4 = new Book("The Witcher","A. Sapkowski");

        book1.displayBook();
        System.out.println();
        book2.displayBook();
        System.out.println();
        book3.displayBook();
        System.out.println();
        book4.displayBook();

        System.out.println();
        Dictionary dic1 = new Dictionary(123L, "Title", "Author", 1900, "English", "Rus-Eng", "no");
        dic1.displayBook();
        System.out.println();
        Dictionary dic2 = new Dictionary(456L, "Title 2", "Author2", 1901, "Rus-Fra");
        dic2.displayBook();

        Dictionary dic3 = new Dictionary(12345555465347L,"Dictionary","Langenscheidt",2019,"Deutsch");
        dic3.displayBook();

    }

}
