package HackerRank.Stdin_and_Stdout_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        double b = Double.parseDouble(in.nextLine());
        String c = in.nextLine();
        in.close();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
