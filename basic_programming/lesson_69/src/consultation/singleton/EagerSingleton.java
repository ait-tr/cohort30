package consultation.singleton;

/**
 * Нетерпеливая инициализация (Eager Initialization) При нетерпеливой инициализации экземпляр класса создается сразу при
 * загрузке класса. Экземпляр создается, даже если он никогда не будет использоваться в приложении.
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Здесь могут быть дорогостоящие операции инициализации
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

