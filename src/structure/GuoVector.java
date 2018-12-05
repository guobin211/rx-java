package structure;

import java.util.*;

/**
 * Vector类实现了一个动态数组。和ArrayList和相似，但是两者是不同的
 * @author GuoBin201314@gmail.com on 2018/11/16 14:13
 */
public class GuoVector {
    public static void main(String[] args) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after four additions: " +
                v.capacity());

        v.addElement(5.45);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(9.4f);
        v.addElement(10);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First element: " +
                v.firstElement());
        System.out.println("Last element: " +
                v.lastElement());

        if(v.contains(3)) {
            System.out.println("Vector contains 3.");
        }
        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
