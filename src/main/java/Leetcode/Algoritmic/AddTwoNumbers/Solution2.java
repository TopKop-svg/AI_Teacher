package Leetcode.Algoritmic.AddTwoNumbers;
//TODO не решено (Medium)
public class Solution2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int point = 1;
        ListNode result;
            result = new ListNode(l1.val + l2.val * point);
            point = point * 10;
            ListNode result2 = new ListNode(l1.val + l2.val * point, result);
        System.out.println(result);
        System.out.println(result2);
        return result2;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        addTwoNumbers(l1, l2);

    }
}
