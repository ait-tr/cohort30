package hw_22.ameba;

public class Ameba {
    public static void main(String[] args) {

//        Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
//        Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.

        int hours = 100;
        int qAmebas = 0;

        for (int i = 0; i < hours/3; i++) {
            qAmebas = (int) Math.pow(2,i);
        }
        System.out.println("Quantity of Ameba equal: " + qAmebas);

    }
}
