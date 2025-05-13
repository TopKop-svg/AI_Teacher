package HackerRank.HR_4_Java_Loops_2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();
        int a = 0; int b = 2; int n = 10;
        int lockRes = 0;
        for (int i = 0; i < n; i++) {
            //lockRes = lockRes + (a + ((i*2) * b));
            lockRes = a + (i * 2) + lockRes;
            System.out.print(" " + lockRes);

        }
    }
}
