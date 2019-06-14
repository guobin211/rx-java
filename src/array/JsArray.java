package array;

/*
 * JsArray
 * @Author guobin201314@gmail.com on 2019-06-12 22:42
 */
public class JsArray<E> implements IJsArray<E> {

    private E[] data;
    // 已存储
    private int length;

    int getLength() {
        return length;
    }

    public JsArray() {
        this(10);
    }

    public JsArray(int capacity) {
        if (capacity < 10) {
            capacity = 10;
        }
        data = (E[]) new Object[capacity];
        length = 0;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public int getCapacity() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public E shift() {
        return remove(0);
    }

    @Override
    public E pop() {
        return remove(length - 1);
    }

    @Override
    public void unshift(E e) {
        add(0, e);
    }

    @Override
    public void push(E e) {

        if (length == data.length - 1) {
            int size = length * 2;
            E[] arr = (E[]) new Object[size];
            for (int i = 0; i < length; i++) {
                arr[i] = data[i];
            }
            arr[length] = e;
            length++;
            data = arr;
        } else {
            data[length] = e;
            length++;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("index must >= 0 and < length");
        }
        return data[index];
    }

    private E remove(int index) {
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("index must >= 0 and <= length");
        }
        E temp = data[index];
        for (int i = index + 1; i < length; i++) {
            data[i - 1] = data[i];
        }
        length--;
        return temp;
    }

    public void add(int index, E e) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("index must >= 0 and < length");
        }
        if (length == data.length -1 ) {
            // 数组扩容
            int size = length * 2;
            E[] arr = (E[]) new Object[size];
            for (int i = 0; i < index; i++) {
                arr[i] = data[i];
            }
            for (int i = length - 1; i >= index; i--) {
                arr[i + 1] = data[i];
            }
            arr[index] = e;
            length++;
            data = arr;
        } else {
            for (int i = length - 1; i >= index; i--) {
                data[i + 1] = data[i];
            }
            data[index] = e;
            length++;
        }

    }

    @Override
    public JsArray<E> reverse() {
        JsArray<E> jsArray = new JsArray<>(data.length);
        for (int i = length - 1; i >= 0; i--) {
            jsArray.push(data[i]);
        }
        return jsArray;
    }

    @Override
    public void slice() {
    }

    @Override
    public void splice() {

    }

    @Override
    public IJsArray concat(IJsArray e) {
        JsArray jsArray = new JsArray(data.length + e.getCapacity());
        for (int i = 0; i < length; i++) {
            jsArray.push(data[i]);
        }
        for (int i = 0; i < e.getSize(); i++) {
            jsArray.push(e.get(i));
        }
        return jsArray;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < length; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean includes(E e) {
        for (int i = 0; i < length; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void forEach() {

    }

    @Override
    public void map() {

    }

    @Override
    public void flatMap() {

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < length; i++) {
            res.append(data[i]);
            if (i != length -1) {
                res.append(",");
            }
        }
        res.append("]");
        return res.toString();
    }
}
