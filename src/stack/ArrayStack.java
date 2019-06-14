package stack;

/*
 * ArrayStack
 * @Author guobin201314@gmail.com on 2019-06-12 21:01
 */
public class ArrayStack<E> implements IEventStack<E> {

    private Array<E> _array;

    public ArrayStack() {
        _array = new Array<>();
    }

    public ArrayStack(int capacity) {
        _array = new Array<>(capacity);
    }

    public int getCapacity() {
        return _array.getCapacity();
    }

    @Override
    public void push(E e) {
        _array.addLast(e);
    }

    @Override
    public E pop() {
        return _array.removeLast();
    }

    @Override
    public E peek() {
        return _array.getLast();
    }

    @Override
    public int size() {
        return _array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return _array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append("[");
        for (int i = 0; i < _array.getSize(); i++) {
            res.append(_array.get(i));
            if (i != _array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
