package stack;

/**
 * FileName Stack.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 18:46
 * @version 1.0.0
 */
public interface Stack<E> {

    /**
     * @return int length
     */
    int getSize();

    /**
     * @return int index
     */
    boolean isEmpty();

    /**
     * @return element
     */
    E pop();

    /**
     * @return element
     */
    E peek();

    /**
     * @param e element
     */
    void push(E e);

}
