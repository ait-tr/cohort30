package hw_17.book;

public class Dictionary extends Book {
    public String language;
    public String bilingual;
    public String dic_type;

    //Constructor
    public Dictionary(long isbn, String title, String author, int yearOfPublishing, String language, String bilingual, String dic_type) {
        super(isbn, title, author, yearOfPublishing);
        this.language = language;
        this.bilingual = bilingual;
        this.dic_type = dic_type;
    }
           
    //constructor ohne language und type
    public Dictionary(long isbn, String title, String author, int year, String bilingual) {
        super(isbn, title, author, year);
        this.bilingual = bilingual;
    }

    // constructor ohne type
    public Dictionary(long isbn, String title, String author, int year, String language, String bilingual) {
        super(isbn, title, author, year);
        this.language = language;
        this.bilingual = bilingual;
    }

    // constructor ohne bilingual


    //constructor ohne bilingual und language


    //Methode display
    public void displayBook(){
        super.displayBook();
//        this.language = language;
//        this.bilingual = bilingual;
//        this.type = type;
        String output = " ";// erstellen der Ausgabe
   
        if (language != null){
            output += String.format("Language: %s", language + " ");//nachschauen; ob es language vorhanden ist und in output schreiben
        }
        if(bilingual != null ) {
            output += String.format("Bilingual: %s", bilingual + " ");//nachschauen; ob es bilingual vorhanden ist und in output schreiben
        }
        if(dic_type != null) {
            output += String.format("Type: %s", dic_type + " ");//nachschauen; ob es phraseologicalPhrases vorhanden ist und in output schreiben
        }
        // System.out.println(output+"Title: "+title);
        System.out.println("This Dictionary "+ output);
    }

//Gettere and Settere
    public String getLanguage() {
        return language;
    }
   
    public void setLanguage(String language) {
        this.language = language;
    }
   
    public String getBilingual() {
        return bilingual;
    }
   
    public void setBilingual(String bilingual) {
        this.bilingual = bilingual;
    }
   
    public String getDic_type() {
        return dic_type;
    }
   
    public void setDic_type(String type) {
        this.dic_type = dic_type;
    }
}
