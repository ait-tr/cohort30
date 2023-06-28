package hw_17.book.model;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private int year;
 
    //Constructor 1 allgemein
    public Book(long isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    //Constructor ohne Autor
 
    public Book(long isbn, String title, int    year) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
    }
    // Constructor ohne isbn
 
    public Book(String title, String author, int    year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
 
        //Constructor ohne isbn , ohne Jahr
         
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
 
        //Gettere und Settere

    public long getIsbn() {
        return isbn;
    }
 
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
 
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
 
    public void setYear(int    year) {
        this.year = year;
    }
 
         
    // Methode Display
    public void displayBook(){
        String output = "";// erstellen der Ausgabe
 
        if ( isbn != 0 ){
            output += String.format("isbn: %d, ", isbn);//nachschauen; ob es isbn vorhanden ist und in output schreiben
        }
        if( author != null ) {// isEmpty schaut ob String ==leer ist
            output += String.format("author: %s, ", author);//nachschauen; ob es Author vorhanden ist und in output schreiben
        }
        if( year != 0 ) {
            output += String.format("year: %d, ",    year);//nachschauen; ob es    year vorhanden ist und in output schreiben
        }
        System.out.println(output + "Title: " + title);

        //System.out.println(" ISBN: "+isbn+", Author: "+author+", Title: "+title+", Year: "+   year);
    }

}
