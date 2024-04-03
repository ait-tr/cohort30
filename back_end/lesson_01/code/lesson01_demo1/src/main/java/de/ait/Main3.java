package de.ait;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ExampleClass exampleClass = new ExampleClass();
        Class<?> classInfo = exampleClass.getClass();
        Method[] methods = classInfo.getMethods();
        //System.out.println(Arrays.toString(methods));


        for (Method method:methods){
            boolean present = Arrays.stream(method.getDeclaredAnnotations())
                    .anyMatch(a -> a.annotationType().equals(MyTest.class));
            if (present){
                method.invoke(exampleClass);
                //System.out.println(method.getName());
            }
        }
    }
}
