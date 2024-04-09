import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      //  HelloJava helloJava =(HelloJava) context.getBean("hello");
      //  helloJava.getMessage();

     //   context.registerShutdownHook();  // закрываем контекст

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloJavaConfig.class);
        HelloJava helloJava = context.getBean(HelloJava.class);
        helloJava.setMessage("Hello java");
        helloJava.getMessage();

        /*
        HelloJava helloJava1 =(HelloJava) context.getBean("hello");
        helloJava1.setMessage("I am hello-1");
        helloJava1.getMessage();

        HelloJava helloJava2 = (HelloJava) context.getBean("hello");
        helloJava2.getMessage();

         */







       /*
       Bean scopes
       singleton - каждый раз, когда нужен  бин будет возвращаться тот же самый бин
       prototype - когда в программе нужен такой бин, будет каждый раз возвращаться новый обьект
       request
       session
       global-session
        */

    }
}
