package leetcode.jianzhiOffer;

public class T21 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre_pre = null;
        ListNode pre = head;
        ListNode end = head;
        for (int i = 0; i < n-1; i++) {
            end = end.next;
        }
        while (end.next != null){
            pre_pre = pre;
            pre = pre.next;
            end = end.next;
        }
        if (pre_pre == null){
            return pre.next;
        }else {
            pre_pre.next = pre.next;
            pre.next = null;
        }
        return head;
    }
}

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
