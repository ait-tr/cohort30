import appServices.Application;
import appServices.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

      //  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("appServices");

    //  appServices.Application app =(appServices.Application)  context.getBean("app");
        Application app = context.getBean("application", Application.class);
       // ((ConfigurableApplicationContext)context).close();


      //  app.setId(1);
      //  app.setName("App1");
     //   System.out.println(app.getId());
     //   System.out.println(app.getName());
      //  System.out.println(app.getOneService().getServiceName());

     /*  Service[] services = app.getServices();
       for(Service service : services)
           System.out.println(service.getServiceName());

      */



        // Autowiring

        System.out.println(app.getOneService().getServiceName());



    }
}
