package mapset;

import tree.BST;

/*
 * BSTSet
 * @Author guobin201314@gmail.com on 2019-06-18 09:21
 */
public class BSTSet<E extends Comparable<E>> implements ISet<E> {

    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public int getSize() {
        return bst.getSize();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }

    @Override
    public boolean includes(E e) {
        return bst.includes(e);
    }
}
