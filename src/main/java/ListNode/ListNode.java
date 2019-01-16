package ListNode;

/**
 * ListNode
 *
 * @author guobin201314@gmail.com on 2019-01-13
 * @version  1.0.0
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        this.val = x;
    }

    public ListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }

        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val).append("->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }

    public String toArray() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        ListNode cur = this;
        while (cur != null) {
            res.append(cur.val).append(",");
            cur = cur.next;
        }
        res.replace(res.length() - 1, res.length(), "]");
        return res.toString();
    }
}
