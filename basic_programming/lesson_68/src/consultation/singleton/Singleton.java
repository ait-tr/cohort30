package consultation.singleton;

/**
 * Использование Singleton Singleton часто используется в различных сценариях, например:
 *
 * 1. Управление доступом к ресурсу, который должен быть единственным в системе (например, пул соединений с базой данных).
 * 2. Хранение глобального состояния приложения или конфигурации.
 * 3. Реализация сервисов или менеджеров (например, LogManager), которые должны быть доступны во всем приложении.
 */
public class Singleton {
    private static volatile Singleton instance;

    // Конструктор должен быть private, чтобы предотвратить инстанцирование
    private Singleton() {
    }

    // Метод для получения экземпляра Singleton
    public static Singleton getInstance() {
        if (instance == null) { // Первая проверка (без блокировки)
            synchronized (Singleton.class) { // Блокировка
                if (instance == null) { // Вторая проверка (с блокировкой)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Прочие методы...
}

