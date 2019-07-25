package array;

/**
 * IJsArray
 * @author guobin201314@gmail.com on 2019-06-12 22:44
 */
public interface IJsArray<E> {
    int getSize();
    int getCapacity();
    boolean isEmpty();
    E shift();
    E pop();
    E get(int i);
    void unshift(E e);
    void push(E e);
    IJsArray reverse();
    void slice();
    void splice();
    IJsArray concat(IJsArray e);
    int indexOf(E e);
    boolean includes(E e);
    void forEach();
    void map();
    void flatMap();
}
