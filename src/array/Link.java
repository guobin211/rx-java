package array;

/**
 * 链表
 *
 * @author guobin
 */
public class Link {
    private long dDate;
    Link next;
    Link previous;

    /**
     * 构造函数
     *
     * @param d 日期
     */
    public Link(long d) {
        this.dDate = d;
    }

    /**
     * 展示链表
     */
    public void displayLink() {
        System.out.print(dDate + " ");
    }
}
