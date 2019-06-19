package mapset;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;

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
        for ( Map.Entry<Integer, Object> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().toString());
        }
        // 遍历key
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer);
            System.out.println(hashMap.get(integer));
        }



    }
}
