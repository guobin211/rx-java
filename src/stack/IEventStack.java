package stack;

/*
 * IEventStack
 * @Author guobin201314@gmail.com on 2019-06-12 21:00
 */
public interface IEventStack<E> {
    void push(E e);
    E pop();
    E peek();
    int size();
    boolean isEmpty();
}
