/*
 * a_design_create.proxy Main
 * @author GuoBin211 on 2019-05-31 22:55
 */
package a.design.create.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("代理模式...");
        // 静态代理
        IMacSeller iMacSeller = new HKSeller();
        iMacSeller.sell();

        iMacSeller = new USASeller();
        iMacSeller.sell();
    }
}

