package map_set;

/*
 * ISet
 * @Author guobin201314@gmail.com on 2019-06-18 09:18
 */
public interface ISet<E> {
    void add(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
    boolean includes(E e);
}
