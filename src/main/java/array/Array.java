package array;

/**
 * FileName Array.java
 *
 * @author guobin201314@gmail.com on 2018/12/8 10:11
 * @version 1.0.0
 */
public class Array<E> {

    private E[] data;
    private int size;

    public Array(int length) {
        data = (E[]) new Object[length];
        size = 0;
    }

    public Array() {
        this(1);
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("filed");
        }
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("filed");
        }
        insert(index, e);
    }

    public int getLength() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(E e) {
        if (size == data.length) {
            resize(2 * data.length);
            data[size] = e;
            size++;
        } else {
            data[size] = e;
            size++;
        }
    }

    public void insertFirst(E e) {
        insert(0, e);
    }

    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index >= 0 and index <= size");
        }
        // 数组需要扩容,动态数组
        if (size == data.length) {
            resize(2 * data.length);
        }
        int i = size - 1;
        while (i >= index) {
            data[i + 1] = data[i];
            i--;
        }
        data[index] = e;
        size++;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E getLast() {
        return data[size];
    }

    public E getFirst() {
        return data[0];
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index >= 0 and index <= size");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        // 清空指针，回收
        data[size] = null;
        // 缩小数组容量,lazy方案减少变换次数, data.length不能等于0
        if (size == data.length / 4 && data.length > 10) {
            resize(data.length / 2);
        }

        return ret;
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public E removeFirst() {
        return remove(0);
    }

    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public void removeBefore(E e) {

    }

    public void removeAfter(E e) {

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    /**
     * 创建新的数组空间
     *
     * @param newCapacity 新数组长度
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
