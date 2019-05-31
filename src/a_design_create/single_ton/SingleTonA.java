/*
 * a_design_create.single_ton SingleTonA
 * @author GuoBin211 on 2019-05-31 20:13
 */
package a_design_create.single_ton;

public class SingleTonA {
    public String name = "SingleTonA";
    private static SingleTonA singleTonA = new SingleTonA();

    private SingleTonA() {
    }

    static SingleTonA getSingleTon() {
        return singleTonA;
    }
}

