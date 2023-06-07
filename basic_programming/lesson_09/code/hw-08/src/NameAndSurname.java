import java.util.Scanner;

public class NameAndSurname {
    public static void main(String[] args) {
//        Написать программу, в которую пользователь вводит имя и фамилию в одну строку через пробел.
//        Программа должна выводить имя и фамилию на разных строках.
//        Первая буква имени и фамилии больжны быть большими не зависимо от того,
//        как их ввел пользователь, лишние пробелы должны быть удалены.
//        (повторение методов String)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name and surname:");
        String st = scanner.nextLine();

        // int l = name.length();
        st = st.trim();
        int indexOfSpace = st.indexOf(" ");

        String name = st.substring(0, indexOfSpace);
        String surname = st.substring(indexOfSpace + 1, st.length());

        System.out.println(name);
        System.out.println(surname);

        name = stringCorrected(name);
        surname = stringCorrected((surname));

        System.out.println(name);
        System.out.println(surname);

    }
    // ___________Methods______________
    public static String stringCorrected (String string) {
        char firstLetter = string.toUpperCase().charAt(0);
        String stringRest = string.substring(1,string.length());
        return firstLetter + stringRest;
    }
    //___________end of Methods________
}


    // char firstLetterOfName = st.charAt(0);