package teacher_code;


class TeacherCode {
    private static String catelbell;
    private static String weights;


    private String towel;


    public static void main(String[] args) {
        doSomething();


    }

    private static void doSomething() {
        System.out.println("Я делаю упражнение на общем тренажере с весом " + weights);
    }

    private void takeCare() {
        System.out.println("я взял небольшу паузу, чтобы передохнуть и вытереть лицо " + towel);
        System.out.println(weights);
    }

    private static class SomeClass {
        public static int x;
    }
}

