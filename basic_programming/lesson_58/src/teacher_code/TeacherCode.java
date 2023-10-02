package teacher_code;


import java.util.stream.Stream;

public class TeacherCode {
    public static void main(String[] args) {

        Stream.of("3", "4", "5") // 1. запуск потока
                //.map(i  -> System.out.println(i)); // 2. конвейерная операция
                .forEach(i -> System.out.println(i));  // 3. терминальная операция

        for (int i = 0; i < 100; i++) {



        }
    }
}
