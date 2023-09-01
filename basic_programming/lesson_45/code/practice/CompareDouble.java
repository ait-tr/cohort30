package practice;

public class CompareDouble {
    public static void main(String[] args) {
        double a = 19.45;
        double b = 10.67;

        int check = Double.compare(a,b);
        System.out.println(check);
    }
}
