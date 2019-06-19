package linklist;

/**
 * Solution3
 * @author guobin201314@gmail.com on 2019-06-17 12:49
 */
public class Solution3 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            // dummy->1(l1)->2(l2)->3(nextStart)->4->5->6
            ListNode dummy = new ListNode(-1);
            ListNode l1 = dummy;
            ListNode l2 = head;
            ListNode nextStart;

            while (l2 != null && l2.next!=null) {
                nextStart = l2.next.next;
                l1.next = l2.next;
                l2.next.next = l2;
                l2.next = nextStart;
                l1=l2;
                l2=l2.next;
            }

            return dummy.next;
        }
    }
}
