package math;

/**
 * @author GuoBin201314@gmail.com on 2018/11/16 11:15
 */
public class Loop {
    public static void main(String[] args) {
        whileLoop(2);
        forLoop(13);
        forStrong();
    }

    private static void whileLoop(int num) {
        int a = 5;
        int i = 1;
        while (num < a) {
            System.out.print("while num lower then a" + i + "\n");
            i++;
            num++;
        }
    }

    private static void forLoop(int num) {
        int a = 10;
        for (int x = a; x < num; x = x + 1) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }

    private static void forStrong() {
        int[] numbers = {10, 20, 30, 40, 50};
        //  forEach()
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        //  forEach()
        java.lang.String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (java.lang.String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
