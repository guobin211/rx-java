package queue;

/**
 * IEventQueue
 * @Author guobin201314@gmail.com on 2019-06-12 21:38
 */
public interface IEventQueue<E> {
    /**
     * 入队
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * @return
     */
    E dequeue();

    /**
     * 队列头
     * @return
     */
    E getFront();

    /**
     * size
     * @return
     */
    int getSize();

    /**
     * empty
     * @return
     */
    boolean isEmpty();
}
