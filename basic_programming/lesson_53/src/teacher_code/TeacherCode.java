package teacher_code;

import practice.MockService;

import java.util.ArrayList;
import java.util.Set;

public class TeacherCode {
    public static void main(String[] args) {
        Set<Integer> integerSet  =Set.of(1, 2, 3);
        ArrayList<Set<Integer>> listOfSet = new ArrayList<>();
        listOfSet.add(integerSet);
        System.out.println(listOfSet.contains(integerSet));


        MockService service1 = MockService.create("user1", "password1");
        MockService service2 = MockService.create("user1", "password2"); // не будет создан

        if (service1 != null) {
            System.out.println(service1.getData("user1", "password1")); // Должно вывести данные
            System.out.println(service1.getData("user1", "password2")); // Неверный логин или пароль
        }

        if (service1 != null) {
            service1.updatePassword("user1", "password1", "newPassword1"); // Пароль успешно обновлен
        }
    }
}
