package array;

/**
 * 双向链表
 *
 * @author guobin
 */
public class DoublyLinkedList {
    private Link first;
    private Link last;

    /**
     * 构造函数
     */
    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    /**
     * 是否为空
     *
     * @return boolean
     */
    private boolean isEmpty() {
        return first == null;
    }

    /**
     * 从前面插入
     *
     * @param dd 链接
     */
    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
            newLink.next = first;
            first = newLink;
        }
    }

    /**
     * 从后面插入
     *
     * @param dd 链接
     */
    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
            last = newLink;
        }
    }
}
