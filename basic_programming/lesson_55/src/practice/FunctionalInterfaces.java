package practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5


        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello


        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello

        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }
}
