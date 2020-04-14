package part2;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    //递归
//    private ListNode tail;
//    public ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//        if (head.next == null) {
//            tail = head;
//            return head;
//        }
//        ListNode subReverseList = reverseList(head.next);
//        tail.next = head;
//        head.next = null;
//
//        tail = head;
//        return subReverseList;
//    }

    //迭代
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode pre = null;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;

            temp.next = pre;

            pre = temp;
            temp = next;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}