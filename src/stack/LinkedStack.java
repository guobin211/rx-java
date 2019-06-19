package stack;

import linklist.LinkedList;

/*
 * LinkedStack
 * @Author guobin201314@gmail.com on 2019-06-14 23:21
 */
public class LinkedStack<E> implements IEventStack<E> {

    private LinkedList<E> list;

    public LinkedStack() {
        list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top").append(list);
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        for (int i = 0; i < 5; i++) {
            linkedStack.push(i);
        }
        System.out.println(linkedStack);
    }
}
