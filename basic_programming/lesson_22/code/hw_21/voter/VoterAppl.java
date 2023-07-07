package hw_21.voter;

public class VoterAppl {
    public static void main(String[] args) {
        Voter voter1 = new Voter("Antonina ", 47, "russian", "Hauptstr", 25, "Hennef");
        Voter voter2 = new Voter("Alexander ", 15, "german", "Hauptstr", 240, "Hennef");
        Voter voter3 = new Voter("John ", 13, "english", "Akazienweg", 6, "Hennef");

        Voter[] voters = new Voter[3];

        printArray(voters);

    }

    public static void  printArray(Object[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

}
