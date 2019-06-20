package mapset;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * MainMap class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-19
 */
public class MainMap {
    public static void main(String[] args) {
        HashMap<Integer, Object> hashMap = new HashMap<>(10);

        for (int i = 0; i < 10; i++) {
            Student student = new Student("jack", i + 1);
            hashMap.put(i, student);
        }

        int size = hashMap.size();
        System.out.println(size);
        hashMap.put(11, new Student("tom", 22));
        System.out.println(hashMap.size());
        // 遍历value
//        for ( Map.Entry<Integer, Object> entry: hashMap.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue().toString());
//        }
        // 遍历key
//        for (Integer integer : hashMap.keySet()) {
//            System.out.println(integer);
//            System.out.println(hashMap.get(integer));
//        }

        Map<String, Integer> map = new TreeMap<>();
        ArrayList<String> arrayList = new ArrayList<String>();
        FileOperation.readFile("/Users/guobin/idea/rx-java/src/mapset/pride-and-prejudice.txt", arrayList);
        System.out.println(arrayList.size());

        for (String word : arrayList) {
            if (map.containsKey(word)) {
                int curr = map.get(word);
                map.put(word, curr + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key: map.keySet()) {
            System.out.println(key+ ":" + map.get(key));
        }

    }
}
