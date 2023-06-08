public class TernarniOperator {
    public static void main(String[] args) {
        System.out.println("Тернарный оператор");

        // Проверка на положительное число или отрицательное
        int number1 = -11;
        int number2 = 128;
        int number3 = 129;

        //(age >= 18) ? "Все в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!";

        String s = null;

        s = (number2 > 0) ? "Число положительное" : "Число отрицательное";

        System.out.println(s);

        // Прорверка на делимость на 3, 5 7

        s = ( number1 % 3 == 0 ) ? "делится на 3 " : " не делится на 3 ";
        System.out.println(s);
        s = ( number2 % 3 == 0 ) ? "делится на 3 " : " не делится на 3 ";
        System.out.println(s);
        s = ( number3 % 3 == 0 ) ? "делится на 3 " : " не делится на 3 ";
        System.out.println(s);

        // Проверка, что индекс меньше длины строки

        String s1 = "Победа";
        int l = s1.length(); // узнали длину строки

        int index = 6;
        s = (index < l ) ? "Индекс меньше длины строки" : "Индекс больше длины строки";
        System.out.println(s);

        // Проверка, что знаменатель не равен 0

        int d = 0;
        boolean isZero;

        isZero = (d == 0) ? true : false;
        System.out.println("Divider is equal 0 : " + isZero);

        // Проверка, что число положительное перед извлечением корня
    }
}
