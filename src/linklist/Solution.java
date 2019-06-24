package linklist;

/*
 * Solution
 * @Author guobin201314@gmail.com on 2019-06-15 21:09
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
              head = head.next;
//            ListNode delNode = heap;
//            heap = heap.next;
//            delNode.next = null;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
