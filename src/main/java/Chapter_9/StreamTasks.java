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
 * Рекомендуется сначала прочесть {@link Chapter_9.package-info теоретический материал}, а затем решить задачи.
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
        return numbers.stream()
                .map(n -> n * n)
                .distinct()
                .collect(Collectors.toList());
    }

    /**
     * Подсчитать количество строк, начинающихся на заданную букву (без учёта регистра).
     */
    public static long countStartsWith(List<String> list, char c) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(c))
                .count();
    }

    /**
     * Соединить коллекцию строк в единую строку, разделитель — запятая и пробел.
     * Пример: ["a", "b", "c"] -> "a, b, c"
     */
    public static String joinWithComma(List<String> strings) {
        return String.join(", ", strings);
    }

    /* ============================
     *  СРЕДНИЙ УРОВЕНЬ
     * ============================ */

    /**
     * Найти максимум в каждой вложенной коллекции целых чисел.
     * Пример: [[1,2], [5,3]] -> [2,5]
     */
    public static List<Integer> maxInSubLists(List<List<Integer>> list) {
        return list.stream()
                .map(sub -> sub.stream().max(Integer::compareTo).orElseThrow())
                .collect(Collectors.toList());
    }

    /**
     * Сгруппировать слова по первой букве.
     * Пример: ["Bob","Alice","Alex"] -> {A=[Alice, Alex], B=[Bob]}
     */
    public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(s -> Character.toUpperCase(s.charAt(0))));
    }

    /**
     * Вернуть n первых простых чисел, начиная с 2.
     */
    public static List<Integer> firstNPrimes(int n) {
        return Stream.iterate(2, i -> i + 1)
                .filter(StreamTasks::isPrime)
                .limit(n)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int num) {
        return num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(i -> num % i != 0);
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
        return Arrays.stream(text.toLowerCase().split("\\W+"))
                .filter(s -> !s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * Реализовать ленивый бесконечный Stream чисел Фибоначчи.
     * Возвращает IntStream вида 0,1,1,2,3,5,8...
     */
    public static IntStream fibonacci() {
        return IntStream.concat(IntStream.of(0, 1),
                IntStream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                        .mapToInt(t -> t[1]));
    }

    /**
     * Сэмплировать элемент из списка случайным образом, используя Stream API.
     * Вернуть Optional.empty для пустого списка.
     */
    public static <T> Optional<T> sample(List<T> list) {
        return list.stream()
                .skip((int) (list.size() * Math.random()))
                .findFirst();
    }

    /* ============================
     *  МЕТОДЫ ДЛЯ ТЕСТИРОВАНИЯ
     * ============================ */

    public static void main(String[] args) {
        // Пример: вывод первых 10 чисел Фибоначчи
        fibonacci().limit(10).forEach(System.out::println);
    }
}
