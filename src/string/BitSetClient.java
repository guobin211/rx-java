package string;

import java.util.BitSet;

/*
 * BitSetClient
 * @Author guobin201314@gmail.com on 2019-06-05 13:56
 */
public class BitSetClient {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) {
                bitSet1.set(i);
            }
            if ((i % 5) == 0) {
                bitSet2.set(i);
            }
        }

        System.out.println(bitSet1);
        System.out.println(bitSet2);
        // 交集
        bitSet1.and(bitSet2);
        System.out.println(bitSet1);
        // 并集
        bitSet2.or(bitSet1);
        System.out.println(bitSet2);
        // 差集
        bitSet2.xor(bitSet1);
        System.out.println(bitSet2);
    }
}
