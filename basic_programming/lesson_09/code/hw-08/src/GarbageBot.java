import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GarbageBot {
    public static void main(String[] args) throws IOException {
        System.out.println("Garbage Bot");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello. I`m a bot that will help you to sort a garbage!");
        System.out.println("Please enter the definition of the garbage that you want to throw away:");
        System.out.println("Type: paper, ...");

        String garbageName = br.readLine();
        garbageName = garbageName.toLowerCase();

        switch (garbageName) {
            // {} для тела case можно опускать
            case "paper":
                System.out.println("This garbage needs to throw away the GREEN bin");
                break;
            case "carton":
                System.out.println("This garbage needs to throw away the GREEN bin");
                break;
            case "plastic bag":
                System.out.println("This garbage needs to throw away the YELLOW bin");
                break;
            case "aluminum foil":
                System.out.println("This garbage needs to throw away the YELLOW bin");
                break;
            case "fruit":
                System.out.println("This garbage needs to throw away the BROWN bin");
                break;
            case "vegetables":
                System.out.println("This garbage needs to throw away the BROWN bin");
                break;
            case "other":
                System.out.println("This garbage needs to throw away the BLACK bin");
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}