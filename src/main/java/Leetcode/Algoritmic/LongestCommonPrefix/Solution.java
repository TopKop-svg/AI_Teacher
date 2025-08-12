package Leetcode.Algoritmic.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        int minlenghtUnderString = strs[0].length();
        List<String> subStrings = new ArrayList<>();
        //нашли минимальную строку из массива строк
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minlenghtUnderString) {
                minlenghtUnderString = strs[i].length();
            }
        }
        //щас будем искать все подстроки в массиве
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                subStrings.add(strs.)
            }
        }

        String result = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (i == 0 && j == 0) {result = strs[i].charAt(j) + "";}

               // if ()
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Результат выполнения с строкой [\"flower\", \"flow\", \"flight\"] - "
                + longestCommonPrefix(new String[] {"flower", "flow", "flight"}) );
        System.out.println("Результат выполнения с строкой [\"dog\",\"racecar\",\"car\"]  - "
                + longestCommonPrefix(new String[] {"dog","racecar","car"}) );
        System.out.println("Результат выполнения с строкой [\"a\",\"aa\"]  - "
                + longestCommonPrefix(new String[] {"a","aa"}) );

    }
}