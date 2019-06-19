package mapset;

import linklist.LinkedList;

/**
 * LinkedListSet
 * @Author guobin201314@gmail.com on 2019-06-18 22:39
 */
public class LinkedListSet<E> implements ISet<E> {
    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if (!includes(e)) {
            list.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean includes(E e) {
        return list.includes(e);
    }
}
