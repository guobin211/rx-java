package types;

public class OperatorMath {
    /**
     * 位运算符: 位运算符一定是先把数据转成二进制，然后再运算。
     * &和&&的区别?
     * 		A:&和&&都可以作为逻辑运算，&&具有短路效果。
     * 		B:&还可以作为位运算。
     *
     */
    public static void main(String[] args) {
        //&,|,^,~
        System.out.println(3 & 4);  //0
        System.out.println(3 | 4);  //7
        System.out.println(3 ^ 4);  //7
        System.out.println(~3);     // -4
    }
}
