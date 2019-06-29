package trie;

import mapset.BSTSet;
import mapset.FileOperation;

import java.util.ArrayList;

/**
 * MainTrie class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-25
 */
public class MainTrie {
    public static void main(String[] args) {
        String filePath = "/Users/guobin/idea/rx-java/src/mapset/pride-and-prejudice.txt";

        ArrayList<String> arrayList = new ArrayList<>();
        if (FileOperation.readFile(filePath, arrayList)) {
            long startTime = System.nanoTime();
            BSTSet<String> bstSet = new BSTSet<>();

            for (String word: arrayList) {
                bstSet.add(word);
            }

            for (String word: arrayList) {
                bstSet.includes(word);
            }

            long endTime = System.nanoTime();
            double time = (endTime- startTime) / 1000000000.0;
            System.out.println("BSTSet time: " + time);

            startTime = System.nanoTime();

            Trie trie = new Trie();

            for (String word: arrayList) {
                trie.add(word);
            }

            for (String word: arrayList) {
                trie.contains(word);
            }

            endTime = System.nanoTime();
            time = (endTime- startTime) / 1000000000.0;
            System.out.println("trie time: " + time);
        }
    }
}
