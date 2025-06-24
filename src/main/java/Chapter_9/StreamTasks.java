package Chapter_9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Практические задачи для закрепления знаний по Stream API.
 * <p>
 * Каждый метод — отдельная задача. В комментариях описана цель и пример использования.
 * Рекомендуется сначала прочесть {@link //Chapter_9. *package-info теоретический материал}, а затем решить задачи.
 */
public class StreamTasks {

    /* ============================
     *  БАЗОВЫЙ УРОВЕНЬ
     * ============================ */

    /**
     * Вернуть список уникальных квадратов чисел.
     * Пример: [1, 2, 3, 2] -> [1, 4, 9]
     */
    public static List<Integer> uniqueSquares(List<Integer> numbers) {
        // TODO: реализуйте метод
        return Collections.emptyList();
    }

    /**
     * Подсчитать количество строк, начинающихся на заданную букву (без учёта регистра).
     */
    public static long countStartsWith(List<String> list, char c) {
        // TODO: реализуйте метод
        return 0L;
    }

    /**
     * Соединить коллекцию строк в единую строку, разделитель — запятая и пробел.
     * Пример: ["a", "b", "c"] -> "a, b, c"
     */
    public static String joinWithComma(List<String> strings) {
        // TODO: реализуйте метод
        return "";
    }

    /* ============================
     *  СРЕДНИЙ УРОВЕНЬ
     * ============================ */

    /**
     * Найти максимум в каждой вложенной коллекции целых чисел.
     * Пример: [[1,2], [5,3]] -> [2,5]
     */
    public static List<Integer> maxInSubLists(List<List<Integer>> list) {
        // TODO: реализуйте метод
        return Collections.emptyList();
    }

    /**
     * Сгруппировать слова по первой букве.
     * Пример: ["Bob","Alice","Alex"] -> {A=[Alice, Alex], B=[Bob]}
     */
    public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
        // TODO: реализуйте метод
        return new HashMap<>();
    }

    /**
     * Вернуть n первых простых чисел, начиная с 2.
     */
    public static List<Integer> firstNPrimes(int n) {
        // TODO: реализуйте метод
        return Collections.emptyList();
    }

    private static boolean isPrime(int num) {
        // TODO: реализуйте метод (поможет firstNPrimes)
        return false;
    }

    /* ============================
     *  ПРОДВИНУТЫЙ УРОВЕНЬ
     * ============================ */

    /**
     * Найти топ-K самых частых слов (регистр игнорируется).
     * Вернуть список слов, отсортированных по убыванию частоты и затем лексикографически.
     * Пример: input="a b b c c c", k=2 -> ["c","b"]
     */
    public static List<String> topKFrequent(String text, int k) {
        // TODO: реализуйте метод
        return Collections.emptyList();
    }

    /**
     * Реализовать ленивый бесконечный Stream чисел Фибоначчи.
     * Возвращает IntStream вида 0,1,1,2,3,5,8...
     */
    public static IntStream fibonacci() {
        // TODO: реализуйте метод
        return IntStream.empty();
    }

    /**
     * Сэмплировать элемент из списка случайным образом, используя Stream API.
     * Вернуть Optional.empty для пустого списка.
     */
    public static <T> Optional<T> sample(List<T> list) {
        // TODO: реализуйте метод
        return Optional.empty();
    }

    /* ============================
     *  МЕТОДЫ ДЛЯ ТЕСТИРОВАНИЯ
     * ============================ */

    /*public static void main(String[] args) {
        // Пример: вывод первых 10 чисел Фибоначчи
        fibonacci().limit(10).forEach(System.out::println);
    }*/
}
