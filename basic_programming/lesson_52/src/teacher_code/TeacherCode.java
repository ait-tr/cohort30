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




/// Auto (HP, maxSpeed, weight)

// 23 45 6 7 18 33 1 14 50    11 12

//  23

// 1 6 7 11 12 14 18 23 33 45 50

//      45                  23                  23
//    /         ->       /      \    ->        /   \
//   23                 6       45            7     45
//                                           /
//                                          6


//                  14
//             /          \
//            7            33
//          /  \          /   \
//         6    12        23   50
//      /  \   /  \     / \   /   \
//     1      11       18    45



// rootNode(leftNode1(leftNode2(leftNode4, rightNode4), rightNode2(leftNode5, rightNode5)),
// rightNode1(leftNode3 (leftNode6, rightNode6), rightNode3(leftNode7, rightNode7)))