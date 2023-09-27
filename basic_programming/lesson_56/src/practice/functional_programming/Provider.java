package practice.functional_programming;

/**
 * Интерфейс с методом, не принимающим аргументы и возвращающим результат (аналог Supplier):
 * @param <R>
 */
@FunctionalInterface
interface Provider<R> {
    R provide();
}
