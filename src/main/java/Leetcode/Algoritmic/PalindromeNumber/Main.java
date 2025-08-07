package Leetcode.Algoritmic.PalindromeNumber;

import java.util.Arrays;

public class Main {
    public static boolean isPalindrome(int x) {
        String arr = "" + x;
        String result = "";
        for (int i = arr.length()-1; i >= 0; i++) {
            result = result + arr.charAt(i);
        }
        System.out.println(result);
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(23));
        System.out.println(isPalindrome(1211));
        System.out.println(isPalindrome(444));
    }
}
