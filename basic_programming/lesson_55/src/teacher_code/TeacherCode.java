package teacher_code;

import java.io.File;
import java.util.Stack;
import static java.lang.Math.*;

public class TeacherCode {
    public static void main(String[] args) {
        TempFuncInterface tempFuncInterface = (int x) -> {
            if (x % 2 == 0) {
                System.out.println("FuncInt it is even number");
            } else {
                System.out.println("FuncInt it is odd number");
            }
        };

        TempFuncInterface powOfCube = (int x) -> System.out.println(x * x * x);

        TempFuncInterfaceImpl tempFuncInterfaceImpl = new TempFuncInterfaceImpl();
        tempFuncInterface.temp(15);
        tempFuncInterfaceImpl.temp(15);
        powOfCube.temp(15);


        tempFuncInterfaceImpl.sayHello();
        tempFuncInterface.sayHello();
        TempFuncInterface.sayStaticHello();

        pow(2, 4);

        String str1 = "hello";
        String str2 = "good bye!";

        str1.length();
        str2.length();


        SecondFuncInterface secondFuncInterface = TeacherCode::sayHello;
        SecondFuncInterface anotherOne = TeacherCode::new;

        anotherOne.doSomething();
    }

    static void sayHello() {
        System.out.println("hello");
    }

    public TeacherCode() {
        System.out.println("constructor");
    }
}
