package heap;

import java.util.*;

/**
 * Solution class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-22
 */
public class Solution {
    private class Freq implements Comparable<Freq> {

        public int e, freq;

        public Freq(int e, int freq) {
            this.e = e;
            this.freq = freq;
        }

        @Override
        public int compareTo(Freq another) {
            return Integer.compare(this.freq, another.freq);
        }

        @Override
        public String toString() {
            return "{ e:" + e + ", freq:" + freq + "}";
        }
    }

    /**
     * 优先队列查找数据
     *
     * @param nums list
     * @param k    要保留的长度
     * @return
     */
    public List<Integer> topFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // 优先队列
        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>();
        // 使用匿名类 自定义比较器
//        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>(new Comparator<Freq>() {
//            @Override
//            public int compare(Freq o1, Freq o2) {
//                return o1.freq - o2.freq;
//            }
//        });

        // 使用箭头函数 自定义比较器
//        PriorityQueue<Freq> priorityQueue = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int key : map.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new Freq(key, map.get(key)));
            } else if (map.get(key) > Objects.requireNonNull(priorityQueue.peek()).freq) {
                priorityQueue.remove();
                priorityQueue.add(new Freq(key, map.get(key)));
            }
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        while (!priorityQueue.isEmpty()) {
            // 出队
            linkedList.add(priorityQueue.remove().e);
        }
        return linkedList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 8, 8, 6, 5, 3, 2, 1, 1, 1};
        int k = 4;

        List<Integer> list = new Solution().topFrequent(nums, k);

        for (int num : list) {
            System.out.println(num);
        }

    }
}
