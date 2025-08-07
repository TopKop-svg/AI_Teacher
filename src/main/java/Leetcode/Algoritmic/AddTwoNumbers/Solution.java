package Leetcode.Algoritmic.AddTwoNumbers;

import java.util.Queue;

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sumL1 = 0;
        int sumL2 = 0;
        int point = 1;
        int sum;
        
        while (true) {
            sumL1 = sumL1 + l1.val * point;
            l1 = l1.next;
            point = point * 10;
            if(l1.next == null) {break;}
        }
        //System.out.println(count);
        point = 1;
        while (l2.next != null) {
            sumL2 = sumL2 + l2.val * point;
            l2 = l2.next;
            point = point * 10;
        }
        sum = sumL1 + sumL2;
        System.out.println(sum);
        return null;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        addTwoNumbers(l1, l2);

    }
}
