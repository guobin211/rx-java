package linked;

import stack.Stack;

/**
 * File LinkedStack.java
 *
 * @author guobin201314@gmail.com on 2018/12/9 11:30
 * @version jdk 1.8.0
 */
public class LinkedStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedStack() {
        list = new LinkedList <>();
    }

    /**
     * @return int length
     */
    @Override
    public int getSize() {
        return list.getSize();
    }

    /**
     * @return int index
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * @return element
     */
    @Override
    public E pop() {
        return list.remove(0);
    }

    /**
     * @return element
     */
    @Override
    public E peek() {
        return list.get(0);
    }

    /**
     * @param e element
     */
    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    public String toString() {
        String stringBuilder;
        stringBuilder = "Stack top:" + list;
        return stringBuilder;
    }

}
