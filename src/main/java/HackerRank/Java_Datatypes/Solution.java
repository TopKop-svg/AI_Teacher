package HackerRank.Java_Datatypes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bt = "* byte", sht = "* short", it = "* int", lg = "* long";
        ArrayList<String> aList = new ArrayList<>();

        while (scanner.hasNext()) {
            aList.add(scanner.next());
        }
        Long l = 0L;
        for (String value : aList) {
            try {
                l = Long.parseLong(value);
                if (l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE) {
                } else if (l <= Short.MAX_VALUE && l >= Short.MIN_VALUE) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println(sht);
                    System.out.println(it);
                    System.out.println(lg);
                } else if (l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println(it);
                    System.out.println(lg);
                } else if (l < Long.MAX_VALUE && l > Long.MIN_VALUE) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println(lg);

                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.print(value + " can't be fitted anywhere.\n");
            }
        }
    }
}
