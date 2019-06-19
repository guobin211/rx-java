package linklist;

/*
 * Solution2
 * @Author guobin201314@gmail.com on 2019-06-16 21:25
 */
public class Solution2 {
    /**
     * 链表删除元素
     * @param head ListNode
     * @param val int
     * @return ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        // 判断是删除的元素
        return head.val == val ? head.next : head;
    }

}
