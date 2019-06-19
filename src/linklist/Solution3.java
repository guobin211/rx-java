package linklist;

/*
 * Solution3
 * @Author guobin201314@gmail.com on 2019-06-17 12:49
 */
public class Solution3 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            return dummy.next;
        }
    }
}
