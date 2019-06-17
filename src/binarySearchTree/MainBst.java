package binarySearchTree;

/*
 * MainBst
 * @Author guobin201314@gmail.com on 2019-06-16 22:48
 */
public class MainBst {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {6, 5, 9, 3, 7, 8};
        for (int num : nums) {
            bst.add(num);
        }
        bst.postOrder();
        System.out.println("\n");
        bst.centerOrder();
        System.out.println("\n");
        bst.prevOrder();
        System.out.println("\n前序遍历");
        bst.prevOrderStack();
        System.out.println("\n层序遍历");
        bst.postOrderQueue();
        bst.removeMax();
//        bst.prevOrderStack();
//        System.out.println(bst);
    }
}
