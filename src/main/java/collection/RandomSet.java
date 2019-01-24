package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * RandomSet
 *
 * @author guobin201314@gmail.com on 2019-01-24
 * @version 1.0.0 by JDK 1.8
 */
public class RandomSet {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Integer> hashSet = new HashSet<>();
        // 生成 10 个 0-20 的随机数
        while (hashSet.size() < 10) {
            hashSet.add(random.nextInt(20) + 1);
        }

        hashSet.forEach(RandomSet::printSet);

        // 系统输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        HashSet<Character> characterHashSet = new HashSet<>();
        // 接收string
        String line= scanner.nextLine();
        // 字符类型
        char[] arr = line.toCharArray();
        // 去除重复
        for (char c: arr) {
            characterHashSet.add(c);
        }
        // 包装类型
        for (Character c :characterHashSet) {
            System.out.println(c);
        }
    }

    public static void printSet(Integer el) {
        System.out.println(el);
    }

}
