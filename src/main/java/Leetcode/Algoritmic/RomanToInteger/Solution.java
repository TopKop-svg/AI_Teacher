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

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romMap = new HashMap<>();
        System.out.println(s + " " + result);
        return result;
    }
    public static void main(String[] args) {
        romanToInt("III");
        romanToInt("LVIII");
        romanToInt("MCMXCIV");
    }
}
