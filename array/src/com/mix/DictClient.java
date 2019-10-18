package array;

import java.util.HashMap;

/*
 * DictClient
 * @Author guobin201314@gmail.com on 2019-06-05 14:22
 */
public class DictClient {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>(10);
        hashMap.put("jack", "USA1");
        // 更新覆盖数据
        hashMap.put("jack", "USA2");
        hashMap.put("tom", "USA3");
        System.out.println(hashMap.values());
        System.out.println(hashMap.get("jack"));
    }
}
