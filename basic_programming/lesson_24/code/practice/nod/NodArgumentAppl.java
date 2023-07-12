package practice.nod;

public class NodArgumentAppl {
    public static void main(String[] args) { // в качестве аргумента передаем строки из массива args
        int n = args.length; // сколько параметров передали в командной строке

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

       Nod nod;
       nod = new Nod();

       System.out.println(nod.nod(a, b));

    }
}
