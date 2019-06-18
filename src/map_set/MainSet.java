package map_set;

import java.util.ArrayList;

/*
 * MainSet
 * @Author guobin201314@gmail.com on 2019-06-18 22:32
 */
public class MainSet {
    public static void main(String[] args) {
        ArrayList<String> words1 = new ArrayList<>();
        FileOperation.readFile("/Users/guobin/idea/rx-java/src/map_set/pride-and-prejudice.txt", words1);
        System.out.println("Total: " + words1.size());

        BSTSet<String> bstSet = new BSTSet<>();
        for (String word: words1) {
            bstSet.add(word);
        }
        System.out.println("Set Total:" + bstSet.getSize());
    }
}
