package consultation.reflection;

public class MyClass {
    private int number;

    public MyClass(int number) {
        this.number = number;
    }

    // Приватный метод, который мы будем вызывать с помощью Reflection
    private void privateMethod() {
        System.out.println("Private method called with number: " + number);
    }

    // Публичный метод, чтобы показать разницу в доступе
    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Геттер для получения значения приватного поля
    public int getNumber() {
        return number;
    }
}

