package practice;

/**
 * Интерфейс с методом, не принимающим аргументы и возвращающим результат (аналог Supplier):
 * @param <R>
 */
@FunctionalInterface
interface Provider<R> {
    R provide();
}
