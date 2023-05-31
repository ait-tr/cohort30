public class Main {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle with method");

        int a = 100; // 1-я сторона прямоугольника
        int b = 300; // 2-я сторона прямоугольника

        int per = perimeter(a, b); // вызов метода

        System.out.println("Perimetr = " + per);


    } // конец метода main
    //____________Methods_________

    public static int perimeter(int x, int y) { // метод получает на вход два целых числа
        // int p = (x + y) * 2;
        // return p;
        return 2 * (x + y); // возвращает результат
    }

    //__________end of Methods
} // конец класс Main