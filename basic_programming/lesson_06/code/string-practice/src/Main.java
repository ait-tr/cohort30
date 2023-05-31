public class Main {
    public static void main(String[] args) {
        System.out.println("String practice");
        String st = "I like Java! Java is the best way to earn good salary in IT.";
        System.out.println(st); // печатаем строку
        // Распечатать последний символ строки. Используем метод String.charAt().
        int l = st.length(); // опрделяем длину строки
        System.out.println("Length of string is: " + l); // выводим длину строки на печать

        char lastSymbol = st.charAt(st.length() - 1); // так мы узнали последний символ
        System.out.println("Last symbol is: " + lastSymbol);

        // Найти позицию подстроки “Java” в строке “I like Java!”.
        String st1 = "I like Java!"; // задали строку
        int index = st1.indexOf("Java"); // узнаем с какого индекса начинается слово Java
        System.out.println("Java starts from index " + index); // печатаем результат

        int index1 = st1.indexOf("like");
        System.out.println("like starts from index " + index1);

        // Проверить, содержит ли заданная строка подстроку “Java”. Используем метод String.contains().
        boolean yesOrNo = st.contains("Java");
        System.out.println(yesOrNo); // печатаем результат => true

        // Заменить все символы “а” на “о”.
        String stNew = st.replace("a", "o"); // делаем замену в строке st всех букв "a" на букву "о"
        System.out.println(stNew); // заменяем и печатаем

        // Преобразуйте строку к верхнему и нижнему регистру.
        String stNew1 = st.toLowerCase(); // переводим строку в нижний регистр
        System.out.println(stNew1); // печатаем результат

        String stNew2 = st.toUpperCase(); // переводим строку в верхний регистр
        System.out.println(stNew2); // печатаем результат

        // Вырезать строку Java c помощью метода String.substring().
        String stNew3 = st.substring(7, 11); // вырезаем
        System.out.println(stNew3); // печатаем

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith(),
        //   привыкаем к типу boolean.
        String stNew4 ="I like Java!!!";
        yesOrNo = stNew4.endsWith("!!!"); // выясняем
        System.out.println(yesOrNo);

    }
}