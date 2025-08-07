package Leetcode.Algoritmic.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //Пробую решение в лоб
    //чисто на поиск в строке соответствия
//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
//        //#Проверяем самый короткий элемент, чтобы знать максимальное совпадение по длине символов
//        int lowSizeElement = 201;
//        for (int i = 0; i < strs.length; i++) {
//            if (lowSizeElement > strs[i].length()) {
//                lowSizeElement = strs[i].length();
//            }
//        }
//        //# конец блока
//
//        //Далее начало вложенности и проверка совпадений по строкам
//        List<String> trimList = new ArrayList<>();
//        for (int i = 0; i < strs.length; i++) {
//            if (i == 0) sb.append(strs[i].charAt(0) + strs[i].charAt(1));
//            if (sb.toString().contains(strs[i])) {
//
//            }
//        }
//
//
//        System.out.println("Самый короткий элемент: " + lowSizeElement);
//        System.out.println("There is no common prefix among the input strings.");
//        return null;
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        String prefix = "";
//        int lowSizeElement = 201;
//        for (int i = 0; i < strs.length; i++) {
//            if (lowSizeElement > strs[i].length()) {
//                lowSizeElement = strs[i].length();
//            }
//            if (strs.length == 1) return prefix = strs[0];
//        }
//        if (lowSizeElement < 1) {return prefix;}
//
//        System.out.println("Самый короткий элемент " + lowSizeElement);
//        int i = 0;
//        if (1 >= strs.length || strs[i].length() <= 1) return strs[i];
//        while (i < strs.length) {
//            if (prefix.length() < 2 && strs[i].length() >= i) {
//                prefix = prefix + strs[i].charAt(i);
//            }
//            if (!strs[i].contains(prefix)) {
//                return "";
//            }
//            i++;
//        }
//        return prefix;
//    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int lowSizeElement = 201;
        for (int i = 0; i < strs.length; i++) {
            if (lowSizeElement > strs[i].length()) {
                lowSizeElement = strs[i].length();
                prefix = strs[i];
            }
            if (strs.length == 1) return prefix = strs[0];
        }


        System.out.println("Самый короткий элемент " + lowSizeElement);
        int i = 0;

        while (i < strs.length) {
            if (!strs[i].contains(prefix)) {
                return "";
            }
            i++;
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"flower","flow","flight"};
        String[] strs2 = new String[] {"dog","racecar","car"};
        String[] strs3 = new String[] {""};
        String[] strs4 = new String[] {"a"};
        String[] strs5 = new String[] {"ab", "a"};

        System.out.println("Результат 1: " + longestCommonPrefix(strs));
       System.out.println("Результат 2: " + longestCommonPrefix(strs2));
        System.out.println("Результат 3: " + longestCommonPrefix(strs3));
        System.out.println("Результат 4: " + longestCommonPrefix(strs4));
        System.out.println("Результат 5: " + longestCommonPrefix(strs5));

    }
}