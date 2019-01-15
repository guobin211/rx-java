package ListNode;

/**
 * ListNode
 *
 * @author guobin201314@gmail.com on 2019-01-13
 * @deprecated 1.8
 */
public class Solution {
    /**
     * 删除节点
     * @param head node
     * @param val int
     * @return node
     */
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                // 跳一个
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,2,4};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode res = (new Solution()).removeElements(head, 5);
        System.out.println(res);

        System.out.println(res.toArray());
    }
}
