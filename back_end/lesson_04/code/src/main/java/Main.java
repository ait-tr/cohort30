import configs.MyConfig;
import entities.Car;
import entities.Plane;
import entities.Train;
import entities1.Season;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
             //   new AnnotationConfigApplicationContext("entities");
                new AnnotationConfigApplicationContext(MyConfig.class);

        Car car = context.getBean(Car.class);
        Train train =(Train) context.getBean("getTrain");
        Plane plane = context.getBean("plane-super",Plane.class);

        System.out.println(car.getName());
        System.out.println(train.getName());
        System.out.println(plane.getName());

        Season seasonName = context.getBean(Season.class);
        System.out.println("You like " + seasonName.getSeason());
    }
}
