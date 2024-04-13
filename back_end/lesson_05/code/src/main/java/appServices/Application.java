package appServices;

import appServices.Service;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component
//@Scope("prototype")
public class Application {



    /*
В проекте на Maven создать класс appServices.Application с полями id и name, а также геттеры и сеттеры для этих полей
Создать бин этого класса, используя XML файл
Установить scope бина прототип
В классе appServices.Application создать метод инициализации бина
В классе Main получить этот бин , установить id и имя и вывести их на экран
    bean
     */

    @Autowired
    @Qualifier("messageService")
    private Service oneService;

    @Autowired
    private Service[] services;

    @Value("12345")
    private int id;
    private String name;



   // @Autowired   через конструктор
    public Application(@Qualifier("messageService") Service oneService){
        this.oneService = oneService;
    }

  //  @Autowired    через конструктор
    public Application( Service[] services){
        this.services = services;
    }

    public Service getOneService() {
        return oneService;
    }

   // @Autowired    через сеттер
   // @Qualifier("messageService")
    public void setOneService(Service oneService) {
        this.oneService = oneService;
    }

    public Service[] getServices() {
        return services;
    }

   // @Autowired  через сеттер
    public void setServices(Service[] services) {
        this.services = services;
    }

    public Application(){}

    public Application(@Value("123") int id){
        this.id = id;
    }

    public Application( int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Value("567")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("The bean has been initialized");
    }

}
