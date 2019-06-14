package queue;

/*
 * IEventQueue
 * @Author guobin201314@gmail.com on 2019-06-12 21:38
 */
public interface IEventQueue<E> {
    void enqueue(E e);
    E dequeue();
    E getFront();
    int getSize();
    boolean isEmpty();
}
