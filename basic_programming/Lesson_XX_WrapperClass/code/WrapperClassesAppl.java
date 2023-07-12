

public class WrapperClassesAppl {
    public static void main(String[] args) {

        // Как найти количество цифр в числе - способ 2 (1-й способ был с помощью деления на 10 в цикле)
        System.out.println("=============Digits in Number==========");
        Integer x1 = 1000;
        String myString = x1.toString();
        System.out.println("Number of digits in " + x1 + " are " + myString.length());

        // присвоение и вычисления
        System.out.println("________Присвоение и вычисления________________");
        int x = 20;
        Integer y = 10;
        System.out.println(x);
        System.out.println(y);
        y = y + 100;
        System.out.println(y);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);
        System.out.println("________________________");

        // методы с константами
        System.out.println("________Методы с константами________________");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.NaN);

        // как "обработать" деление на ноль?
        System.out.println("________Not-a-Number (NaN) _________");
        double a = 10.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong result");
        } else {
            System.out.println(a);
        }

        // работаем со строками

        System.out.println("______convert  Number to String __________________");
        String str1 = y.toString();
        System.out.println(str1);
        str1 = Integer.toString(x);
        System.out.println(str1);
        str1 = pi.toString();
        System.out.println(str1);
        str1 = Double.toString(a);
        System.out.println(str1);

        System.out.println("===== Parsing String to Number=====");
        str1 = "42";
        x = Integer.parseInt(str1);
        System.out.println(x - 10);
        str1 = "2.718281828";
        double exp = Double.parseDouble(str1);
        System.out.println(exp);
        Boolean check = true;
        System.out.println(check);

        System.out.println("===== Parsing Boolean to Number=====");
        str1 = "TrUe";
        check = Boolean.parseBoolean(str1);
        System.out.println(check);

        System.out.println("===== Character MAX and MIN values=====");
        System.out.println(0 + Character.MAX_VALUE);
        System.out.println((int) Character.MIN_VALUE);

    }
}
