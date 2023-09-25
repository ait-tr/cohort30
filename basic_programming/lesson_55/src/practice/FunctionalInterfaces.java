package practice;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5


        Function<String, Boolean> isEmail = (s) ->  {return s.contains("@") && s.contains(".");};

        List<String> listOfEmails = List.of("one@mail.com", "two.mail.com", "three@mail");
        for (String mail : listOfEmails) {
            System.out.println(isEmail.apply(mail));
        }





//        Consumer<String> consumer = System.out::println;
//        consumer.accept("Hello");  // Output: Hello
//
//
//        Supplier<String> supplier = () -> "Hello";
//        String str = supplier.get();
//        System.out.println(str);  // Output: Hello
//
//        Predicate<String> predicate = String::isEmpty;
//        boolean result = predicate.test("");
//        System.out.println(result);  // Output: true
    }
}
