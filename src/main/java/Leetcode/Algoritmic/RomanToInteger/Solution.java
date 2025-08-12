package Leetcode.Algoritmic.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    public static int romanToInt(String s) {
//        int result = 0;
//        for (int i = 0; i < s.length(); i++) {
//            switch (s.charAt(i)) {
//                case 'I': result+=1;
//                    break;
//                case 'V': result+=5;
//                    break;
//                case 'X': result+=10;
//                    break;
//                case 'L': result+=50;
//                    break;
//                case 'C': result+=100;
//                    break;
//                case 'M': result+=1000;
//            }
//        }
//        System.out.println(s + " " + result);
//        return result;
//    }

//    public static int romanToInt(String s) {
//        //s = new StringBuilder(s).reverse().toString();
//        int result = 0;
//        int minVal = 0;
//        Map<Character, Integer> romMap = new HashMap<>();
//        romMap.put('I', 1);
//        romMap.put('V', 5);
//        romMap.put('X', 10);
//        romMap.put('L', 50);
//        romMap.put('C', 100);
//        romMap.put('D', 500);
//        romMap.put('M', 1000);
//
//        for (int i = 0; i < s.length(); i++) {
//            if (minVal > romMap.get(s.charAt(i))) {
//                result -= romMap.get(s.charAt(i));
//                minVal = romMap.get(s.charAt(i));
//            }
//            result += romMap.get(s.charAt(i));
//        }
//        System.out.println(s + " " + result);
//        return result;
//    }

//    public static int romanToInt(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        int result = 0;
//        int pointer = 0;
//        char valprev = sb.charAt(0);
//
//        Map<Character, Integer> romMap = new HashMap<>();
//        romMap.put('I', 1);
//        romMap.put('V', 5);
//        romMap.put('X', 10);
//        romMap.put('L', 50);
//        romMap.put('C', 100);
//        romMap.put('D', 500);
//        romMap.put('M', 1000);
//        for (int i = 0; i < sb.length(); i++) {
//            if (pointer == 0) {
//                pointer += romMap.get(sb.charAt(i));
//                continue;
//            }
//            if (pointer < romMap.get(sb.charAt(i))) {
//                result += romMap.get(sb.charAt(i)) - pointer;
//                pointer = 0;
//
//            }
//            if (pointer == romMap.get(sb.charAt(i)) | (pointer / 2 == romMap.get(sb.charAt(i)))) {
//                pointer += romMap.get(sb.charAt(i));
//
//            }
//            if (pointer > romMap.get(sb.charAt(i))){
//                result += pointer;
//                pointer = 0;
//            }
//
//        }
//        System.out.println(result);
//        return result;
//    }

    public static int romanToInt(String s) {
        StringBuilder sb = new StringBuilder(s);
        int result = 0;
        int potential = 0;
        Map<Character, Integer> romMap = new HashMap<>();
        romMap.put('I', 1);
        romMap.put('V', 5);
        romMap.put('X', 10);
        romMap.put('L', 50);
        romMap.put('C', 100);
        romMap.put('D', 500);
        romMap.put('M', 1000);

        for (int i = 0; i < sb.length(); i++) {
            result += romMap.get(sb.charAt(i));
            if (potential == 0) {
                potential = romMap.get(sb.charAt(i));
            }
            if (potential > romMap.get(sb.charAt(i))) {
                potential =  romMap.get(sb.charAt(i));
            }
            if (potential / 2 == romMap.get(sb.charAt(i)) ) {
                potential += romMap.get(sb.charAt(i));

            }
            if (potential ==  romMap.get(sb.charAt(i))) {
                potential +=  romMap.get(sb.charAt(i));
            }
            if (potential < romMap.get(sb.charAt(i))) {
                result = result - potential;
                potential = 0;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        romanToInt("LIIIV");
        romanToInt("LVIII");  // 58
        romanToInt("MCMXCIV"); // 1994
        //romanToInt("XIII");
    }
}
