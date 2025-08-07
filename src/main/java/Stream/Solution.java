package Stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        //Задача 1
        //Найти фрукт по первой букве
        Set<String> fruit = new HashSet<>();
        fruit.add("Яблоко");
        fruit.add("Банан");
        fruit.add("Апельсин");
        fruit.add("Груша");
        fruit.add("Киви");

        Set<String> sortFruit = fruit.stream()
                .filter( s -> s.charAt(0) == 'А') //собственно сама фильтрация
                .collect(Collectors.toSet());

        System.out.println(sortFruit);

//        Условие:
//        Список чисел: 1, 2, 3, 4, 5.
//        Задача:
//        Умножить каждое число на 2 и получить новый список.
        Set<Integer> multiplyX2 = new HashSet<>();
        multiplyX2.add(2);
        multiplyX2.add(4);
        multiplyX2.add(6);
        multiplyX2.add(8);
        multiplyX2.add(10);

        List<Integer> resultT2 = multiplyX2.stream()
                .map(s -> s = s * 2) //map для функции над каждым элементом
                .collect(Collectors.toList());

        System.out.println(resultT2);

//        Условие:
//        Список чисел: 10, 3, 17, 5, 8.
//        Задача:
//        Найти максимальное число в списке.

        Set<Integer> maxValue = new HashSet<>();
        maxValue.add(10);
        maxValue.add(3);
        maxValue.add(17);
        maxValue.add(5);
        maxValue.add(8);

        Optional<Integer> resultT3 = maxValue.stream()
                .max(Comparator.naturalOrder());

        System.out.println(resultT3);
    }
}
