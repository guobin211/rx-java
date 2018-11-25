package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列 先进先出
 * @author GuoBin201314@gmail.com on 2018/11/17 19:14
 */
public class SelfQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("jack", 22));
        queue.offer(new Person("tom", 17));
        queue.offer(new Person("mary", 24));

        System.out.println(queue.poll());
        System.out.println(((LinkedList<Person>) queue).getLast().getName());
        if (!queue.isEmpty()) {
            queue.remove();
        }
        display();
    }

    /**
     * 双端队列,禁止添加null
     */
    private static void display() {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("first");
        deque.addLast("end");
        deque.addFirst("第一个");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
