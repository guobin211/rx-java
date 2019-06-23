package tree;

/**
 * MainTree class
 *
 * @author GuoBin
 * @email guobin201314@gmail.com
 * @date 2019-06-23
 */
public class MainTree {
    public static void main(String[] args) {
        Integer[] nums = {-1,-2,-3,4,5,6,-4,8,9,-2};
//        Segment<Integer> segment = new Segment<>(nums, (a, b) -> a + b);
        Segment<Integer> segment = new Segment<>(nums, Integer::sum);

        System.out.println(segment);
        // 线段树的查询
        System.out.println(segment.query(0,2));
    }
}
