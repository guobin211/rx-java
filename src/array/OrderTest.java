package array;

/**
 * @author GuoBin201314@gmail.com on 2018/11/15 23:18
 */
public class OrderTest {
    public static void main(String[] args) {
        int maxSize = 100;
        OrderApp arr;
        arr = new OrderApp(maxSize);
        arr.insert(77);
        arr.insert(33);
        arr.insert(22);
        arr.insert(44);
        arr.insert(55);
        arr.insert(18);
        arr.insert(32);
        arr.insert(42);

        int searchKey = 55;
//        if (arr.find(searchKey) != arr.size()) {
//            System.out.print("找到了" + searchKey);
//        } else {
//            System.out.print("未找到\b");
//        }
        //  数组长度
//        System.out.print(arr.size());
        //  删除
        boolean isSuccess = arr.delete(18);
//        System.out.print(isSuccess);
        //  数组长度
//        System.out.print(arr.size());
        arr.display();
    }
}
