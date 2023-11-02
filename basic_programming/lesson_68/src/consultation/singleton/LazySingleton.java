package consultation.singleton;

/**
 * При ленивой инициализации экземпляр класса создается в момент первого вызова метода getInstance(). Это хорошо тем,
 * что экземпляр не создается до тех пор, пока он не потребуется. Это может сэкономить ресурсы, особенно если объект
 * создается редко или он занимает много памяти.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // Здесь могут быть дорогостоящие операции инициализации
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

