package Leetcode.Algoritmic.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class Solution {
//    public static int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        StringBuilder sb = new StringBuilder();
//        char[] charArr = s.toCharArray();
//        for (int i = 0; i < s.length()-1; i++) {
//            if (charArr[i] == s.charAt(i + 1)) {
//                sb.append(charArr[i]);
//            } else {
//                sb.append(s.substring(i, i+1));
//            }
//
//        }
//
//        System.out.println("Result on String " + s + " is " + sb.length());
//        return 0;
//    }

    public static int lengthOfLongestSubstring(String s) {
        int substringCount = ((s.length() - 1) * s.length()) / 2;
        String[] arr = new String[substringCount];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0+i; j < s.length(); j++) {
                arr[j] = s.substring(i, j);
            }
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
//        s = "bbbbb";
//        lengthOfLongestSubstring(s);
//        s = "pwwkew";
//        lengthOfLongestSubstring(s);
    }


}
