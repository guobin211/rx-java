package mapset;

import java.util.*;

/**
 * MainSet class
 * @author guobin201314@gmail.com on 2019-06-18 22:32
 */
public class MainSet {
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList<>();
        double start = System.nanoTime();
        FileOperation.readFile("/Users/guobin/idea/rx-java/src/mapset/pride-and-prejudice.txt", words1);
        System.out.println("Total: " + words1.size());

        BSTSet<String> bstSet = new BSTSet<>();
        start = System.nanoTime();
        for (String word: words1) {
            bstSet.add(word);
        }
        System.out.println((System.nanoTime() - start) / 1000000.0);
        System.out.println("Set Total:" + bstSet.getSize());

        HashSet<String> hashSet = new HashSet<>();
        start = System.nanoTime();
        for (String word: words1) {
            hashSet.add(word);
        }
        System.out.println((System.nanoTime() - start) / 1000000.0);
        System.out.println(hashSet.size());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        TreeSet<String> treeSet = new TreeSet<>();
        start = System.nanoTime();
        for (String word: words1) {
            treeSet.add(word);
        }
        System.out.println((System.nanoTime() - start) / 1000000.0);
        System.out.println(treeSet.size());
    }
}
