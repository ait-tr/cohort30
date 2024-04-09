package store;

public class InternetStore {
    private Item item;

  /*  public store.InternetStore(){
        item = new store.ItemImplementation();

        Bean (Бин)  and Context (контекст)

        Spring BeanFactory Container

        Spring ApplicationContext Container
        ApplicationContext interface

        bean properties:
        1. class
        2. name
        3. scope
        4. constructor-arq
        5.properties
        6.initialisation method
        7.destruction method

        методы передачи метаданных
        1. XML based configuration file
        2. Annotation-based configuration
        3. Java-based configuration
    }

   */
    public InternetStore(Item item){
        this.item = item;
    }

}
