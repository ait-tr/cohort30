import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Богатырь на распутье");
//        Богатырь приехал к камню с выбором трех путей - налево, направо или прямо.
//        Считайте с клавиатуры выбор богатыря и сообщите ему его судьбу:
//        left - loose your horse, right - loose your honor, forward - loose your head.
//        Использовать сравнение строк st.equals(), st - это имя переменной типа String

        Scanner scanner = new Scanner(System.in);
        System.out.println("left - loose your horse, right - loose your head, forward - loose your honor");
        System.out.println("What is your choice?");
        String direction = scanner.next();

        if (direction.equals("left")){
            System.out.println("loose your horse");
        }
        if (direction.equals("right")) {
            System.out.println("loose your head");
        }
        if (direction.equals("forward")) {
            System.out.println("loose your honor");
        }

    }
}