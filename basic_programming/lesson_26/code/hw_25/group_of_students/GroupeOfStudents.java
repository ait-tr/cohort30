package hw_25.group_of_students;

public class GroupeOfStudents {
    public static void main(String[] args) {
//        Имеется список студентов с их фамилиями (задать внутри программы).
//        Распределить студентов на 2 примерно равных группы (+/- 1 человек) случайным образом.
//        - сначала написать словами алгоритм того, как это будет делаться;
//        - реализовать алгоритм в коде;
//        - при реализации использовать метод(ы);
//        - создать тесты.

        String[] students = {"Student1", "Student2", "Student3", "Student4", "Student4", "Student5", "Student6", "Student7"};





    }

}






/*
int l = students.length;
        int l1 = l/2;
        int l2 = l - l1;

        String[] students1 = new String[l1];
        String[] students2 = new String[l2];

        int a = 0;
        int b = 1;
        int m = 0;
        int n = 0;
        for (int i = 0; i < students.length; i++) {
            int coin = (int)(Math.random() * (b - a + 1) + a);
            if(coin == 1) {
                students1[m] = students[i];
                m++;
            } else {
                students2[n] = students[i];
                n++;
            }
        }

        System.out.println("Group 1");
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
        }

        System.out.println();
        System.out.println("Group 2");
        for (int i = 0; i < students2.length; i++) {
            System.out.println(students2[i]);
        }
 */
