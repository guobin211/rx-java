package net;

import java.util.HashMap;

/**
 * HttpParams
 *
 * @author guobin201314@gmail.com on 2019-07-09
 */
public class HttpParams {

    private HashMap<String, String> map = new HashMap<>();

    void set(String key, String val) {
        map.put(key, val);
    }

    void set(String key, int val) {
        map.put(key, val + "");
    }

    public void set(int key, int val) {
        map.put(key + "", val + "");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isFirst = true;
        for (String key : map.keySet()) {
            if (isFirst) {
                stringBuilder.append("?");
                isFirst = false;
            } else {
                stringBuilder.append("&");
            }
            stringBuilder.append(key);
            stringBuilder.append("=");
            stringBuilder.append(map.get(key));
        }
        return stringBuilder.toString();
    }
}
