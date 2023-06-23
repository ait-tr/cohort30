package practice.book;

public class Book {
    //поля класса Book
    public String title; // название - title
    public String author; // автор - author
    public int year;// год  - year
    public long isbn;// уникальный номер - ISBN

    // методы класса Book
    // конструктор
    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public  void display() {
        System.out.print("Title " + title + ",");
        System.out.print("Author " + author + ",");
        System.out.print("Year " + year + ", ");
        System.out.print("ISBN " + isbn + ". ");
        System.out.println();
    }

    //геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1450 || year > 2023) {
            System.out.println("Wrong year of publishing");
            this.year = -1;
        } else {
            this.year = year;
        }
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
}
